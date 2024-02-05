package com.company;

import java.time.LocalDateTime;

public class Clock {

    // 2
    private static Clock instance;

    // 1
    private Clock() {

    }

    public void showTime() {
        System.out.println(LocalDateTime.now() + " **** " + LocalDateTime.now() + " ****");
    }

    // 3
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

}
