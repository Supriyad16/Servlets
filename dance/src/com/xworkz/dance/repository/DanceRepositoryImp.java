package com.xworkz.dance.repository;

import com.xworkz.dance.constant.DBConstant;
import com.xworkz.dance.dto.DanceDTO;

import java.sql.*;

public class DanceRepositoryImp implements DanceRepository{
    @Override
    public String save(DanceDTO danceDTO) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/dancedb";
//            String username="root";
//            String password="Xworkzodc@123";

            //create a connection
            Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(),DBConstant.USERNAME.getProp(),DBConstant.SECRET.getProp());


            //prepare the statement
//            String sql = "insert into dancedetails values(0, '"+danceDTO.getName()+"', "+danceDTO.getAge()+", '"+danceDTO.getGender()+"','"+danceDTO.getStyle()+"', '"+danceDTO.getExperience()+"', '"+danceDTO.getAvailability()+"', '"+danceDTO.getPhone()+"', '"+danceDTO.getAddress()+"')";
//            Statement statement = connection.createStatement();
            //Execute the statement
//            statement.executeUpdate(sql);
//

            String noConcatenateSql = "insert into dancedetails values(?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(noConcatenateSql);
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2,danceDTO.getName());
            preparedStatement.setInt(3,danceDTO.getAge());
            preparedStatement.setString(4,danceDTO.getGender());
            preparedStatement.setString(5,danceDTO.getStyle());
            preparedStatement.setString(6,danceDTO.getExperience());
            preparedStatement.setBoolean(7,danceDTO.getAvailability());
            preparedStatement.setLong(8,danceDTO.getPhone());
            preparedStatement.setString(9,danceDTO.getAddress());

            preparedStatement.executeUpdate();

            System.out.println(connection);


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "false";
    }

    @Override
    public DanceDTO findById(int id) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/dancedb";
//            String username = "root";
//            String password ="Xworkzodc@123";

            Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(),DBConstant.USERNAME.getProp(),DBConstant.SECRET.getProp());

            String sql = "Select * from dancedetails where id = "+id+" ";

            System.out.println("sql" +sql);

            Statement statement = connection.createStatement();

            System.out.println(connection);
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("resultset " + resultSet);

            while(resultSet.next()){

                int pk = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                String style = resultSet.getString("style");
                String experience = resultSet.getString("experienxe");
                Boolean availability = resultSet.getBoolean("availability");
                Long phone = resultSet.getLong("phone");
                String address = resultSet.getString("address");

               DanceDTO danceDTO = new DanceDTO(name,age, gender, style, experience, availability, phone, address);
               danceDTO.setId(pk);

                System.out.println(danceDTO);

                System.out.println("name: "+name+ " age: "+age+"gender: "+gender+"style: "+style+"experince "+experience+"availability: "+availability);

               return danceDTO;
            }


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}


