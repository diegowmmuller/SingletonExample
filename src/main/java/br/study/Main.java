package br.study;


public class Main {
    public static void main(String[] args) {

        SingletonExample s1 = SingletonExample.getInstance();
        SingletonExample s2 = SingletonExample.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        /*
        * output:
        *
        *   Instancia unica criada
        *   br.study.SingletonExample@2a84aee7
        *   br.study.SingletonExample@2a84aee7
        *
        * */



    }
}