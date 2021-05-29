package AppliancesIS;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQL_Connection {

    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname  = "appliancesis";
    private static Integer portnumber  = 3306;
    private static String password = "";

    public static Connection getConnection()
    {
        Connection SQLConnection = null;

        MysqlDataSource datasource = new MysqlDataSource();

        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);

        try {
            SQLConnection = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + SQL_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return SQLConnection;
    }

}
