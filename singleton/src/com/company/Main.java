package com.company;

public class Main {

    public static void main(String[] args) {

        //Singleton singleton = new Singleton();
        //Singleton singleton2 = new Singleton();
        //Singleton s1 = Singleton.foo();
        //Singleton s2 = Singleton.foo();

        Singleton.getInstance().writeLog("Program started!");
        Singleton.getInstance().writeLog("Program ended!");

        Circle c1 = new Circle(4.5f);
        Circle c2 = new Circle(9.2f);
        Circle c3 = new Circle(0.15f);
        System.out.println(Circle.PIE);

        Clock.getInstance().showTime();
        Clock.getInstance().showTime();
        Clock.getInstance().showTime();
    }
}
