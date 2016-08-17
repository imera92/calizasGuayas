package proyectobasecaliza;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlAccess {
    //URL's de JDBC y la base de datos
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/calizasguayas";
   //Credenciales
   static final String USER = "root";
   static final String PASS = "";
   
   private Connection conn = null;
   private Statement stmt = null;
   
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
   
   public Connection getConn() {
        return this.conn;
    }
   
    
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