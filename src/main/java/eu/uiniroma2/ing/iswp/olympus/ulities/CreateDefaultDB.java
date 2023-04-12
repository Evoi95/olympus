package eu.uiniroma2.ing.iswp.olympus.ulities;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.ibatis.jdbc.ScriptRunner;

public class CreateDefaultDB {

    private static Connection connection = ConnToDb.conn ;

    public static void createDefaultDB() throws SQLException, FileNotFoundException {
        boolean status =  ( ConnToDb.initailConnection() && ConnToDb.connection());
        //creazione database
        if (!status)
        {
            String filePath = "src/main/resources/eu/uiniroma2/ing/iswp/olympus/SQL_Scripts/database_structure.sql";
            try {
                InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath));
                new ScriptRunner(connection).runScript(reader);
                connection.close();
            } catch (Exception e)
            {
                connection.close();
                e.printStackTrace();
            }
        }
    }

    public static void populateDB(){

    }

}
