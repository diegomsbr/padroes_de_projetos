package org.example.singleton;

import org.example.singleton.domain.MyClass;

public class Singleton {

    public static void main (String[] args) {

        MyClass object1 = MyClass.getInstance();
        MyClass object2 = MyClass.getInstance();

        System.out.println(object1 == object2);
    }
}
