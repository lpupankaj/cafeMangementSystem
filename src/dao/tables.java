/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;

/**
 *
 * @author girip
 */
public class tables {
    public static void main(String[] args){
        try{
            String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email))";
            String adminDetails="insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','India','admin','Which primary school do you attended ?','ABC','true')";
            String categoryTable="create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            String productTable = "Create table product (id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
            DbOperations.setDataOrDelete(userTable,"User Table Created Sucessfully");
            DbOperations.setDataOrDelete(adminDetails,"Admin details added Sucessfully");
            DbOperations.setDataOrDelete(categoryTable,"Category table created Sucessfully");
            DbOperations.setDataOrDelete(productTable,"Product table created Sucessfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
