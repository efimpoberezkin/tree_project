package com.epam.homework.tree_project.tree;

public class IterableStructureVisitorImpl implements IterableStructureVisitor {

    @Override
    public void visit(Tree tree) {
        for (Node node : tree) {
            if (node.isRoot()) {
                System.out.println("I found root");
            } else if (node.isLeaf()) {
                System.out.println("I found leaf");
            } else {
                System.out.println("I found branch");
            }
        }
    }
}
