package Vista;

import javax.swing.JFrame;

import Controlador.ElControladorDeRequerimientos;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.ArrayList;

// impor controlador que hace las peticiones a los DAO y la que registra los datos en el DAO
import Modelo.vo.Requerimiento_3;

public class Requerimiento3 extends JFrame {

    public static final ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();

    public Requerimiento3() throws SQLException {
        initUT();

    }

    private void initUT() throws SQLException {

        // public void initUI() throws SQLException{
        setLayout(new BorderLayout());
        String[] nombres = { "Provedor", "Pagado", "Constructora" };
        JTable tabla3 = new JTable(mostrar(), nombres);
        JScrollPane panel3 = new JScrollPane(tabla3);
        add(panel3, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String[][] mostrar() throws SQLException{
        ArrayList<Requerimiento_3> lista_3 = new ArrayList<Requerimiento_3>();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista_3 = controlador.consultarRequerimiento3();
        String [][] matriz  =new String [lista_3.size()][3];

        for (int i=0 ; i< lista_3.size(); i++){
            matriz[i][0]=lista_3.get(i).getProveedor();
            matriz[i][1]=lista_3.get(i).getPagado();
            matriz[i][2]=lista_3.get(i).getConstructora();
        }
        return matriz;
    }
}
