package com.itfactory.cap2;

public class ImprimantaColor implements Imprimanta {

    @Override
    public void printeaza(String mesaj) {
        System.out.println("Printeaza color " + mesaj);
    }
}
