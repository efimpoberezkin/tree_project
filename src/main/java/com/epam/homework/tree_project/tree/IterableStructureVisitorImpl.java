package com.epam.homework.tree_project.tree;

public class IterableStructureVisitorImpl implements IterableStructureVisitor {

    @Override
    public void visit(TreeNode treeNode) {
        if (treeNode.isRoot()) {
            System.out.println("I found root");
        } else if (treeNode.isLeaf()) {
            System.out.println("I found leaf");
        } else {
            System.out.println("I found branch");
        }
    }
}
