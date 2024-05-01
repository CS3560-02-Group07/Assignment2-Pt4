/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shippingSubsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ethan
 */
public class DataBase {
    
    
    public static Connection myCon(){
        Connection con = null; 
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SHIPSYS?useSSL=false", "root", "7!11!2003!Emurguia");
        }catch (Exception e){
            System.out.println(e);
        }
        return con; 
    }
    
    
}
