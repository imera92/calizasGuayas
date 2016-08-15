package proyectobasecaliza.sistema;

public class Usuario implements Comparable<Usuario>{
    private String user;
    private String pass;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public int compareTo(Usuario u) {
        if(this.user.equals(u.user) && this.pass.equals(u.pass)) return 1;
        return 0;
    }
}
