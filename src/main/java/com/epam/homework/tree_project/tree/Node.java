package com.epam.homework.tree_project.tree;

import java.util.*;

public class Node {

    private int data;
    private boolean root;
    private List<Node> children;

    public Node(int data, boolean root) {
        this.data = data;
        this.root = root;
        this.children = new ArrayList<>();
    }

    public List<Node> getChildren() {
        return children;
    }

    public Node addChild(int data) {
        Node childNode = new Node(data, false);
        this.children.add(childNode);
        return childNode;
    }

    public void print() {
        if (root) {
            System.out.println("root, value " + data);
        } else if (isLeaf()) {
            System.out.println("leaf, value " + data);
        } else {
            System.out.println("branch, value " + data);
        }
    }

    protected boolean isRoot() {
        return root;
    }

    protected boolean isLeaf() {
        return children.isEmpty();
    }
}
