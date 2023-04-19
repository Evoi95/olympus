package eu.uiniroma2.ing.iswp.olympus.entity;

import java.util.Objects;

public class Professore {

    private int id;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String codiceFiscale;
    private String matricola;
    private String materia;
    private String ruolo;

    //Contructor

    public Professore(int id, String nome, String cognome, String email, String password, String codiceFiscale, String matricola, String materia, String ruolo) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.codiceFiscale = codiceFiscale;
        this.matricola = matricola;
        this.materia = materia;
        this.ruolo = ruolo;
    }

    //Getter
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
    public String getMatricola() {
        return matricola;
    }
    public String getMateria() {
        return materia;
    }
    public String getRuolo() {
        return ruolo;
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
    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professore)) return false;
        Professore that = (Professore) o;
        return getId() == that.getId() && Objects.equals(getNome(), that.getNome()) && Objects.equals(getCognome(), that.getCognome()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getPassword(), that.getPassword()) && Objects.equals(getCodiceFiscale(), that.getCodiceFiscale()) && Objects.equals(getMatricola(), that.getMatricola()) && Objects.equals(getMateria(), that.getMateria()) && Objects.equals(getRuolo(), that.getRuolo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getCognome(), getEmail(), getPassword(), getCodiceFiscale(), getMatricola(), getMateria(), getRuolo());
    }

    @Override
    public String toString() {
        return "Professore{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", matricola='" + matricola + '\'' +
                ", materia='" + materia + '\'' +
                ", ruolo='" + ruolo + '\'' +
                '}';
    }
}
