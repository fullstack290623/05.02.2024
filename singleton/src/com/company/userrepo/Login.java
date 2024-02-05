package com.company.userrepo;

import java.util.Arrays;
import java.util.List;

public class Login {

    // for fun Singleton

    private static Login instance;

    private Login() {
    }

    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }
        return instance;
    }

    public User tryLogin(String name) {
        List<String> customers = List.of("Olivia", "Daniel", "Victoria", "Shalom");
        List<String> airlines = List.of("Elal", "Emirates", "United", "Wizzair");
        List<String> admins = List.of("Paul", "Jack", "Boris");

        if (name.isEmpty() || name.isBlank()) {
            return new Anonymous();
        }
        if (customers.contains(name)) {
            return new Customer();
        }
        if (airlines.contains(name)) {
            return new Airline();
        }
        if (admins.contains(name)) {
            return new Admin();
        }

        return null;
    }
}
