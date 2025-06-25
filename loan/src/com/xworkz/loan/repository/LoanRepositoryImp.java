package com.xworkz.loan.repository;

import com.xworkz.loan.constant.DBConstant;
import com.xworkz.loan.dto.LoanDTO;

import java.io.Serializable;
import java.sql.*;

public class LoanRepositoryImp implements LoanRepository {


    public LoanRepositoryImp() {
        System.out.println("No- arg Const of LoanRepositoryImp ");
    }

    @Override
    public String save(LoanDTO loanDTO) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.SECRET.getProp());

            String noConcatenateSql = "insert into loandetails values(?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(noConcatenateSql);

            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2,loanDTO.getName());
            preparedStatement.setInt(3,loanDTO.getAge());
            preparedStatement.setString(4,loanDTO.getGender());
            preparedStatement.setString(5,loanDTO.getPhone());
            preparedStatement.setString(6,loanDTO.getAddress());
            preparedStatement.setString(7,loanDTO.getLoan_type());
            preparedStatement.setInt(8,loanDTO.getAmount());
            preparedStatement.setInt(9,loanDTO.getTenure());

            preparedStatement.executeUpdate();

            System.out.println(connection);


        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return "false";
    }

    @Override
    public LoanRepository findById(int id) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.SECRET.getProp());

            String sql = "Select * from dancedetails where id = " + id + " ";

            System.out.println("sql" + sql);

            Statement statement = connection.createStatement();

            System.out.println(connection);
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("resultset " + resultSet);

            while (resultSet.next()) {

                int pk = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                String phone = resultSet.getString("phone");
                String address = resultSet.getString("address");
                String loan_type = resultSet.getString("loan_type");
                int amount = resultSet.getInt("amount");
                int tenure = resultSet.getInt("tenure");

                LoanDTO loanDTO = new LoanDTO(name, age, gender, phone, address, loan_type, amount, tenure);
                loanDTO.setId(pk);

                System.out.println(loanDTO);

                System.out.println("Name: "+name+" Age: "+age+" Gender: "+gender+" Phone: "+phone+" Address: "+address+" Loan Type: "+loan_type+" Loan Amount: "+amount+" Loan Tenure: "+tenure);

                return loanDTO;

            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    return null;