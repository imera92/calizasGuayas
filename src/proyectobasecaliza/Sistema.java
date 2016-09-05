package proyectobasecaliza;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import proyectobasecaliza.sistema.Cliente;
import proyectobasecaliza.sistema.Factura;
import proyectobasecaliza.sistema.FormaPago;
import proyectobasecaliza.sistema.Producto;
import proyectobasecaliza.sistema.Usuario;

public class Sistema {
    private static MySqlAccess newAccess;
    private static ArrayList<Usuario> usuarios;
    private static ArrayList<FormaPago> formasPago;
    private static ArrayList<Cliente> clientes;
    private static ArrayList<Producto> productos;
    private static ArrayList<Factura> facturas;
    private static Usuario session;
        
    public static void incializarSistema(){
        Sistema.newAccess = new MySqlAccess();
        Sistema.newAccess.connection();
        Sistema.usuarios = new ArrayList<Usuario>();
        Sistema.formasPago = new ArrayList<FormaPago>();
        Sistema.clientes = new ArrayList<Cliente>();
        Sistema.productos = new ArrayList<Producto>();
        Sistema.facturas = new ArrayList<Factura>();
        Sistema.cargarUsuarios();
        Sistema.cargarFormasPago();
        Sistema.cargarClientes();
        Sistema.cargarProductos();
        Sistema.cargarFacturas();
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
    
     public static ArrayList<Producto> getProductos() {
        return productos;
    }

    public static ArrayList<Factura> getFacturas() {
        return facturas;
    }
     
    public static Usuario getSession(){
        return Sistema.session;
    }
    
    public static void closeSession(){
       Sistema.session=null;
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
    
    public static void cargarClientes(){
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
    
    private static void cargarProductos(){
        ResultSet rs;
        try{
            rs = Sistema.newAccess.query2("{call allProduct ()}");
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getString("IdProducto"));
                p.setNombre(rs.getString("Nombre"));
                Sistema.productos.add(p);
            }
        }catch(SQLException se){
            se.printStackTrace();
        }
    }
    
    public static void cargarFacturas(){
        ResultSet rs;
        try{
            rs = Sistema.newAccess.query2("{call allFact ()}");
            while(rs.next()){
                Factura f = new Factura();
                f.setId(rs.getString("IdFactura"));
                f.setTotal(Double.parseDouble(rs.getString("Precio_Total")));
                Sistema.facturas.add(f);
            }
        }catch(SQLException se){
            se.printStackTrace();
        }
    }
    
    public static boolean validarUsuario(JTextField user, JPasswordField pass){
        Usuario uTemp = new Usuario();
        uTemp.setUser(user.getText());
        uTemp.setPass(new String(pass.getPassword()));
        for(Usuario u : Sistema.usuarios){
            if(u.compareTo(uTemp) == 1){
                Sistema.session=u;
                return true;
            }
        }
        return false;
    } 
    
    public static void filter(String query, JTable tabla, DefaultTableModel dfm) {
        TableRowSorter<DefaultTableModel> tr =new TableRowSorter<DefaultTableModel>(dfm);
        tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
}
