package proyectobasecaliza.sistema;

import java.util.GregorianCalendar;

public class Pago {
    private String comprobante;
    private GregorianCalendar fechaPago;
    private double valorCancelado;
    private Factura factura;

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }
    
    public GregorianCalendar getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(GregorianCalendar fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getValorCancelado() {
        return valorCancelado;
    }

    public void setValorCancelado(double valorCancelado) {
        this.valorCancelado = valorCancelado;
    }
    
    
}
