
package proyectobasecaliza;

public class Main {
    public static void main(String[] args) {
        Sistema.incializarSistema();

        VLogin ventana = new VLogin();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
