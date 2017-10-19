package com.epam.homework.tree_project.tree.traversal;

import com.epam.homework.tree_project.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsTreeTraversal implements TreeTraversalAlgorithm {

    @Override
    public List<TreeNode> getOrder(TreeNode root) {
        List<TreeNode> orderedList = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            orderedList.add(node);
            queue.addAll(node.getChildren());
        }

        return orderedList;
    }
}
