package Model;

import java.util.ArrayList;

public class Tablet extends DispositivoTecnologico{
    private String resolucionPantalla;
    public String accesorios;

    public Tablet(String marca, String memoriaRam, String memoriaAlmacenamiento,
                      String procesador, String modelo, String añoFabricacion, String precio,
                      String cantidadStock, String resolucionPantalla, String accesorios){
        super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, añoFabricacion, precio, cantidadStock);
        setResolucionPantalla(resolucionPantalla);
        setAccesorios(accesorios);
    }

    @Override
    public String obtenerInformacion(String informacionRequerida) {
        switch (informacionRequerida){
            case "marca":
                return getMarca();
            case "memoriaRam":
                return getMemoriaRam();
            case "memoriaAlmacenamiento":
                return getMemoriaAlmacenamiento();
            case "procesador":
                return getProcesador();
            case "modelo":
                return getModelo();
            case "añoFabricacion":
                return getAñoFabricacion();
            case "precio":
                return getPrecio();
            case "cantidadStock":
                return getCantidadStock();
            case "resolucionPantalla":
                return getResolucionPantalla();
            case "accesorios":
                return getAccesorios();
            default:System.out.println("Ingrese una opcion valida");
        }
        return null;
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
