package proyectobasecaliza;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class MySqlAccess {
    //URL's de JDBC y la base de datos
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/calizasguayas";
   //Credenciales
   static final String USER = "root";
   static final String PASS = "11072011";
   
   public void connection(){
   Connection conn = null;
   Statement stmt = null;
   try{
      //2: Registrar JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //3: Abrir coneccion
      System.out.println("Conectando a la base de datos...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      
      /*
      //4 (OPC): Ejecutamos un query de prueba
      System.out.println("Creando sentencia...");
      stmt = conn.createStatement();
      String sql;
      sql = "SELECT * FROM bote";
      ResultSet rs = stmt.executeQuery(sql);

      //5: Extraemos los datos del result set
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
      
      
      //4 (OPC): Ejecutamos un query de prueba
      System.out.println("Creando sentencia...");
      stmt = conn.createStatement();
      String sql;
      sql = "INSERT INTO producto (IdProducto, Stock, Nombre, Precio_Unitario) VALUES ('06', '1000', 'Sellador', '10.0')";
      stmt.executeUpdate(sql);
      
      //5 (OPC): Creamos nuevo query y extraemos los datos del result set
      sql = "SELECT * FROM producto";
      ResultSet rs = stmt.executeQuery(sql);
      
      while(rs.next()){
          //Obtenemos los datos del result set
          int id = rs.getInt("IdProducto");
          String stock = rs.getString("Stock");
          String name = rs.getString("Nombre");
          float price = rs.getFloat("Precio_Unitario");  
          
         //Mostramos los valores obtenidos
         System.out.print("ID: " + id);
         System.out.print(", Nombre: " + name);
         System.out.println(", Stock: " + stock);
         System.out.println(", Precio: " + price);
      }
      
      //6: Limpiamos todo
      rs.close();
      stmt.close();
      conn.close();
   }catch(SQLException se){
      se.printStackTrace();
   }catch(Exception e){
      e.printStackTrace();
   }finally{
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   System.out.println("Goodbye!");
}
}
}