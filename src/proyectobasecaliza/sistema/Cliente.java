package proyectobasecaliza.sistema;

import java.util.ArrayList;

public class Cliente {
    private String id, nombre;
    private ArrayList<Pago> pagos;
    private ArrayList<Factura> facturas;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }
    
}
