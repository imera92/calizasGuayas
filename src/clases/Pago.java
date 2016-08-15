package clases;

import java.util.GregorianCalendar;

public class Pago {
    private String comprobante;
    private GregorianCalendar fechaPago;
    private double valorCancelado;
    private Factura factura;
    private FormaPago formaDePago;

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

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public FormaPago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaPago formaDePago) {
        this.formaDePago = formaDePago;
    }
    
}
