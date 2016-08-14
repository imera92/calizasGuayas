package proyectobasecaliza.sistema;

import java.util.Date;
import java.util.GregorianCalendar;

public class Factura {
    private String id;
    private Producto producto;
    private int sacosVendidos;
    private double total;
    private GregorianCalendar fechaEmision, fechaVencimiento;
    private EstadoFactura estado;
    private Retencion retencion;
}
