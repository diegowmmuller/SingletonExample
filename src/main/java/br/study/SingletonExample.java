package br.study;

import java.util.Objects;

public class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample(){
        System.out.println("Instancia unica criada");
    }

    public static synchronized SingletonExample getInstance(){
        if(Objects.isNull(instance)){
            instance = new SingletonExample();
        }
        return instance;
    }
}
