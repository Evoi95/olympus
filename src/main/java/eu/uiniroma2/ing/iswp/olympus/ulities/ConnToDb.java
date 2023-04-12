package eu.uiniroma2.ing.iswp.olympus.ulities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

public class ConnToDb
{
    protected static Connection conn = null;
    static Config c =new Config();
    protected static String url2;
    private static boolean status=false;

    public static boolean initailConnection()
    {
        try
        {
            Class.forName(c.getDriver());
            conn = DriverManager.getConnection(c.getUrl(), c.getUser(),c.getPwd());
            status= true;

        }
        catch (SQLException | ClassNotFoundException  e1)
        {
            e1.printStackTrace();
        }
        return status;
    }

    public static boolean connection() throws SQLException {
        boolean status=false;
        try
        {
            if(initailConnection())
            {
                //actuac DB project
                url2 = "jdbc:mysql://localhost/Olympus_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
                Class.forName(c.getDriver());
                conn = DriverManager.getConnection(url2, c.getUser(),c.getPwd());
                status= true;
            }

        }
        catch (SQLException | ClassNotFoundException  e1)
        {
            e1.printStackTrace();
        }
        return status;
    }

    public static Connection generalConnection()
    {
        try
        {
            url2 = "jdbc:mysql://localhost/Olympus_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Class.forName(c.getDriver());
            conn = DriverManager.getConnection(url2, c.getUser(),c.getPwd());

        }
        catch (SQLException  | ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        return conn;

    }
    private ConnToDb(){
    }


}