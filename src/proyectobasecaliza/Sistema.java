package proyectobasecaliza;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import proyectobasecaliza.sistema.Cliente;
import proyectobasecaliza.sistema.FormaPago;
import proyectobasecaliza.sistema.Usuario;

public class Sistema {
    private static MySqlAccess newAccess;
    private static ArrayList<Usuario> usuarios;
    private static ArrayList<FormaPago> formasPago;
    private static ArrayList<Cliente> clientes;
        
    public static void incializarSistema(){
        Sistema.newAccess = new MySqlAccess();
        Sistema.newAccess.connection();
        Sistema.usuarios = new ArrayList<Usuario>();
        Sistema.formasPago = new ArrayList<FormaPago>();
        Sistema.clientes = new ArrayList<Cliente>();
        Sistema.cargarUsuarios();
        Sistema.cargarFormasPago();
        Sistema.cargarClientes();
    }
    
    public static void cerrar(){
        Sistema.newAccess.closeConnection();
    }
    
    public static MySqlAccess getNewAccess(){
        return Sistema.newAccess;
    }

    public static ArrayList<FormaPago> getFormasPago() {
        return Sistema.formasPago;
    }

    public static ArrayList<Cliente> getClientes() {
        return Sistema.clientes;
    }
    
    private static void cargarUsuarios(){
        ResultSet rs;
        try{
            rs = Sistema.newAccess.query2("{call allEmpl ()}");
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
            rs = Sistema.newAccess.query2("{call allPayForm ()}");
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
    
    private static void cargarClientes(){
        ResultSet rs;
        try{
            rs = Sistema.newAccess.query2("{call allClients ()}");
            while(rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getString("RUC_Cliente"));
                c.setNombre(rs.getString("Nombre"));
                Sistema.clientes.add(c);
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
    
    public static void filter(String query, JTable tabla, DefaultTableModel dfm) {
        TableRowSorter<DefaultTableModel> tr =new TableRowSorter<DefaultTableModel>(dfm);
        tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
}
