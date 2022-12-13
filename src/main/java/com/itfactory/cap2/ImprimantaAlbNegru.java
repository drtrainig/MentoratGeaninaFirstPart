package com.itfactory.cap2;

public class ImprimantaAlbNegru implements Imprimanta {

    @Override
    public void printeaza(String mesaj) {
        System.out.println("Am printat alb negru " + mesaj);
    }

}
