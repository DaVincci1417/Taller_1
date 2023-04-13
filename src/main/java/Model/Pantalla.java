package Model;

public class Pantalla {
    private String marca;
    private String modelo;
    private String año;

    public Pantalla(String marca, String modelo, String año){
        setMarca(marca);
        setModelo(modelo);
        setAño(año);
    }

    //Getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getAño() {
        return año;
    }

    //Setters
    private void setMarca(String marca) {
        this.marca = marca;
    }
    private void setModelo(String modelo) {
        this.modelo = modelo;
    }
    private void setAño(String año) {
        this.año = año;
    }
}
