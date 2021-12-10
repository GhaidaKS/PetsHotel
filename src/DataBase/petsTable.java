/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

/**
 *
 * @author huawei
 */
public class petsTable {
    
   private String TYPE_ID,PET_AGE,OWNER_NOTE;
   private int USER_ID;
    public String getTYPE_ID() {
        return TYPE_ID;
    }

    public void setTYPE_ID(String TYPE_ID) {
        this.TYPE_ID = TYPE_ID;
    }

    public String getPET_AGE() {
        return PET_AGE;
    }

    public void setPET_AGE(String PET_AGE) {
        this.PET_AGE = PET_AGE;
    }

    public String getOWNER_NOTE() {
        return OWNER_NOTE;
    }

    public void setOWNER_NOTE(String OWNER_NOTE) {
        this.OWNER_NOTE = OWNER_NOTE;
    }

    public int getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(int USER_ID) {
        this.USER_ID = USER_ID;
    }



    public petsTable(String TYPE_ID, String PET_AGE, String OWNER_NOTE, int USER_ID) {
        this.TYPE_ID = TYPE_ID;
        this.PET_AGE = PET_AGE;
        this.OWNER_NOTE = OWNER_NOTE;
        this.USER_ID = USER_ID;
    }
    
}
