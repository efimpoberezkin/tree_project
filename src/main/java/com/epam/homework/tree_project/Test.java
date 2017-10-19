package com.epam.homework.tree_project;

import com.epam.homework.tree_project.tree.TreeNode;
import com.epam.homework.tree_project.tree.traversal.BfsTreeTraversal;
import com.epam.homework.tree_project.tree.traversal.DfsTreeTraversal;

public class Test {

    public static void main(String[] args) {
        perform_test();
    }

    private static void perform_test() {
        TreeNode treeRoot = ExampleTrees.getTree1();
        //TreeNode treeRoot = ExampleTrees.getTree2();

        System.out.println("-- DFS --");
        treeRoot.setTraversalAlgorithm(new DfsTreeTraversal());
        treeRoot.forEach(TreeNode::print);

        System.out.println("\n-- BFS --");
        treeRoot.setTraversalAlgorithm(new BfsTreeTraversal());
        treeRoot.forEach(TreeNode::print);
    }
}
