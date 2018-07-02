package dao;

import java.sql.*;

/**
 * Created by Procislaw on 27.06.2018.
 */
public class MysqlDao implements Idao {
   private Connection conn = new MysqlConn().getConnection();


   


    public void getAllWords() throws  SQLException{

        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * from words");
        ResultSet rs = preparedStatement.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();

        while (rs.next()) {
            for (int i = 1; i <= columnsNumber; i++) {
                if (i > 1) System.out.print(",  ");
                String columnValue = rs.getString(i);
                System.out.print(columnValue + " " + rsmd.getColumnName(i));
            }
            System.out.println("");
        }






    }
}
