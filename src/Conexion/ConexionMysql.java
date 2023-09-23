
package Conexion;

// import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionMysql {
    Connection cn;
    
    public Connection  conectar(){
        try{
            // Class.forName("com.mysql.jbdc.Driver");
            // cn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/miproyecto","root","");
            
            String url = "jdbc:mysql://localhost:3306/miproyecto";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "");
            cn = (Connection) DriverManager.getConnection(url, info);
            System.out.println("conexion exitosa");
        } catch(SQLException e) {
            System.out.println("No se conecta");
                System.out.println("Error al conectar DB" + e);;
        }
        return cn;
        
        /*
        try{
            Class.forName("com.mysql.jbdc.Driver");
            cn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/miproyecto","root","");
            System.out.println("conexion exitosa");
        } cattem.out.println("Error de conexion"+e);
        }
        return cn;ch (ClassNotFoundException | SQLException e){
            System.out.println("Error de conexion"+e);
        }
        return cn;
        */
    }
}

 
