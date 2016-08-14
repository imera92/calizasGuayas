package proyectobasecaliza.sistema;

import java.util.GregorianCalendar;

public class Pago {
    private GregorianCalendar   fechaPago;
    private double valorCancelado;

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
