package com.company.Repository;

import com.company.Entity.SaipaEnti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SaipaRepo  implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public SaipaRepo()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","saipa","myjava123");
        connection.setAutoCommit(false);
    }
    public void insert(SaipaEnti saipaEnti)throws Exception{
        preparedStatement=connection.prepareStatement("insert into mashin(id,name,price,color)values (?,?,?,?)");
        preparedStatement.setLong(1,saipaEnti.getId());
        preparedStatement.setString(2,saipaEnti.getName());
        preparedStatement.setLong(3,saipaEnti.getPrice());
        preparedStatement.setString(4,saipaEnti.getColor());
        preparedStatement.executeUpdate();
    }
    public void delete(int id)throws Exception{
        preparedStatement=connection.prepareStatement("delete from mashin where id=?");
        preparedStatement.setLong(1,id);
        preparedStatement.executeUpdate();
    }

    public void rollback()throws Exception{
        connection.rollback();
    }
    public void commit()throws Exception{
        connection.commit();
    }
    public void close()throws Exception{
        connection.close();
        preparedStatement.close();
    }
}
