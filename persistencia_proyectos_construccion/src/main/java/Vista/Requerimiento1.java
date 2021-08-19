package Vista;
//importaciones necesarias para su funcionamiento de  la GUI
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
// impor controlador que hace las peticiones a los DAO y la que registra los datos en el DAO
import Controlador.ElControladorDeRequerimientos;
import Modelo.vo.Requerimiento_1;


public class Requerimiento1 extends JFrame {
    public static final ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();

    public Requerimiento1() throws SQLException{
        initUI();
    }

    private void initUI() throws SQLException{

        setLayout(new BorderLayout());
        String []nombres ={"ID_Proyecto", "Ciudad", "Banco_Vinculado", "Constructora" };
        JTable tabla = new JTable(mostrar(),nombres);
        JScrollPane panel = new JScrollPane(tabla);
        add(panel,BorderLayout.EAST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400,150);
        setLocationRelativeTo(null);
        setVisible(true);
    }
public String [][] mostrar() throws SQLException{
    ArrayList<Requerimiento_1> lista_1 = new ArrayList<Requerimiento_1>();
    ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
    lista_1 = controlador.consultarRequerimiento1();
    String matriz[][] = new String [lista_1.size()][4];

    for (int i = 0; i < lista_1.size();i++){
        matriz[i][0]= String.valueOf(lista_1.get(i).getID_Proyecto());
        matriz[i][1]=lista_1.get(i).getCiudad();
        matriz[i][2]= lista_1.get(i).getBanco_Vinculado();
        matriz[i][3]=lista_1.get(i).getContructora();
    }
    return matriz;
}

}
