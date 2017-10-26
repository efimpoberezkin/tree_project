package com.epam.homework.tree_project.tree;

import com.epam.homework.tree_project.tree.traversal.DfsTreeTraversal;
import com.epam.homework.tree_project.tree.traversal.TreeTraversalAlgorithm;

import java.util.*;

public class Node implements IterableStructure<Node> {

    private int data;
    private Node parent;
    private List<Node> children;
    private TreeTraversalAlgorithm traversal;

    public Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public List<Node> getChildren() {
        return children;
    }

    public Node addChild(int data) {
        Node childNode = new Node(data);
        childNode.parent = this;
        this.children.add(childNode);
        return childNode;
    }

    public void setTraversalAlgorithm(TreeTraversalAlgorithm traversal) {
        this.traversal = traversal;
    }

    public void print() {
        if (isRoot()) {
            System.out.println("root, value " + data);
        } else if (isLeaf()) {
            System.out.println("leaf, value " + data);
        } else {
            System.out.println("branch, value " + data);
        }
    }

    protected boolean isRoot() {
        return parent == null;
    }

    protected boolean isLeaf() {
        return children.isEmpty();
    }

    @Override
    public void accept(IterableStructureVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * returns iterator over elements of the tree, starting with the current node as a root,
     * in a certain sequence according to traversal algorithm that was set (DFS by default)
     */
    @Override
    public Iterator<Node> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<Node> {

        int cursor;
        List<Node> orderOfTraversal;

        private Itr() {
            TreeTraversalAlgorithm traversal =
                    (Node.this.traversal == null)
                            ? new DfsTreeTraversal() //setting DFS as default traversal algorithm
                            : Node.this.traversal;
            orderOfTraversal = traversal.getOrder(Node.this);
        }

        @Override
        public boolean hasNext() {
            return cursor < orderOfTraversal.size();
        }

        @Override
        public Node next() {
            int i = cursor;
            if (i >= orderOfTraversal.size())
                throw new NoSuchElementException();
            cursor = i + 1;
            return orderOfTraversal.get(i);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove not supported");
        }
    }
}
