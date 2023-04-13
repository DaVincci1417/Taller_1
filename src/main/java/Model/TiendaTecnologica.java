package Model;

import java.util.ArrayList;

public class TiendaTecnologica{
    private String direccion;
    private ArrayList<DispositivoTecnologico> dispositivoTecnologicos;
    private ArrayList<Cliente> clientes;

    public TiendaTecnologica(String direccion){
        setDireccion(direccion);
    }

    //Getters
    public String getDireccion() {
        return direccion;
    }
    public ArrayList<DispositivoTecnologico> getDispositivoTecnologicos() {
        return dispositivoTecnologicos;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    //Setters
    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    private void setDispositivoTecnologicos(ArrayList<DispositivoTecnologico> dispositivoTecnologicos) {
        this.dispositivoTecnologicos = dispositivoTecnologicos;
    }
    private void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
