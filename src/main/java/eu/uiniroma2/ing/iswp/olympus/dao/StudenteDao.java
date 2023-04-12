package eu.uiniroma2.ing.iswp.olympus.dao;

import eu.uiniroma2.ing.iswp.olympus.entity.Studente;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

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

    //Faccio un for per le props dello Studente senza scrivere tutti i campi

    

}
