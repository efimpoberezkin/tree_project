package com.epam.homework.tree_project;

import com.epam.homework.tree_project.tree.Node;
import com.epam.homework.tree_project.tree.Tree;

public class ExampleTrees {

    public static Tree getTree1() {
        Node root = new Node(-1);
        {
            Node node0 = root.addChild(0);
            Node node1 = root.addChild(1);
            {
                Node node10 = node1.addChild(10);
                {
                    Node node100 = node10.addChild(100);
                    Node node101 = node10.addChild(101);
                }
                Node node11 = node1.addChild(11);
            }
            Node node2 = root.addChild(2);
            {
                Node node20 = node2.addChild(20);
                Node node21 = node2.addChild(21);
            }
            Node node3 = root.addChild(3);
            {
                Node node30 = node3.addChild(30);
                {
                    Node node300 = node30.addChild(300);
                }
            }
        }

        Tree tree = new Tree(root);
        return tree;
    }

    public static Tree getTree2() {
        Node root = new Node(-1);
        {
            Node node0 = root.addChild(0);
            Node node1 = root.addChild(1);
            Node node2 = root.addChild(2);
            {
                Node node20 = node2.addChild(20);
                Node node21 = node2.addChild(21);
                {
                    Node node210 = node21.addChild(210);
                    Node node211 = node21.addChild(211);
                }
            }
            Node node3 = root.addChild(3);
            {
                Node node30 = node3.addChild(30);
            }
        }

        Tree tree = new Tree(root);
        return tree;
    }
}
