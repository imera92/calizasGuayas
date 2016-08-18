package proyectobasecaliza;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import proyectobasecaliza.sistema.Usuario;

public class Sistema {
    private static MySqlAccess newAccess;
    private static ArrayList<Usuario> usuarios;
        
    public static void incializarSistema(){
        Sistema.newAccess = new MySqlAccess();
        Sistema.newAccess.connection();
        Sistema.usuarios = new ArrayList<Usuario>();
        Sistema.cargarUsuarios();
    }
    
    public static void cerrar(){
        Sistema.newAccess.closeConnection();
    }
    
    public static MySqlAccess getNewAccess(){
        return Sistema.newAccess;
    }
    
    private static void cargarUsuarios(){
        ResultSet rs;
        try{
            rs = Sistema.newAccess.query("SELECT * FROM usuarios");
            while(rs.next()){
                Usuario u = new Usuario();
                u.setUser(rs.getString("user"));
                u.setPass(rs.getString("pass"));
                Sistema.usuarios.add(u);
            }
        }catch(SQLException se){
            se.printStackTrace();
        }
    }
    
    public static boolean validarUsuario(JTextField user, JTextField pass){
        Usuario uTemp = new Usuario();
        uTemp.setUser(user.getText());
        uTemp.setPass(pass.getText());
        for(Usuario u : Sistema.usuarios){
            if(u.compareTo(uTemp) == 1) return true;
        }
        return false;
    }
    
    public static void insertCliente(JTextField ruc, JTextField nombre, JTextField direccion, JTextField telefono, JTextField email) throws SQLException{
        String sql = "INSERT INTO cliente " +
                   "VALUES ("+ruc.getText()+", '"+nombre.getText()+"', '"+direccion.getText()+"', '"+telefono.getText()+"', '"+email.getText()+"');";
        Sistema.newAccess.write(sql);
    }
    
    public static void insertFactura(JTextField idFactura, JTextField fechaVenci, JTextField estado, JTextField sacosVen, JTextField precioUni, JTextField total, JTextField idProd, JTextField rucClie, JTextField ceduEmpl) throws SQLException{
        String sql = "INSERT INTO factura " +
                   "VALUES ('"+idFactura.getText()+"', CURDATE(), '"+fechaVenci.getText()+"', '"+estado.getText()+"', "+sacosVen.getText()+", "+precioUni.getText()+", "+total.getText()+", '"+idProd.getText()+"', '"+rucClie.getText()+"', '"+ceduEmpl.getText()+"');";
        Sistema.newAccess.write(sql);
    }
}
