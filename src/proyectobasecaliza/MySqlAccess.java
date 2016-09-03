package proyectobasecaliza;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySqlAccess {
    //URL's de JDBC y la base de datos
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/calizasguayas";
   //Credenciales
   static final String USER = "root";
   static final String PASS = "";
   
   private Connection conn = null;
   private Statement stmt = null;
   private CallableStatement stmt2 = null;
   
   public void connection(){
        try{
           //1: Registrar JDBC driver
           Class.forName("com.mysql.jdbc.Driver");
            
           //2: Abrir coneccion
           System.out.println("Conectando a la base de datos...");
           this.conn = DriverManager.getConnection(DB_URL,USER,PASS);
           this.stmt = conn.createStatement();
        }catch(SQLException se){
           se.printStackTrace();
        }catch(Exception e){
           e.printStackTrace();
        }
   }
   
   public void closeConnection(){
       try{
           if(this.conn != null) this.conn.close();
           if(this.stmt != null) this.stmt.close();
           System.out.println("Cerrando coneccion a la base de datos...");
       }
       catch(SQLException se){
            se.printStackTrace();
       }
   }

   public ResultSet query(String q) throws SQLException{
       ResultSet rs = this.stmt.executeQuery(q);
       return rs;
   }
   
   public ResultSet query2(String call) throws SQLException{
       this.stmt2 = this.conn.prepareCall(call); 
       this.stmt2.execute();
       return this.stmt2.getResultSet();
   }

   public void write(String q) throws SQLException{
       this.stmt.executeUpdate(q);
   }
   
   public void write2(String call) throws SQLException{
       this.stmt2 = this.conn.prepareCall(call); 
       this.stmt2.execute();
   }
   
   public Connection getConn() {
        return this.conn;
    }
   
   /*
   
    Connection cn = Sistema.getNewAccess().getConn();
    ResultSet rs=null;
    CallableStatement mycall= null;
    try{
        mycall = cn.prepareCall("{call allClients ()}"); 
        mycall.execute();
        rs=mycall.getResultSet();
    }catch(Exception e){

    }
   
   */
    
      /*
      QUERIES
      String sql;
      Statement stmt;
      sql = "SELECT * FROM bote";
      stmt = conn.createStatement();
      
      ResultSet rs = stmt.executeQuery(sql);

      -Extraemos los datos del result set
      while(rs.next()){
         //Obtenemos los datos del result set
         int bid  = rs.getInt("bid");
         String bnombre = rs.getString("bnombre");
         String color = rs.getString("color");

         //Mostramos los valores obtenidos
         System.out.print("ID: " + bid);
         System.out.print(", First: " + bnombre);
         System.out.println(", Last: " + color);
      }
      */
}