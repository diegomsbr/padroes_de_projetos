package org.example.singleton.domain;


// mas caso não for um problema de performance criar esta classe na inicializacao, seria somente
// private volatile static MyClass instance = new MyCalss();
// e no getInstance() retornar instance


public class MyClass {

    private volatile static MyClass instance;

    private MyClass() {
    }

    public static  MyClass getInstance() {

        if (instance == null) {
            synchronized (MyClass.class) {
                if (instance == null) {
                    instance = new MyClass();
                }
            }
        }
        return instance;
    }
}
