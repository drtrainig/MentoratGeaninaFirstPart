package com.itfactory.cap2;

public class Main {

    public static void main(String[] args) {
        printeazaMesaj(new ImprimantaAlbNegru());
        printeazaMesaj(new ImprimantaColor());
    }

    public static void printeazaMesaj(Imprimanta imprimanta) {
        imprimanta.printeaza("Mesaj");
    }

}
