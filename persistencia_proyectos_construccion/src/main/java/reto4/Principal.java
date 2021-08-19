package reto4;

import Vista.Requerimiento1;
import Vista.Requerimiento2;
import Vista.Requerimiento3;
import Vista.VistaRequerimientos;
import java.sql.*;
/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class Principal {
    public static void main(String[] args) throws SQLException {
 

     System.out.println("Requerimiento 1");
      
     Requerimiento1 reque_1 = new Requerimiento1() ;
     reque_1.mostrar();

    
     System.out.println("Requerimiento 2");
      
     Requerimiento2 reque_2 = new Requerimiento2() ;
     reque_2.mostrar();

        
    System.out.println("Requerimiento 3");
      
     Requerimiento3 reque_3 = new Requerimiento3() ;
     reque_3.mostrar();
     
     
     
    }
}
