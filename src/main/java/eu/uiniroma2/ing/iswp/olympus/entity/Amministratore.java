package eu.uiniroma2.ing.iswp.olympus.entity;

public class Amministratore {

    private int id;
    private String nome;
    private String email;
    private String pass;
    private String dipartimento;

    public Amministratore(int id, String nome, String email, String pass, String dipartimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.pass = pass;
        this.dipartimento = dipartimento;
    }

    //Getter
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getPass() {
        return pass;
    }
    public String getDipartimento() {
        return dipartimento;
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }
}
