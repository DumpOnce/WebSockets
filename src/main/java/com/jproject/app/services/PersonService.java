package com.jproject.app.services;

import com.jproject.app.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.postgresql.Driver;

@Service
public class PersonService {

    private String name = "admin";
    private String pas = "admin";
    private String url = "jdbc:postgresql://localhost:54321/db-dev";


    public PersonService() {
    }


    public void something(){
    }

    public void addPerson(Person person){

    }
    public int getNumOfAllUsers() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(url,name,pas);
        Statement s = connection.createStatement();
        s.executeQuery("CREATE TABLE mans1(field TEXT NOT NULL);");
        return 0;
    }

}
