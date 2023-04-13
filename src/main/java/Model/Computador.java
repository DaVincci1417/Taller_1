package Model;

import java.security.cert.PKIXParameters;

public class Computador extends DispositivoTecnologico{
    private String tarjetaVideo;
    private String fuentePoder;
    private String chasis;
    private Pantalla pantallaAsociada;

    public Computador(String marca, String memoriaRam, String memoriaAlmacenamiento,
                      String procesador, String modelo, String añoFabricacion, String precio,
                      int cantidadStock, String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantallaAsociada){
        super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, añoFabricacion, precio, cantidadStock);
        setTarjetaVideo(tarjetaVideo);
        setFuentePoder(fuentePoder);
        setChasis(chasis);
        setPantallaAsociada(pantallaAsociada);
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
