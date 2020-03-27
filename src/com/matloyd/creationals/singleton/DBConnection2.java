package com.matloyd.creationals.singleton;


public class DBConnection2 {

    private DBConnection2() {
    }

    private static class DBConnectionHelper{
        private static final DBConnection2 dbConnection2 = new DBConnection2();
    }

    public static DBConnection2 getInstance() {
        return DBConnectionHelper.dbConnection2;
    }
}
