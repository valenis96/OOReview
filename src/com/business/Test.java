package com.business;

//incapsulamento
abstract class Class1{

    //le classi possono essere public o di default

    public int d; //visibile anche ad altre package, sia che instanzi sia che erediti
    int b; //visibile a livello di package
    private int a; //visibile solo internamente alla classe
    protected int c; //visibile solo dalle classi più specifiche di Class1
                    // => non visibile in caso di instanziazione diretta

    //classe innestata
    private class class2 {

    }

    final void m1 () {};
    void  m2 () {};

    //final prima di una classe non permette l'eredità della classe
    //final prima di un metodo non permette l'override
}

//ereditarietà

final class Class3 extends Class1{

}
public class Test {

    public static void main(String[] args) {

    }

}
