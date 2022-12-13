package com.itfactory.cap5;

public class Finally {
    public static void main(String[] args){
        try {
            doAgainSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void doAgainSomething() throws Exception {
        try {
            doSomething();
        } catch (Exception e) {
            throw new Exception("New");
        } finally {
            System.out.println("FINALLY");
        }
    }

    public static void doSomething() throws Exception {
        throw new Exception("Ex");
    }
}
