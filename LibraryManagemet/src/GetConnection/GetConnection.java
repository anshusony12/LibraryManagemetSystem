/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Anshu Sony
 */
public class GetConnection {
    private static Connection con=null;
    private static Connection bcon=null;
    private static Connection icon=null;
    public static Connection getConnection(){
        try{
        if(con==null){
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarianinfo","root","root");
        }
        }
        catch(SQLException e){
            
        }
        return con;
    }
    
    public static Connection getBconnection(){
        try{
        if(bcon==null){
            bcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root","root");
        }
        }
        catch(SQLException e){
        
        }
        return bcon;
    }
    public static Connection getSconnection(){
    try{
        if(icon==null){
        icon=DriverManager.getConnection("jdbc:mysql://localhost:3306/view_issue_book","root","root");
        }
    }
    catch(SQLException e){
    
    }
        return icon;
    }
   
}
