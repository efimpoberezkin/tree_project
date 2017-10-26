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
            addReversed(stack, node.getChildren());
        }

        return orderedList;
    }

    private void addReversed(Stack stack, List list) {
        for (int i = list.size()-1; i>=0; i--) {
            stack.push(list.get(i));
        }
    }
}
