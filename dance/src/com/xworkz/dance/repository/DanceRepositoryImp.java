package com.xworkz.dance.repository;

import com.xworkz.dance.dto.DanceDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DanceRepositoryImp implements DanceRepository{
    @Override
    public String save(DanceDTO danceDTO) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/dancedb";
            String username="root";
            String password="Xworkzodc@123";

            //create a connection
            Connection connection = DriverManager.getConnection(url,username,password);

            //prepare the statement
            String sql = "insert into dancedetails values(0,  '"+danceDTO.getName()+"', "+danceDTO.getAge()+", '"+danceDTO.getGender()+"','"+danceDTO.getStyle()+"', '"+danceDTO.getExperience()+"', '"+danceDTO.getAvailability()+"', '"+danceDTO.getPhone()+"', '"+danceDTO.getAddress()+"')";

            Statement statement = connection.createStatement();

            //Execute the statement

            statement.executeUpdate(sql);
            System.out.println(connection);


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


        return "false";
    }
}
