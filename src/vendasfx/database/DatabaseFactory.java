package vendasfx.database;


public class DatabaseFactory {
    
    
    public static Database getDatabase(String nome){
        
        if(nome.equals("postgresql")){
            
            return new DataBasePostgreSQL();
            
        }else if(nome.equals("mysql")){
            
            return new DataBaseMySQL();
            
            
        }else{
            
            return null;
        }
    } 
    
}
