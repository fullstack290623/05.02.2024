package com.company.mysql;

public class RunPostgreSQlQuery extends RunSqlQuery {
    @Override
    public void connectToSQL() {
        System.out.println("postgresql connecting to db...");
    }

    @Override
    public void login() {

    }

    @Override
    public void runQuery() {
        System.out.println("run postgresql query");
    }

    @Override
    public void serializeToJson() {
        System.out.println("postgresql serialize");
    }

    @Override
    public void closeConnection() {
        System.out.println("closing db");
    }
}
