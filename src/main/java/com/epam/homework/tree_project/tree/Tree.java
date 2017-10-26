package com.epam.homework.tree_project.tree;

import com.epam.homework.tree_project.tree.traversal.DfsTreeTraversal;
import com.epam.homework.tree_project.tree.traversal.TreeTraversalAlgorithm;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Tree implements IterableStructure<Node> {

    private Node root;
    private TreeTraversalAlgorithm traversal;

    public Tree(Node root) {
        this.root = root;
    }

    public void setTraversalAlgorithm(TreeTraversalAlgorithm traversal) {
        this.traversal = traversal;
    }

    @Override
    public void accept(IterableStructureVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * returns iterator over elements of the tree, starting with the root,
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
                    (Tree.this.traversal == null)
                            ? new DfsTreeTraversal() //setting DFS as default traversal algorithm
                            : Tree.this.traversal;
            orderOfTraversal = traversal.getOrder(Tree.this.root);
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
