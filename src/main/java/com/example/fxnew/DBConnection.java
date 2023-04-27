package com.example.fxnew;

import java.sql.*;


public class DBConnection {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","Gwiwwcns@2010");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from student");
        System.out.println("name"+"\t"+"age"+
                "\t"+"sex"+"\t"+"course");
        while (resultSet.next()){
            System.out.println(resultSet.getString("name")+"\t"+resultSet.getString("age")+
                    "\t"+resultSet.getString("sex")+"\t"+resultSet.getString("course"));
        }
    }
}
