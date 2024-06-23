/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.* ;
/**
 *
 * @author Devika shetty
 */
public class connection1 {
    public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/specs","root","Ran10d@i");
            return con;
        }
        catch(Exception e){
            return null;
            
        }
    }       

    public static Connection getcon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}       
    
     
            
    

    

