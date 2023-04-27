package com.library;

import java.sql.*;


public class DatabaseHandler {
    static final String DB_URL = "jdbc:mysql://localhost:3306/student_db";
        DatabaseHandler handler;
        Connection conn = null;
        Statement statement = null;


    public DatabaseHandler() {
        createConnection();
        setupBookTable();
    }
    void createConnection() {
        try {
           // Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            conn  = DriverManager.getConnection(DB_URL,"root","Gwiwwcns@2010");
        } catch (Exception e) {
            e.printStackTrace();
        }
    } void setupBookTable() {
        String TABLE_NAME = "BOOK";
        try {
            statement = conn.createStatement();

            DatabaseMetaData dbm = conn.getMetaData();
            ResultSet tables = dbm.getTables(null, null, TABLE_NAME.toUpperCase(), null);

            if (tables.next()) {
                System.out.println("Table " + TABLE_NAME + "already exists. Ready for go!");
            } else {
                statement.execute("CREATE TABLE " + TABLE_NAME + "("
                        + "	id varchar(200) primary key,\n"
                        + "	title varchar(200),\n"
                        + "	author varchar(200),\n"
                        + "	publisher varchar(100),\n"
                        + "	isAvail boolean default true"
                        + " )");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage() + " --- setupDatabase");
        } finally {
        }
    }
}