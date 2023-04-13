package eu.uiniroma2.ing.iswp.olympus.entity;

public class Studente {

    private int id;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String codiceFiscale;
    private long matricola;
    private String corsoDiStudi;

    // Contructor

    public Studente(
            int id, String nome, String cognome, String email, String password,
            String codiceFiscale, long matricola, String corsoDiStudi) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.codiceFiscale = codiceFiscale;
        this.matricola = matricola;
        this.corsoDiStudi = corsoDiStudi;
    }

    public Studente() {
    }

    // Getter

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public long getMatricola() {
        return matricola;
    }

    public String getCorsoDiStudi() {
        return corsoDiStudi;
    }

    //Setter

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public void setMatricola(long matricola) {
        this.matricola = matricola;
    }

    public void setCorsoDiStudi(String corsoDiStudi) {
        this.corsoDiStudi = corsoDiStudi;
    }
}
