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

/**
 *
 * @author huawei (TYPE_ID,PET_AGE,OWNER_NOTE,EMAIL)
 */
public class pets_database {
    
     public static Connection connect() throws SQLException{
    
      return DriverManager.getConnection("jdbc:derby://localhost:1527/PetsHotel","GW","1234");
    }
    
    public static void Insert_pets(String TYPE_ID,String PET_AGE,String OWNER_NOTE,int USER_ID){
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("insert into PETS  values (default,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, TYPE_ID);
        statement.setString(2,PET_AGE);
        statement.setString(3,OWNER_NOTE);
        statement.setInt(4,USER_ID);
        statement.execute();
        }catch (SQLException ex) 
        {
           System.out.println("3 "+ex.getMessage());
        }
        
    }
    
    public static  ArrayList<petsTable> get_pets()
    {
      ArrayList<petsTable> list= new ArrayList();
       try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("select * from PETS");
        ResultSet result=statement.executeQuery();
        
        while(result.next())
        {
            list.add(new petsTable(result.getString("TYPE_ID"),result.getString("PET_AGE"),result.getString("OWNER_NOTE"),result.getInt("USER_ID")));
        }
        }catch (SQLException ex) 
        {
           System.out.println("4 "+ex.getMessage());
        }
       
       return list;
    }
    
    
    public static void delete_pet(String TYPE_ID,String PET_AGE,String OWNER_NOTE,String EMAIL){
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("delete from PETS  where TYPE_ID=? and PET_AGE=? and OWNER_NOTE=? and EMAIL=?");
        statement.setString(1, TYPE_ID);
        statement.setString(2,PET_AGE);
        statement.setString(3,OWNER_NOTE);
        statement.setString(4,EMAIL);
        statement.execute();
        
        }catch (SQLException ex) 
        {
           System.out.println("5 "+ex.getMessage());
        }
        
    }
    
    
    public static void delete_all_pet(String EMAIL){
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("delete from PETS  where EMAIL=?");
        statement.setString(1,EMAIL);
        statement.execute();
        
        }catch (SQLException ex) 
        {
           System.out.println("6 "+ex.getMessage());
        }
        
    }
    
    
}
