
package Main;

import CONTROLADOR.Controlador_frm_Registrar_Producto;
import MODELO.ListarProductos;
import VISTA.frm_resgitrarproducto;
// import com.mysql.jdbc.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;

public class Principal {
    public static frm_resgitrarproducto frm_rp;
    public static CONTROLADOR.Controlador_frm_Registrar_Producto c_frm_rp;
    public static ListarProductos lp;
    
    public static void main(String[] args) {
        

        frm_rp =new frm_resgitrarproducto();
        frm_rp.setVisible(true);
        frm_rp.setLocationRelativeTo(null);
        
        c_frm_rp=new Controlador_frm_Registrar_Producto(frm_rp);
        lp=new ListarProductos();
        lp.MostrarTable(frm_rp.Tablaproductos);
      
    }
    
}
