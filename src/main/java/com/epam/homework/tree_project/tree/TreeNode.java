package com.epam.homework.tree_project.tree;

import com.epam.homework.tree_project.tree.traversal.DfsTreeTraversal;
import com.epam.homework.tree_project.tree.traversal.TreeTraversalAlgorithm;

import java.util.*;

public class TreeNode implements Iterable<TreeNode> {

    private int data;
    private TreeNode parent;
    private List<TreeNode> children;
    private TreeTraversalAlgorithm traversal;

    public TreeNode(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public TreeNode addChild(int data) {
        TreeNode childNode = new TreeNode(data);
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

    private boolean isRoot() {
        return parent == null;
    }

    private boolean isLeaf() {
        return children.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator {

        int cursor;
        List<TreeNode> orderOfTraversal;

        private Itr() {
            TreeTraversalAlgorithm traversal =
                    (TreeNode.this.traversal == null)
                            ? new DfsTreeTraversal() //setting DFS as default traversal algorithm
                            : TreeNode.this.traversal;
            orderOfTraversal = traversal.getOrder(TreeNode.this);
        }

        @Override
        public boolean hasNext() {
            return cursor < orderOfTraversal.size();
        }

        @Override
        public TreeNode next() {
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
