package com.company;

import java.time.LocalDateTime;

public class Clock {

    public void showTime() {
        System.out.println(LocalDateTime.now() + " **** " + LocalDateTime.now() + " ****");
    }

}
