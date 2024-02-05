package com.company;

import java.time.LocalDateTime;

public class Singleton {

    // 1
    private static Singleton instance = null;

    // 2
    private Singleton() {
    }

    public void writeLog(String msg) {
        System.out.println(LocalDateTime.now() + " **** " + msg + " ****");
    }

    // 3
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
