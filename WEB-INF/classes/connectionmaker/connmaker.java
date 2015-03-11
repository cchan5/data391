/*This code is for making the connection to oracle and sending and retrieving information about login data
*/
package connectionmaker;
import java.sql.*;
import java.io.*;
import java.io.IOException;

/*This method creates a connection to connect to oracle*/
public class connmaker{
  String USER = ""; //Change these parameters when testing to your oracle password :)
  String PASSWORD = "";
  public Connection mkconn(){
    Connection conn = null;
    String driverName = "oracle.jdbc.driver.OracleDriver";
    String dbstring = "jdbc:oracle:thin:@gwynne.cs.ualberta.ca:1521:CRS";
    try {
      Class drvClass = Class.forName(driverName);
      DriverManager.registerDriver((Driver) drvClass.newInstance());
      conn = DriverManager.getConnection(dbstring, USER, PASSWORD); 
      conn.setAutoCommit(false);
      return conn;
    }
    catch(Exception ex){
      return null;
    }
  }

}






