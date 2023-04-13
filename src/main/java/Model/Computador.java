package Model;

public class Computador extends DispositivoTecnologico{
    private String tarjetaVideo;
    private String fuentePoder;
    private String chasis;
    private Pantalla pantallaAsociada;

    public Computador(String marca, String memoriaRam, String memoriaAlmacenamiento,
                      String procesador, String modelo, String añoFabricacion, String precio,
                      String cantidadStock, String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantallaAsociada){
        super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, añoFabricacion, precio, cantidadStock);
        setTarjetaVideo(tarjetaVideo);
        setFuentePoder(fuentePoder);
        setChasis(chasis);
        setPantallaAsociada(pantallaAsociada);
    }

    //Obtener informacion especifica de un dispositivo


    @Override
    public String obtenerInformacion(String informacionRequerida){
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
            case "tarjetaVideo":
                return getTarjetaVideo();
            case "fuentePoder":
                return getFuentePoder();
            case "chasis":
                return getChasis();
            case "pantallaAsociada":
                return getPantallaAsociada().getModelo();
            default:System.out.println("Ingrese una opcion valida");
        }
        return null;
    }

    //Get Tipo
    @Override
    public String getTipo() {
        return "Computador";
    }

    //Getters
    public String getTarjetaVideo() {
        return tarjetaVideo;
    }
    public String getFuentePoder() {
        return fuentePoder;
    }
    public String getChasis() {
        return chasis;
    }
    public Pantalla getPantallaAsociada() {
        return pantallaAsociada;
    }

    //Setters
    private void setTarjetaVideo(String tarjetaVideo) {
        this.tarjetaVideo = tarjetaVideo;
    }
    private void setFuentePoder(String fuentePoder) {
        this.fuentePoder = fuentePoder;
    }
    private void setChasis(String chasis) {
        this.chasis = chasis;
    }
    private void setPantallaAsociada(Pantalla pantallaAsociada) {
        this.pantallaAsociada = pantallaAsociada;
    }
}
