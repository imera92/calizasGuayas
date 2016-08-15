package clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class Factura {
    private String id;
    private Producto producto;
    private int sacosVendidos;
    private double total;
    private GregorianCalendar fechaEmision, fechaVencimiento;
    private EstadoFactura estado;
    private Cliente cliente;
    private ArrayList<Pago> pagos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getSacosVendidos() {
        return sacosVendidos;
    }

    public void setSacosVendidos(int sacosVendidos) {
        this.sacosVendidos = sacosVendidos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public GregorianCalendar getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(GregorianCalendar fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public GregorianCalendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(GregorianCalendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public EstadoFactura getEstado() {
        return estado;
    }

    public void setEstado(EstadoFactura estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
    }
    
}
