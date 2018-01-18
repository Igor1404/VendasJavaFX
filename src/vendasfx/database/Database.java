/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasfx.database;


import java.sql.Connection;

/**
 *
 * @author igor
 */
public interface Database {
    
    public Connection conectar();
    public void desconectar(Connection conn); 
    
}
