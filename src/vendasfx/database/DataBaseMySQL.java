/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasfx.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author igor
 */
public class DataBaseMySQL implements Database {
    
    private Connection connection;

    @Override     
    
    public Connection conectar() {
        
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/javafxmvc", "mysql","point246");
            return this.connection;
        }
        
        catch (SQLException | ClassNotFoundException ex) {
            
            Logger.getLogger(DataBaseMySQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        }
    public void desconectar(Connection connection){
        
        try {
            connection.close();
        }catch (SQLException ex) {
            Logger.getLogger(DataBasePostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    }
    
}
