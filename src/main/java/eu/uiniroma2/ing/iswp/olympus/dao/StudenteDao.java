package eu.uiniroma2.ing.iswp.olympus.dao;

import eu.uiniroma2.ing.iswp.olympus.entity.Studente;
import eu.uiniroma2.ing.iswp.olympus.ulities.ConnToDb;
import javafx.scene.SubScene;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudenteDao {

    private static Statement st = null ;
    private static String query ;
    private static ResultSet rs;
    private static PreparedStatement prepQ = null;
    private static Connection conn;
    private static int max;
    private static String r;
    private static boolean state=false;

    public static boolean creaStudente( Studente studente)
    {
        return false;
    }

    public static boolean modificaStudente(Studente studente){
        return false;
    }

    public static boolean eliminaStudente(int idStudente)
    {
        return false;
    }

    //Faccio un for per le colonne dello Studente senza scrivere
    // una get per tutte le colonne
    public static ArrayList<Studente> getStudenteData(int idStudente, ArrayList<String> colunmName) throws SQLException {
        ArrayList<Studente> students = new ArrayList<>();
        Studente studente = new Studente();
        conn = ConnToDb.generalConnection();
        st=conn.createStatement();
        if (!colunmName.isEmpty())
        {
            studente.setId(idStudente);
            for (String colunm : colunmName) {
                query="SELECT "+colunm+" FROM olympus_db.studente where id = '"+idStudente+"'";
                System.out.println(query);
                rs = st.executeQuery(query);
                if(rs.next())
                {
                    System.out.println(rs.getString(1));
                }


                // dovrei mettere uno switch case per le props

            }
            return students;
        }
        return null;

    }
    

}
