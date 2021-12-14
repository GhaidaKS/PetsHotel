
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;

public class appointments_database {
    
     public static Connection connect() throws SQLException{
    
      return DriverManager.getConnection("jdbc:derby://localhost:1527/PetsHotel","GW","1234");
    }
    
    public static void Insert_records(int HOST_PERIOD,String START_DATE,int PET_ID){
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("insert into HOSTING_RECORDS values (default,?,?,?)",Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, HOST_PERIOD);
        statement.setString(2,START_DATE);
        statement.setInt(3,PET_ID);
        statement.execute();
        }catch (SQLException ex) 
        {
           System.out.println("1 "+ex.getMessage());
        }
        
    }
    
     public static boolean InsertCheck(int HOST_PERIOD,String START_DATE,int PET_ID){
         try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("select * from HOSTING_RECORDS where HOST_PERIOD=? and START_DATE=? and PET_ID=?");
        statement.setInt(1, HOST_PERIOD);
        statement.setString(2,START_DATE);
        statement.setInt(3,PET_ID);
        ResultSet result=statement.executeQuery();
        //ResultSetMetaData metaData = result.getMetaData();
        if(!result.next())
            return true; //you can insert
        }catch (SQLException ex) 
        {
           System.out.println("1.1 "+ex.getMessage());
        }
           return false; // you can't insert
       }
    
   
    public static DefaultListModel get_pets(){
        DefaultListModel petsList = new DefaultListModel();
         int x=user_database.getUSER_ID();
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("select * from PETS where USER_ID=?  ");
        statement.setInt(1,x);
        ResultSet result=statement.executeQuery();
        while(result.next())
        {     
            String type="null";
            if(result.getString("TYPE_ID").equals("1"))
                type="Cat";
            else if(result.getString("TYPE_ID").equals("2"))
                type="Dog";
            else if(result.getString("TYPE_ID").equals("3"))
                type="Fish";
            else if(result.getString("TYPE_ID").equals("4"))
                type="Bird";
            
           petsList.addElement(result.getInt("I")+" "+type+":"+result.getString("PET_AGE")+" years ( "+result.getString("OWNER_NOTE")+" ) ");
        }
        }catch (SQLException ex) 
        {
           System.out.println("2 "+ex.getMessage());
        }
       return petsList;
    }
 
   
   public static  DefaultListModel  get_periods()
    {
       DefaultListModel period_list = new DefaultListModel();
       try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("select HOST_PERIOD from HOSTING_PERIOD");
        ResultSet result=statement.executeQuery();
        while(result.next())
        {
              period_list.addElement(result.getString("HOST_PERIOD"));
        }
        }catch (SQLException ex) 
        {
           System.out.println("3 "+ex.getMessage());
        }
       return period_list;

    }
   
   public static  DefaultListModel  get_HostingRecords()
    {
       DefaultListModel user_appointments = new DefaultListModel();
       try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("select HOST_PERIOD,HOSTING_RECORDS.PET_ID,START_DATE,USER_ID from HOSTING_RECORDS join PETS on HOSTING_RECORDS.PET_ID=PETS.PET_ID where USER_ID=?");
        statement.setInt(1, user_database.getUSER_ID());
        ResultSet result=statement.executeQuery();
        while(result.next())
        {
              user_appointments.addElement("Your appointmet in "+result.getString("START_DATE")+" for "+result.getString("HOST_PERIOD"));
        }
        }catch (SQLException ex) 
        {
           System.out.println("3.1 "+ex.getMessage());
        }
       return user_appointments;

    }
   
   public static  int  get_price(int HOST_PERIOD)
    {
       int p=0;
       try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("select PRICE from HOSTING_PERIOD where HOST_PERIOD=?");
        statement.setInt(1,HOST_PERIOD);
        ResultSet result=statement.executeQuery();
        while(result.next())
        {
              p=result.getInt("PRICE");
        }
        }catch (SQLException ex) 
        {
           System.out.println("3.2 "+ex.getMessage());
        }
       return p;

    }
    
   
//    static int USER_ID, I;
//    public static void SetPet(int USER_ID1, int I1){
//       USER_ID=USER_ID1;
//       I=I1;
//
//    }
    
    public static int get_petID(int USER_ID , int I){
        int petID=0;
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("select PET_ID from PETS where USER_ID=? and I=? ");
        statement.setInt(1,USER_ID);//where?
        statement.setInt(2,I);//where ?
        ResultSet result=statement.executeQuery();
        while(result.next())
        {
          petID=result.getInt("PET_ID");
        }
        }catch (SQLException ex) 
        {
           System.out.println("4 "+ex.getMessage());
        }
        return petID;
    }
    
    
    public static void delete_all_pet(int USER_ID){
        try{
        Connection con=connect();
        PreparedStatement statement=con.prepareStatement("delete from PETS  where USER_ID=?");
        statement.setInt(1,USER_ID);
        statement.execute();
        
        }catch (SQLException ex) 
        {
           System.out.println("5 "+ex.getMessage());
        }
        
    }
    
    
    
//    public static int getI(){
////        System.out.println("I is--"+ I);
//        return I;
//    }
    
    
  
    
    static String pet1="null";
    public static void SetNewPet(String pet){
       pet1=pet;
        
    }
    
    public static String returnNewPet(){
     return pet1;
    }
    
}
