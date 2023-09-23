
package Conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMysql {
    Connection cn;
    
    public Connection  conectar(){
        try{
            Class.forName("com.mysql.jbdc.Driver");
            cn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/miproyecto1","root","");
            System.out.println("conexion exitosa");
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Error de conexion"+e);
        }
        return cn;
    }
}
