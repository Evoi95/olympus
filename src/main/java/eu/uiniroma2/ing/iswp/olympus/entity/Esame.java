package eu.uiniroma2.ing.iswp.olympus.entity;

import java.util.Date;

public class Esame {

    private int id;
    private Date data;
    private String materia;
    private String note;
    private String voto;
    private int idProf;

    //Constructor

    public Esame(int id, Date data, String materia, String note, String voto, int idProf) {
        this.id = id;
        this.data = data;
        this.materia = materia;
        this.note = note;
        this.voto = voto;
        this.idProf = idProf;
    }


    //Getter

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public String getMateria() {
        return materia;
    }

    public String getNote() {
        return note;
    }

    public String getVoto() {
        return voto;
    }

    public int getIdProf() {
        return idProf;
    }

    //Setter

    public void setId(int id) {
        this.id = id;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }

    public void setIdProf(int idProf) {
        this.idProf = idProf;
    }
}
