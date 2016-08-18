package proyectobasecaliza;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import proyectobasecaliza.sistema.FormaPago;
import proyectobasecaliza.sistema.Usuario;

public class Sistema {
    private static MySqlAccess newAccess;
    private static ArrayList<Usuario> usuarios;
    private static ArrayList<FormaPago> formasPago;
        
    public static void incializarSistema(){
        Sistema.newAccess = new MySqlAccess();
        Sistema.newAccess.connection();
        Sistema.usuarios = new ArrayList<Usuario>();
        Sistema.formasPago = new ArrayList<FormaPago>();
        Sistema.cargarUsuarios();
        Sistema.cargarFormasPago();
    }
    
    public static void cerrar(){
        Sistema.newAccess.closeConnection();
    }
    
    public static MySqlAccess getNewAccess(){
        return Sistema.newAccess;
    }

    public static ArrayList<FormaPago> getFormasPago() {
        return formasPago;
    }
    
    private static void cargarUsuarios(){
        ResultSet rs;
        try{
            rs = Sistema.newAccess.query("SELECT * FROM empleados");
            while(rs.next()){
                Usuario u = new Usuario();
                u.setUser(rs.getString("Cedula_Empleados"));
                u.setPass(rs.getString("pass"));
                Sistema.usuarios.add(u);
            }
        }catch(SQLException se){
            se.printStackTrace();
        }
    }
    
    private static void cargarFormasPago(){
        ResultSet rs;
        try{
            rs = Sistema.newAccess.query("SELECT * FROM forma_pago");
            while(rs.next()){
                FormaPago p = new FormaPago();
                p.setId(rs.getString("Idforma_pago"));
                p.setDescripcion(rs.getString("Descripcion"));
                Sistema.formasPago.add(p);
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
    
    public static void insertFactura(JTextField idFactura, JTextField fechaEmi, JTextField fechaVenci, JTextField estado, JTextField sacosVen, JTextField precioUni, JTextField total, JTextField idProd, JTextField rucClie, JTextField ceduEmpl) throws SQLException{
        String sql = "INSERT INTO factura " +
                   "VALUES ('"+idFactura.getText()+"', '"+fechaEmi.getText()+"', '"+fechaVenci.getText()+"', '"+estado.getText()+"', "+sacosVen.getText()+", "+precioUni.getText()+", "+total.getText()+", '"+idProd.getText()+"', '"+rucClie.getText()+"', '"+ceduEmpl.getText()+"');";
        Sistema.newAccess.write(sql);
    }
    
    public static void insertProducto(JTextField idprod,JTextField stock,JTextField nombre,JTextField precio) throws SQLException{
        String sql = "INSERT INTO producto " +
                   "VALUES ('"+idprod.getText()+"', "+stock.getText()+", '"+nombre.getText()+"', "+precio.getText()+");";
        Sistema.newAccess.write(sql);
    }
    
    public static void insertRetencion(JTextField idreten,JTextField porcen,JTextField valorRete,JTextField idFact) throws SQLException{
        String sql = "INSERT INTO retencion " +
                   "VALUES ('"+idreten.getText()+"', "+porcen.getText()+", "+valorRete.getText()+", '"+idFact.getText()+"');";
        Sistema.newAccess.write(sql);
    }
    
    public static void insertPagoCheque(JTextField numComprb,JTextField fechaPago,JTextField numCheque,JTextField bancoCheque,JTextField valorCancel,JTextField idFact, JComboBox idFormaPago) throws SQLException{
        String sql = "INSERT INTO pago " +
                   "VALUES ('"+numComprb.getText()+"', '"+fechaPago.getText()+"', '"+numCheque.getText()+"', '"+bancoCheque.getText()+"', null, null, "+valorCancel.getText()+", '"+idFact.getText()+"', "+idFormaPago.getSelectedItem().toString().charAt(0)+");";
        Sistema.newAccess.write(sql);
    }
    
    public static void insertPagoDeposito(JTextField numComprb,JTextField fechaPago,JTextField bancoDeposito,JTextField ctaDeposito,JTextField valorCancel,JTextField idFact,JComboBox idFormaPago) throws SQLException{
        String sql = "INSERT INTO pago " +
                   "VALUES ('"+numComprb.getText()+"', '"+fechaPago.getText()+"', null, null, '"+bancoDeposito.getText()+"', '"+ctaDeposito.getText()+"', "+valorCancel.getText()+", '"+idFact.getText()+"', '"+idFormaPago.getSelectedItem().toString().charAt(0)+"');";
        Sistema.newAccess.write(sql);
    }
    
    
}
