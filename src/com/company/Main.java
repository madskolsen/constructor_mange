package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        double b = 10.0;
        boolean x = false;
        String tekst = "Hej med dig";




        ConstructorEksempel x0 = new ConstructorEksempel(a);
        ConstructorEksempel x1 = new ConstructorEksempel(a,b);
        ConstructorEksempel x2 = new ConstructorEksempel(a,x);
        ConstructorEksempel x3 = new ConstructorEksempel(a,tekst);
        ConstructorEksempel x4 = new ConstructorEksempel(b);
        ConstructorEksempel x5 = new ConstructorEksempel(b,x);
        ConstructorEksempel x6 = new ConstructorEksempel(b,tekst);
        ConstructorEksempel x7 = new ConstructorEksempel(x,tekst);
        ConstructorEksempel x8 = new ConstructorEksempel(a,b,x,tekst);
        ConstructorEksempel x9 = new ConstructorEksempel(a,b,x);
        ConstructorEksempel x10 = new ConstructorEksempel(a,b,tekst);
        ConstructorEksempel x11 = new ConstructorEksempel(b,x,tekst);
        ConstructorEksempel x12 = new ConstructorEksempel(a,x,tekst);
        


    }
}
