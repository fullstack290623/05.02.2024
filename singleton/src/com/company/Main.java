package com.company;

import com.company.mysql.RunPostgreSQlQuery;
import com.company.mysql.RunSecurePostgresql;
import com.company.userrepo.Login;
import com.company.userrepo.User;

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

        User paul = Login.getInstance().tryLogin("Paul");
        System.out.println(paul);

        // create package called geometry
        // create class point
        // create class line
        // create class triangle
        // create class square

        RunPostgreSQlQuery post = new RunPostgreSQlQuery();
        post.run();
        System.out.println("============================");
        RunSecurePostgresql runs = new RunSecurePostgresql();
        runs.run();

        // create template methods
        // ShapeDrawer with these steps
        // 1. clear shape
        // 2. draw border
        // 3. fill shape with color
        // 4. refine
        // implement the sequence with DrawShape2D (just println each step)
        // create inheritor called DrawShape2DNoFill which does not fill with color (empty method)
        // implement the sequence with DrawShape3D (just println each step), without border
        // run the DrawShape2DNoFill
    }
}
