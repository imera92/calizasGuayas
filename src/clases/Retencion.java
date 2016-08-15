package clases;

public class Retencion {
    private String numero;
    private double porcentaje;
    private double valorRetenido;
    private Factura factura;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getValorRetenido() {
        return valorRetenido;
    }

    public void setValorRetenido(double valorRetenido) {
        this.valorRetenido = valorRetenido;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    
    
}
