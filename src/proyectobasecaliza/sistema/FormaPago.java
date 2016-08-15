package proyectobasecaliza.sistema;

public abstract class FormaPago {
    protected String id;
    protected String banco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
    
}
