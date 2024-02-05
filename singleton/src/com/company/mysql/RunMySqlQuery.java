package com.company.mysql;

public class RunMySqlQuery extends RunSqlQuery {
    @Override
    public void connectToSQL() {
        System.out.println("Mysql connecting to db...");
    }

    @Override
    public void login() {

    }

    @Override
    public void runQuery() {
        System.out.println("run mysql query");
    }

    @Override
    public void serializeToJson() {
        System.out.println("mysql serialize");
    }

    @Override
    public void closeConnection() {
        System.out.println("closing db");
    }
}
