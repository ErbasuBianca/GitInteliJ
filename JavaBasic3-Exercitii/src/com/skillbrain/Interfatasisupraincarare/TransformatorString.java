package com.skillbrain.Interfatasisupraincarare;

public class TransformatorString implements Transformabil{
    @Override
    public void transforma(String input) {
        System.out.println("Transformat in litere mari: " + input.toUpperCase());
    }
}
