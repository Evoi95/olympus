package eu.uiniroma2.ing.iswp.olympus.entity;

import java.util.Objects;

public class Studente {

    private int id;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String codiceFiscale;
    private long matricola;
    private String corsoDiStudi;
    private String annoDiIscrizione;

    // Contructor

    public Studente(
            int id, String nome, String cognome, String email, String password,
            String codiceFiscale, long matricola, String corsoDiStudi, String annoDiIscrizione) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.codiceFiscale = codiceFiscale;
        this.matricola = matricola;
        this.corsoDiStudi = corsoDiStudi;
        this.annoDiIscrizione = annoDiIscrizione;
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

    public String getAnnoDiIscrizione(){
        return annoDiIscrizione;
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

    public void setAnnoDiIscrizione(String annoDiIscrizione) { this.annoDiIscrizione=annoDiIscrizione; }

    @Override
    public String toString() {
        return "Studente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", matricola=" + matricola +
                ", corsoDiStudi='" + corsoDiStudi + '\'' +
                ", annoDiIscrizione='" + annoDiIscrizione + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Studente)) return false;
        Studente studente = (Studente) o;
        return getId() == studente.getId() && getMatricola() == studente.getMatricola() && Objects.equals(getNome(), studente.getNome()) && Objects.equals(getCognome(), studente.getCognome()) && Objects.equals(getEmail(), studente.getEmail()) && Objects.equals(getPassword(), studente.getPassword()) && Objects.equals(getCodiceFiscale(), studente.getCodiceFiscale()) && Objects.equals(getCorsoDiStudi(), studente.getCorsoDiStudi()) && Objects.equals(getAnnoDiIscrizione(), studente.getAnnoDiIscrizione());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getCognome(), getEmail(), getPassword(), getCodiceFiscale(), getMatricola(), getCorsoDiStudi(), getAnnoDiIscrizione());
    }
}
