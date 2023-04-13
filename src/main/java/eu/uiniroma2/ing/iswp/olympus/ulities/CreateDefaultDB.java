package eu.uiniroma2.ing.iswp.olympus.ulities;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.ibatis.jdbc.ScriptRunner;

public class CreateDefaultDB {


    //Funzione per creazione del database, nel caso non esista
    public static void createDefaultDB() throws SQLException, FileNotFoundException {
        boolean status =  ( ConnToDb.initailConnection() && ConnToDb.connection());
        if (!status)
        {
            String filePath = "src/main/resources/eu/uiniroma2/ing/iswp/olympus/SQL_Scripts/database_structure.sql";
            try {
                InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath));
                new ScriptRunner(ConnToDb.conn).runScript(reader);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    //Funzione per popolare il database dati di test
    public static void populateDB(){

    }

}
