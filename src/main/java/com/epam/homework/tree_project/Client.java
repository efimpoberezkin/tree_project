package com.epam.homework.tree_project;

import com.epam.homework.tree_project.tree.IterableStructure;
import com.epam.homework.tree_project.tree.IterableStructureVisitor;
import com.epam.homework.tree_project.tree.IterableStructureVisitorImpl;
import com.epam.homework.tree_project.tree.Node;
import com.epam.homework.tree_project.tree.traversal.BfsTreeTraversal;
import com.epam.homework.tree_project.tree.traversal.DfsTreeTraversal;

public class Client {

    public static void main(String[] args) {
        perform_test();
    }

    private static void perform_test() {

        System.out.println("### Testing different traversal algorithms ###\n");

        Node treeRoot = ExampleTrees.getTree1();
        //Node treeRoot = ExampleTrees.getTree2();

        System.out.println("-- DFS --");
        treeRoot.setTraversalAlgorithm(new DfsTreeTraversal());
        treeRoot.forEach(Node::print);

        System.out.println("\n-- BFS --");
        treeRoot.setTraversalAlgorithm(new BfsTreeTraversal());
        treeRoot.forEach(Node::print);


        System.out.println("\n### Testing visitor ###\n");

        IterableStructure<Node> iterableStructure = ExampleTrees.getTree1();
        IterableStructureVisitor visitor = new IterableStructureVisitorImpl();

        iterableStructure.forEach(element -> element.accept(visitor));
    }
}
