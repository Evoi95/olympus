package eu.uiniroma2.ing.iswp.olympus.dao;

import eu.uiniroma2.ing.iswp.olympus.entity.Studente;
import eu.uiniroma2.ing.iswp.olympus.ulities.ConnToDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudenteDao {

    private static Statement st = null ;
    private static String query ;
    private static ResultSet rs;
    private static PreparedStatement prepQ = null;
    private static Connection conn =ConnToDb.generalConnection();;


    public static boolean creaStudente( Studente studente) throws SQLException {
        try {
            st=conn.createStatement();
            query = "INSERT INTO `olympus_db`.`studente`" +
                    "(" +
                    "`nome`," +
                    "`cognome`," +
                    "`email`," +
                    "`password`," +
                    "`codice fiscale`," +
                    "`matricola`," +
                    "`corso di studi`," +
                    "`anno iscrizione`)" +
                    "VALUES" +
                    " " +
                    "(?,?,?,?,?,?,?,?)";
            prepQ = conn.prepareStatement(query);
            prepQ.setString(1,studente.getNome());
            prepQ.setString(2,studente.getCognome());
            prepQ.setString(3,studente.getEmail());
            prepQ.setString(4,studente.getPassword());
            prepQ.setString(5,studente.getCodiceFiscale());
            prepQ.setString(6,""+studente.getMatricola());
            prepQ.setString(7,studente.getCorsoDiStudi());
            prepQ.setString(8,studente.getAnnoDiIscrizione());
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean eliminaStudente(Studente studente)
    {
        if(studente!=null)
        {
            try {
                query = "DELETE FROM `olympus_db`.`studente` WHERE "+studente.getId()+";";
                prepQ=conn.prepareStatement(query);
                if(prepQ.executeUpdate()==1)
                {
                    return true;
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return false;
    }

    //Faccio un for per le colonne dello Studente senza scrivere
    // una get per tutte le colonne
    public static Studente getStudenteData(Studente studente, ArrayList<String> colunmName) throws SQLException {
        if (!colunmName.isEmpty())
        {
            for (String colunm : colunmName) {
                query="SELECT "+colunm+" FROM olympus_db.studente where id = '"+studente.getId()+"'";
                try{
                    st=conn.createStatement();
                    rs = st.executeQuery(query);
                    if(rs.next())
                    {
                        //System.out.println(rs.getString(1));
                        String col = rs.getString(1);
                        switch (col) {
                            case "id":
                                studente.setId(Integer.parseInt(col));
                            case "nome":
                                studente.setNome(col);
                            case "cognome":
                                studente.setCognome(col);
                            case "email":
                                studente.setEmail(col);
                            case "password":
                                studente.setPassword(col);
                            case "codice fiscale":
                                studente.setCodiceFiscale(col);
                            case "matricola":
                                studente.setMatricola(Integer.parseInt(col));
                            case "corrso di studi":
                                studente.setCorsoDiStudi(col);
                            case "anno iscrizzione":
                                studente.setAnnoDiIscrizione(col);
                        }
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                return studente;
            }
        }
        return null;
    }

    public static Studente updateStudenteData(Studente studente, ArrayList<String> colunmName) throws SQLException {
        st=conn.createStatement();
        if (!colunmName.isEmpty())
        {
            for (String colunm : colunmName) {
                query="update "+colunm+" FROM olympus_db.studente where id = '"+studente.getId()+"'";
                try{
                    rs = st.executeQuery(query);
                    if(rs.next())
                    {
                        //System.out.println(rs.getString(1));
                        String col = rs.getString(1);
                        switch (col) {
                            case "id":
                                studente.setId(Integer.parseInt(col));
                            case "nome":
                                studente.setNome(col);
                            case "cognome":
                                studente.setCognome(col);
                            case "email":
                                studente.setEmail(col);
                            case "password":
                                studente.setPassword(col);
                            case "codice fiscale":
                                studente.setCodiceFiscale(col);
                            case "matricola":
                                studente.setMatricola(Integer.parseInt(col));
                            case "corrso di studi":
                                studente.setCorsoDiStudi(col);
                            case "anno iscrizzione":
                                studente.setAnnoDiIscrizione(col);
                        }
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                return studente;
            }
        }
        return null;
    }
    

}
