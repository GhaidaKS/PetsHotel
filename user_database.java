
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author huawei
 */
public class user_database {
    
    public static Connection connect() throws SQLException{
    
      return DriverManager.getConnection("jdbc:derby://localhost:1527/PetsHotel","root","%r007%");
    }
    
    public static void Insert_users(String firstName,String LastName, int Phone, String Email,String password){
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("insert into USERS (FIRST_NAME,LAST_NAME,PHONE_NUMBER,EMAIL,PASSWORD) values (?,?,?,?,?)");
        statement.setString(1,firstName);
        statement.setString(2,LastName);
        statement.setInt(3, Phone);
        statement.setString(4,Email);
        statement.setString(5,password);
        statement.execute();
        }catch (SQLException ex) 
        {
           System.out.println("1 "+ex.getMessage());
        }
        
    }
    
    public static  ArrayList<userTable> get_users()
    {
      ArrayList<userTable> list= new ArrayList();
       try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("select * from USERS");
        ResultSet result=statement.executeQuery();
        
        while(result.next())
        {
            list.add(new userTable(result.getString("FIRST_NAME"),result.getString("LAST_NAME"),result.getInt("PHONE_NUMBER"),result.getString("EMAIL"),result.getString("PASSWORD")));
        }
        }catch (SQLException ex) 
        {
           System.out.println("2 "+ex.getMessage());
        }
       
       return list;
    }
    
    public static int check_user(String Email,String password)
    {
        ArrayList<userTable> check=get_users();
        int x=0;
        for(int i=0;i<check.size();i++)
        {
          if(check.get(i).getEmail().equals(Email))
            { 
              if(check.get(i).getPassword().equals(password))
                { 
                    x=1;
                    break; // we nead to exir fron the loop
                }
               else
                {
                   x=2;
                   break;
                }
            }
           else
            {
                x=0; //it is like thet the user is not exist
            }  
        }
        
        return x;
    }
    
    public static String User_Info(String Email)
    {
//        ArrayList<userTable> check=get_users();
//        String info="Nan";
//        for(int i=0;i<check.size();i++)
//        {
//          if(check.get(i).getEmail().equals(Email))
//              info=check.get(i).getFirstName()+"  "+check.get(i).getLastName();
//            
//  
//        }
//        
//        return info;
        String info="Nan";
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("select FIRST_NAME, LAST_NAME from USERS where EMAIL=? ");
        statement.setString(1,Email);
        ResultSet result=statement.executeQuery();
  
        while(result.next())
        {
           info= result.getString("FIRST_NAME")+"  "+ result.getString("LAST_NAME");
        }
        }catch (SQLException ex) 
        {
           System.out.println("euser info  "+ex.getMessage());
        }
        
        return info;
    }
    
    
    
}
