package com.company.mysql;

public abstract class RunSqlQuery {

    public abstract void connectToSQL();

    public abstract void login();

    public abstract void runQuery();

    public abstract void serializeToJson();

    public abstract void closeConnection();

    public final void run() {
        connectToSQL(); // 1
        login(); // 2
        runQuery(); // 3
        serializeToJson(); // 4
        closeConnection(); // 5
    }

}
