package Modelo.vo;


public class Requerimiento_3 {

    public Requerimiento_3() {

    }

    public Requerimiento_3(String proveedor, String pagado, String constructora) {
        Proveedor = proveedor;
        Pagado = pagado;
        Constructora = constructora;
    }

    public Requerimiento_3(String pagado, String constructora) {
        Pagado = pagado;
        Constructora = constructora;
    }

    private String Proveedor;
    private String Pagado;
    private String Constructora;


    public String getProveedor() {
        return Proveedor;
    }
    public void setProveedor(String proveedor) {
        Proveedor = proveedor;
    }
    public String getPagado() {
        return Pagado;
    }
    public void setPagado(String pagado) {
        Pagado = pagado;
    }
    public String getConstructora() {
        return Constructora;
    }
    public void setConstructora(String constructora) {
        Constructora = constructora;
    }

}
