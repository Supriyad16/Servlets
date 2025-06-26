package com.xworkz.eommerce.repository;

import com.xworkz.eommerce.constant.DBConstant;
import com.xworkz.eommerce.dto.EcommerceDTO;

import java.sql.*;

public class EcommerceRepositoryImp implements EcommerceRepository {
    @Override
    public String save(EcommerceDTO ecommerceDTO) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.SECRET.getProp());

            String noConcatenateSql = "insert into ecommerce_details (id, email, userid, password) VALUES (?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(noConcatenateSql);

            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, ecommerceDTO.getEmail());
            preparedStatement.setString(3, ecommerceDTO.getUserid());
            preparedStatement.setString(4, ecommerceDTO.getPassword());


            preparedStatement.executeUpdate();

            System.out.println(connection);

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        return "false";
    }

    @Override
    public EcommerceDTO findById(int id) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.SECRET.getProp());


            String sql = "Select * from ecommerce_details where id = " + id + " ";

            System.out.println("sql" + sql);

            Statement statement = connection.createStatement();

            System.out.println(connection);
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("resultset " + resultSet);

            while (resultSet.next()) {

                int pk = resultSet.getInt("id");
                String email = resultSet.getString("email");
                String userid = resultSet.getString("userid");
                String password = resultSet.getString("password");
                String createdat = resultSet.getString("created_at");


                EcommerceDTO ecommerceDTO = new EcommerceDTO(email,userid,password, createdat );
                System.out.println(ecommerceDTO);

                System.out.println("Email:"+email+" User Id:"+userid+" Password:"+password+" Created At: "+createdat);

                return  ecommerceDTO;
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
