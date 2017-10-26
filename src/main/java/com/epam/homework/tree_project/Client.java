package com.epam.homework.tree_project;

import com.epam.homework.tree_project.tree.*;
import com.epam.homework.tree_project.tree.traversal.BfsTreeTraversal;
import com.epam.homework.tree_project.tree.traversal.DfsTreeTraversal;

public class Client {

    public static void main(String[] args) {
        perform_test();
    }

    private static void perform_test() {

        System.out.println("### Testing different traversal algorithms ###\n");

        Tree tree = ExampleTrees.getTree1();
        //Tree tree = ExampleTrees.getTree2();

        System.out.println("-- DFS --");
        tree.setTraversalAlgorithm(new DfsTreeTraversal());
        tree.forEach(Node::print);

        System.out.println("\n-- BFS --");
        tree.setTraversalAlgorithm(new BfsTreeTraversal());
        tree.forEach(Node::print);


        System.out.println("\n### Testing visitor ###\n");

        IterableStructure<Node> iterableStructure = ExampleTrees.getTree1();
        IterableStructureVisitor visitor = new IterableStructureVisitorImpl();

        iterableStructure.accept(visitor);
    }
}
