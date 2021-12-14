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
import javax.swing.DefaultListModel;

/**
 *
 * @author huawei (TYPE_ID,PET_AGE,OWNER_NOTE,EMAIL)
 */
public class pets_database {
    
     public static Connection connect() throws SQLException{
    
      return DriverManager.getConnection("jdbc:derby://localhost:1527/PetsHotel","GW","1234");
    }
    
    public static void Insert_pets(String TYPE_ID,String PET_AGE,String OWNER_NOTE,int USER_ID,int I){
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("insert into PETS  values (default,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, TYPE_ID);
        statement.setString(2,PET_AGE);
        statement.setString(3,OWNER_NOTE);
        statement.setInt(4,USER_ID);
        statement.setInt(5,I);
        statement.execute();
        }catch (SQLException ex) 
        {
           System.out.println("3 "+ex.getMessage());
        }
        
    }
    //TYPE_ID,PET_AGE,OWNER_NOTE,I
     public static DefaultListModel demoList;
    public static DefaultListModel get_pets(){
         int x=16;
         demoList = new DefaultListModel();
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("select * from PETS where USER_ID=?  ");
        statement.setInt(1,x);
        ResultSet result=statement.executeQuery();
        while(result.next())
        {     
            String type="null";
            if(result.getString("TYPE_ID").matches("1"))
                type="Cat";
            else if(result.getString("TYPE_ID").matches("2"))
                type="Dog";
            else if(result.getString("TYPE_ID").matches("3"))
                type="Fish";
            else if(result.getString("TYPE_ID").matches("4"))
                type="Bird";
            
           demoList.addElement(result.getInt("I")+" "+type+":"+result.getString("PET_AGE")+" years ( "+result.getString("OWNER_NOTE")+" ) ");
        }
        }catch (SQLException ex) 
        {
           System.out.println("4 "+ex.getMessage());
        }
       return demoList;
    }
   
   public static  DefaultListModel  get_listpetsType()
    {
       DefaultListModel petslist = new DefaultListModel();
       try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("select TYPE_NAME from PETS_TYPE");
        ResultSet result=statement.executeQuery();
        while(result.next())
        {
              petslist.addElement(result.getString("TYPE_NAME"));
        }
        }catch (SQLException ex) 
        {
           System.out.println("4 "+ex.getMessage());
        }
       return petslist;

    }
    
    
    public static void delete_pet(int USER_ID, int I){
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("delete from PETS  where USER_ID=? and I=? ");
        statement.setInt(1,USER_ID);
        statement.setInt(2,I);
        statement.execute();
        System.out.println("final");
        }catch (SQLException ex) 
        {
           System.out.println("5 "+ex.getMessage());
        }
        
    }
    
    
    public static void delete_all_pet(int USER_ID){
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("delete from PETS  where USER_ID=?");
        statement.setInt(1,USER_ID);
        statement.execute();
        
        }catch (SQLException ex) 
        {
           System.out.println("6 "+ex.getMessage());
        }
        
    }
    
    static int USER_ID, I;
    public static void SetPet(int USER_ID1, int I1){
       USER_ID=USER_ID1;
       I=I1;
//        System.out.println(USER_ID+"--"+ I);
    }
    
    public static int getI(){
//        System.out.println("I is--"+ I);
        return I;
    }
    
    
    public static void Update_pets(String TYPE_ID,String PET_AGE,String OWNER_NOTE){
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("update PETS set TYPE_ID=? ,PET_AGE=? ,OWNER_NOTE=?  where USER_ID=? and I=?");
        statement.setString(1, TYPE_ID);
        statement.setString(2,PET_AGE);
        statement.setString(3,OWNER_NOTE);
        statement.setInt(4,USER_ID);
        statement.setInt(5,I);
//         System.out.println(USER_ID+"-in the insert-"+ I);
        statement.execute();
        }catch (SQLException ex) 
        {
           System.out.println("3 "+ex.getMessage());
        }
        
    }
    
    static String pet1="null";
    public static void SetNewPet(String pet){
       pet1=pet;
        
    }
    
    public static String returnNewPet(){
     return pet1;
    }
    
}
