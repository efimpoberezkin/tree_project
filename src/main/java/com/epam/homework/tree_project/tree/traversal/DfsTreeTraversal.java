package com.epam.homework.tree_project.tree.traversal;

import com.epam.homework.tree_project.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DfsTreeTraversal implements TreeTraversalAlgorithm {

    @Override
    public List<TreeNode> getOrder(TreeNode root) {
        List<TreeNode> orderedList = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            orderedList.add(node);
            List children = new ArrayList(node.getChildren());
            Collections.reverse(children);
            stack.addAll(children);
        }

        return orderedList;
    }
}
