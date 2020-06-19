package com.company.Repository;

import com.company.Entity.KarbarEnti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class KarbarRepo implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public  KarbarRepo() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","karbar","myjava123");
        connection.setAutoCommit(false);
    }
    public void insert(KarbarEnti karbarEnti)throws Exception{
        preparedStatement=connection.prepareStatement("insert into karbar(name,password,hesab)values (?,?,?)");
        preparedStatement.setString(1,karbarEnti.getName());
        preparedStatement.setLong(2,karbarEnti.getPassword());
        preparedStatement.setLong(3,karbarEnti.getHesab());
        preparedStatement.executeUpdate();
    }
    public void update(KarbarEnti karbarEnti)throws Exception{
        preparedStatement=connection.prepareStatement("update karbar set hesab=? where name=?");
        preparedStatement.setString(2,karbarEnti.getName());
        preparedStatement.setLong(1,karbarEnti.getHesab());
        preparedStatement.executeUpdate();
    }
    public void commit()throws Exception{
        connection.commit();
        }
    public void rollack()throws Exception{
        connection.rollback();
    }
    public void close()throws Exception{
        connection.close();
        preparedStatement.close();
    }
    }
