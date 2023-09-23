
package MODELO;
import Conexion.ConexionMysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
    


public class ListarProductos {

       
    ConexionMysql con=new ConexionMysql();
    Connection cn=con.conectar();
    
    public void MostrarTable(JTable tabla){
      DefaultTableModel modelo= new DefaultTableModel();
      modelo.addColumn("id");
      modelo.addColumn("nombre");
      modelo.addColumn("cantidad");
      modelo.addColumn("precio");
      modelo.addColumn("total");
      
      String consultasql="SELECT*FROM producto";
      Statement st;
      try{
          st=cn.createStatement();
          ResultSet rs = st.executeQuery(consultasql);
          while(rs.next()){
              Object [] lista={rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5) };
              modelo.addRow(lista);
          }
          tabla.setModel(modelo);
      } catch (Exception e){
          System.out.println("ERROR AL ALISTAR LOS DATOS"+e);
          
      }
    }

    /*
    public void MostrarTabla(JTable Tablaproductos) {
        throw new UnsupportedOperationException("Not supported yet. *-*-*-*"); //To change body of generated methods, choose Tools | Templates.
    }
    */

    
}
