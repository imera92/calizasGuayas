
package gui;

public class ProyectoBaseCaliza {

    
    public static void main(String[] args) {
        
//        MySqlAccess newAccess = new MySqlAccess();
//        newAccess.connection();
        /*
        VCrearCliente ventana = new VCrearCliente();
        ventana.setVisible(true);
        */
//        VCrearProducto ventana = new VCrearProducto();
//        ventana.setVisible(true);

        VLogin ventana = new VLogin();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    
}
