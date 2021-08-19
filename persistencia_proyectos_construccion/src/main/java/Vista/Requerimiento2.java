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
import Modelo.vo.Requerimiento_2;

public class Requerimiento2 extends JFrame{

    public static final ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();

    public Requerimiento2() throws SQLException {
        initUI();

    }

    private void initUI() throws SQLException {
    
        setLayout(new BorderLayout());
        String[]nombres = {"Nombre", "Primer Apellido", "Ciudad Residencia", "Cargo", "Salario"};
        JTable tabla2 = new JTable(mostrar(),nombres);
        JScrollPane panel2 = new JScrollPane(tabla2);
        add(panel2,BorderLayout.WEST);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400,150);
        setLocationRelativeTo(null);
        setVisible(true);

    }
public String [][] mostrar() throws SQLException{
    ArrayList<Requerimiento_2> lista_2 = new ArrayList<Requerimiento_2>();
    ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
    lista_2 = controlador.consultarRequerimiento2();
    String matriz[][] = new String [lista_2.size()][5];

    for (int i = 0; i < lista_2.size();i++){
        matriz[i][0]= lista_2.get(i).getNombre();
        matriz[i][1]=lista_2.get(i).getPrimer_Apellido();
        matriz[i][2]= lista_2.get(i).getCiudad_Residencia();
        matriz[i][3]=lista_2.get(i).getCargo();
        matriz[i][4]=String.valueOf(lista_2.get(i).getSalario()); 
    }
    return matriz;
}
    
}
