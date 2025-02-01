package org.example.test;

import org.example.test.domain.ClassAbstract;
import org.example.test.domain.ClassOne;
import org.example.test.domain.ClassTwo;

public class Main {

    public static void main(String[] args) {

        ClassAbstract one = new ClassOne();
        one = new ClassTwo(one);
        one = new ClassTwo(one);

        one.getDescription();

    }
}
