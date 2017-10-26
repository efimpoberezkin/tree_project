package com.epam.homework.tree_project.tree.traversal;

import com.epam.homework.tree_project.tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsTreeTraversal implements TreeTraversalAlgorithm {

    @Override
    public List<Node> getOrder(Node root) {
        List<Node> orderedList = new ArrayList<>();

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            orderedList.add(node);
            queue.addAll(node.getChildren());
        }

        return orderedList;
    }
}
