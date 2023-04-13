package Model;

public class Cliente {
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String numeroContacto;
    private String estadoCivil;
    private String ciudad;

    public Cliente(String nombre, String apellido, String correoElectronico, String numeroContacto, String estadoCivil, String ciudad){
        setNombre(nombre);
        setApellido(apellido);
        setCorreoElectronico(correoElectronico);
        setNumeroContacto(numeroContacto);
        setEstadoCivil(estadoCivil);
        setCiudad(ciudad);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public String getNumeroContacto() {
        return numeroContacto;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public String getCiudad() {
        return ciudad;
    }

    //Setters
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setApellido(String apellido) {
        this.apellido = apellido;
    }
    private void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    private void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
    private void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    private void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
