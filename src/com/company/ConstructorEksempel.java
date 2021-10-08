package com.company;

public class ConstructorEksempel {
    int a;
    double b;
    boolean x;
    String tekst;

    ConstructorEksempel(int a, double b, boolean x, String tekst){
        this.a = a;
        this.b = b;
        this.x = x;
        this.tekst = tekst;
    }

    public ConstructorEksempel(int a) {
        this.a = a;
    }

    public ConstructorEksempel(double b) {
        this.b = b;
    }

    public ConstructorEksempel(boolean x) {
        this.x = x;
    }

    public ConstructorEksempel(String tekst) {
        this.tekst = tekst;
    }

    public ConstructorEksempel(int a, double b) {
        this.a = a;
        this.b = b;
    }

    public ConstructorEksempel(int a, boolean x) {
        this.a = a;
        this.x = x;
    }

    public ConstructorEksempel(int a, String tekst) {
        this.a = a;
        this.tekst = tekst;
    }

    public ConstructorEksempel(double b, boolean x) {
        this.b = b;
        this.x = x;
    }

    public ConstructorEksempel(double b, String tekst) {
        this.b = b;
        this.tekst = tekst;
    }

    public ConstructorEksempel(boolean x, String tekst) {
        this.x = x;
        this.tekst = tekst;
    }

    public ConstructorEksempel(int a, double b, boolean x) {
        this.a = a;
        this.b = b;
        this.x = x;
    }

    public ConstructorEksempel(double b, boolean x, String tekst) {
        this.b = b;
        this.x = x;
        this.tekst = tekst;
    }

    public ConstructorEksempel(int a, boolean x, String tekst) {
        this.a = a;
        this.x = x;
        this.tekst = tekst;
    }

    public ConstructorEksempel(int a, double b, String tekst) {
        this.a = a;
        this.b = b;
        this.tekst = tekst;
    }
}
