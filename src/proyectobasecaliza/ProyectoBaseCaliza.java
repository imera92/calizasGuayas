
package proyectobasecaliza;

public class ProyectoBaseCaliza {

    
    public static void main(String[] args) {
        
        MySqlAccess newAccess = new MySqlAccess();
        newAccess.connection();
        newAccess.closeConnection();

        VLogin ventana = new VLogin();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    
}
