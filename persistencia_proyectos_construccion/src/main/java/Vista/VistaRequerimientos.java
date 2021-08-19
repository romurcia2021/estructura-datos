package Vista;

import java.util.ArrayList;

import Controlador.ElControladorDeRequerimientos;

import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();

    public static void requerimiento1(){
        
        try {

             ArrayList<Requerimiento_1>  lista1 =controlador.consultarRequerimiento1();

            for (Requerimiento_1 reque_1:lista1){
                System.out.printf("%d %s %s %s %n",
                reque_1.getID_Proyecto(),
                reque_1.getCiudad(),
                reque_1.getBanco_Vinculado(),
                reque_1.getContructora());
            }
            
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static  void requerimiento2(){
        
        try {
            // Su código 
            
            ArrayList<Requerimiento_2>  lista2 =controlador.consultarRequerimiento2();

            for (Requerimiento_2 reque_2:lista2){
            
                System.out.printf("%s %s %s %s %d %n", reque_2.getNombre(),reque_2.getPrimer_Apellido(),reque_2.getCiudad_Residencia(),reque_2.getCargo(),reque_2.getSalario());
             }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static  void requerimiento3(){
        try {
           // Su código
           ArrayList<Requerimiento_3> lista3 = controlador.consultarRequerimiento3();

           for (Requerimiento_3 reque_3:lista3){
               System.out.printf("%s %s %s %n",
                                    reque_3.getProveedor(),
                                    reque_3.getPagado(),
                                    reque_3.getConstructora());
           }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }
}
