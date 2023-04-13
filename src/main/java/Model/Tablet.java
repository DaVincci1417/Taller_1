package Model;

import java.util.ArrayList;

public class Tablet extends DispositivoTecnologico{
    private String resolucionPantalla;
    public String accesorios;

    public Tablet(String marca, String memoriaRam, String memoriaAlmacenamiento,
                      String procesador, String modelo, String añoFabricacion, String precio,
                      int cantidadStock, String resolucionPantalla, String accesorios){
        super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, añoFabricacion, precio, cantidadStock);
        setResolucionPantalla(resolucionPantalla);
        setAccesorios(accesorios);
    }

    //Get Tipo
    @Override
    public String getTipo() {
        return "Tablet";
    }

    //Getters
    public String getResolucionPantalla() {
        return resolucionPantalla;
    }
    public String getAccesorios() {
        return accesorios;
    }

    //Setters
    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }
    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }
}
