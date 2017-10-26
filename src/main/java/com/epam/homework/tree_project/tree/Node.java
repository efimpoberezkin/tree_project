package com.epam.homework.tree_project.tree;

import java.util.*;

public class Node {

    private int data;
    private Node parent;
    private List<Node> children;

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
}
