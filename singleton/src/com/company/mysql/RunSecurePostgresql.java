package com.company.mysql;

public class RunSecurePostgresql extends RunPostgreSQlQuery {

    @Override
    public void login() {
        System.out.println("Secure postgersql login.");
    }

}
