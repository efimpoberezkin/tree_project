package com.epam.homework.tree_project.tree.traversal;

import com.epam.homework.tree_project.tree.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DfsTreeTraversal implements TreeTraversalAlgorithm {

    @Override
    public List<Node> getOrder(Node root) {
        List<Node> orderedList = new ArrayList<>();

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            orderedList.add(node);
            List children = new ArrayList(node.getChildren());
            Collections.reverse(children);
            stack.addAll(children);
        }

        return orderedList;
    }
}
