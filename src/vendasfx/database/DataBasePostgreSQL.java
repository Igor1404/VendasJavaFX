package vendasfx.database;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataBasePostgreSQL implements Database {
    
    private Connection connection;
    @Override
    public Connection conectar() {
        
        
        try{
            
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1/javafxmvc", "postgres","point246");
            return this.connection;
        
        }
        catch(SQLException | ClassNotFoundException ex){
        
            Logger.getLogger(DataBasePostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
       
        }
       
    }

    @Override
    public void desconectar(Connection conn) {
         try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataBasePostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
}
