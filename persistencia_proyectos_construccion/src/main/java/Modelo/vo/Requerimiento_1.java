package Modelo.vo;

public class Requerimiento_1 {


private Integer ID_Proyecto;
private String Ciudad;
private String Banco_Vinculado;
private String Contructora;



public Requerimiento_1() {

}

public Requerimiento_1(Integer iD_Proyecto, String ciudad, String banco_Vinculado, String contructora) {
    ID_Proyecto = iD_Proyecto;
    Ciudad = ciudad;
    Banco_Vinculado = banco_Vinculado;
    Contructora = contructora;
}
public Integer getID_Proyecto() {
    return ID_Proyecto;
}
public void setID_Proyecto(Integer iD_Proyecto) {
    ID_Proyecto = iD_Proyecto;
}
public String getCiudad() {
    return Ciudad;
}
public void setCiudad(String ciudad) {
    Ciudad = ciudad;
}
public String getBanco_Vinculado() {
    return Banco_Vinculado;
}
public void setBanco_Vinculado(String banco_Vinculado) {
    Banco_Vinculado = banco_Vinculado;
}
public String getContructora() {
    return Contructora;
}
public void setContructora(String contructora) {
    Contructora = contructora;
}


}

