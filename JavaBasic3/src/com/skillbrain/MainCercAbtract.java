package com.skillbrain;

public class MainCercAbtract {

    public static void main(String[] args) {
        Cerc cerc = new Cerc(3.4, 10.1, -5.6);

        System.out.println(cerc.raza);
        System.out.println(cerc.x);
        System.out.println(cerc.y);

        System.out.println(cerc.getX());
        System.out.println(cerc.getY());

        System.out.println(cerc.aria());
        System.out.println(cerc.perimetru());
    }
}
