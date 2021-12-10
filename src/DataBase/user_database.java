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
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author huawei
 */
public class user_database {
    
    public static Connection connect() throws SQLException{
    
      return DriverManager.getConnection("jdbc:derby://localhost:1527/PetsHotel","GW","1234");
    }
    //(default,FIRST_NAME,LAST_NAME,EMAIL,PASSWORD,PHONE_NUMBER)
    public static void Insert_users(String firstName,String LastName, String Email,String password, String Phone){
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("insert into USERS values (default,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
        statement.setString(1,firstName);
        statement.setString(2,LastName);
        statement.setString(3,Email);
        statement.setString(4,password);
        statement.setString(5, Phone);
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
            list.add(new userTable(result.getString("FIRST_NAME"),result.getString("LAST_NAME"),result.getString("EMAIL"),result.getString("PASSWORD"),result.getString("PHONE_NUMBER")));
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
    
    
   static String Email;
    public static void setEMAIL(String EMAIL){
       Email=EMAIL;
    }
    
    public static int getUSER_ID(){
      
        int id=0;
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("select USER_ID from USERS where EMAIL=? ");
        statement.setString(1,Email);
        ResultSet result=statement.executeQuery();
  
        while(result.next())
        {
           id= result.getInt("USER_ID");
        }
        }catch (SQLException ex) 
        {
           System.out.println("euser id  "+ex.getMessage());
        }
        
        return id;
    }
    
    
        public static String getUser_Info()
    {
        String info="null";
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
