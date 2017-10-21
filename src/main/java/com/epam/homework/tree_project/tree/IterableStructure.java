package com.epam.homework.tree_project.tree;

public interface IterableStructure<T> extends Iterable<T> {

    void accept(IterableStructureVisitor visitor);
}
