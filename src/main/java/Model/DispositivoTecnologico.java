package Model;

public abstract class DispositivoTecnologico{
    protected String marca;
    protected String memoriaRam;
    protected String memoriaAlmacenamiento;
    protected String procesador;
    protected String modelo;
    protected String añoFabricacion;
    protected String precio;
    protected int cantidadStock;

    public DispositivoTecnologico(String marca, String memoriaRam, String memoriaAlmacenamiento,
                                  String procesador, String modelo, String añoFabricacion, String precio,
                                  int cantidadStock){
        setMarca(marca);
        setMemoriaRam(memoriaRam);
        setMemoriaAlmacenamiento(memoriaAlmacenamiento);
        setProcesador(procesador);
        setModelo(modelo);
        setAñoFabricacion(añoFabricacion);
        setPrecio(precio);
        setCantidadStock(cantidadStock);
    }

    public abstract String getTipo();

    //Getters
    public String getMarca() {
        return marca;
    }
    public String getMemoriaAlmacenamiento() {
        return memoriaAlmacenamiento;
    }
    public String getMemoriaRam() {
        return memoriaRam;
    }
    public String getProcesador() {
        return procesador;
    }
    public String getModelo() {
        return modelo;
    }
    public String getAñoFabricacion() {
        return añoFabricacion;
    }
    public String getPrecio() {
        return precio;
    }
    public int getCantidadStock() {
        return cantidadStock;
    }

    //Setters
    private void setMarca(String marca) {
        this.marca = marca;
    }
    private void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    private void setMemoriaAlmacenamiento(String memoriaAlmacenamiento) {
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
    }
    private void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    private void setModelo(String modelo) {
        this.modelo = modelo;
    }
    private void setAñoFabricacion(String añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    private void setPrecio(String precio) {
        this.precio = precio;
    }
    private void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
}
