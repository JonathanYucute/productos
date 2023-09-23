
package CONTROLADOR;

import MODELO.ListarProductos;
import MODELO.Producto;
import MODELO.Registro;
import VISTA.frm_resgitrarproducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_frm_Registrar_Producto implements ActionListener{
    frm_resgitrarproducto frm_rp;

    public Controlador_frm_Registrar_Producto(frm_resgitrarproducto frm_rp) {
        this.frm_rp = frm_rp;
        this.frm_rp.btnguardar.addActionListener(this);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==frm_rp.btnguardar){
            
            String nombre = frm_rp.txtnombre.getText();
            int cantidad = Integer.parseInt(frm_rp.txtcantidad.getText());
            Double precio= Double.parseDouble(frm_rp.txtprecio.getText());
            
            Producto P=new Producto( nombre, cantidad, precio );
            Registro R=new Registro();
            R.registrarbd(P);
            
            
            ListarProductos lp=new ListarProductos();
            lp.MostrarTabla(frm_rp.Tablaproductos);
            
            limpiarentradas();
        }
    }

    private void limpiarentradas() {
        frm_rp.txtnombre.setText("");
        frm_rp.txtcantidad.setText("");
        frm_rp.txtprecio.setText("");
    }
    
}
