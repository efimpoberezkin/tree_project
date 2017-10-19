package com.epam.homework.tree_project;

import com.epam.homework.tree_project.tree.TreeNode;

public class ExampleTrees {

    public static TreeNode getTree1() {
        TreeNode root = new TreeNode(-1);
        {
            TreeNode node0 = root.addChild(0);
            TreeNode node1 = root.addChild(1);
            {
                TreeNode node10 = node1.addChild(10);
                {
                    TreeNode node100 = node10.addChild(100);
                    TreeNode node101 = node10.addChild(101);
                }
                TreeNode node11 = node1.addChild(11);
            }
            TreeNode node2 = root.addChild(2);
            {
                TreeNode node20 = node2.addChild(20);
                TreeNode node21 = node2.addChild(21);
            }
            TreeNode node3 = root.addChild(3);
            {
                TreeNode node30 = node3.addChild(30);
                {
                    TreeNode node300 = node30.addChild(300);
                }
            }
        }

        return root;
    }

    public static TreeNode getTree2() {
        TreeNode root = new TreeNode(-1);
        {
            TreeNode node0 = root.addChild(0);
            TreeNode node1 = root.addChild(1);
            TreeNode node2 = root.addChild(2);
            {
                TreeNode node20 = node2.addChild(20);
                TreeNode node21 = node2.addChild(21);
                {
                    TreeNode node210 = node21.addChild(210);
                    TreeNode node211 = node21.addChild(211);
                }
            }
            TreeNode node3 = root.addChild(3);
            {
                TreeNode node30 = node3.addChild(30);
            }
        }

        return root;
    }
}
