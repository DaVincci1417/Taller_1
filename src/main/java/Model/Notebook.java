package Model;

public class Notebook extends DispositivoTecnologico{
    private String resolucionPantalla;
    private String tecladoIntegrado;
    private String bateria;

    public Notebook(String marca, String memoriaRam, String memoriaAlmacenamiento,
                      String procesador, String modelo, String añoFabricacion, String precio,
                      int cantidadStock, String resolucionPantalla, String tecladoIntegrado, String bateria){
        super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, añoFabricacion, precio, cantidadStock);
        setResolucionPantalla(resolucionPantalla);
        setTecladoIntegrado(tecladoIntegrado);
        setBateria(bateria);
    }

    //Get Tipo
    @Override
    public String getTipo() {
        return "Notebook";
    }

    //Getters
    public String getResolucionPantalla() {
        return resolucionPantalla;
    }
    public String getTecladoIntegrado() {
        return tecladoIntegrado;
    }
    public String getBateria() {
        return bateria;
    }

    //Setters
    private void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }
    private void setTecladoIntegrado(String tecladoIntegrado) {
        this.tecladoIntegrado = tecladoIntegrado;
    }
    private void setBateria(String bateria) {
        this.bateria = bateria;
    }
}
