package Model;

import java.util.ArrayList;

public class Venta {
    private ArrayList<DispositivoTecnologico> dispositivoTecnologicos;
    private Cliente clienteAsociado;
    private String fechaCompra;

    public Venta(ArrayList<DispositivoTecnologico> dispositivoTecnologicos, Cliente clienteAsociado, String fechaCompra){
        setDispositivoTecnologicos(dispositivoTecnologicos);
        setClienteAsociado(clienteAsociado);
        setFechaCompra(fechaCompra);
    }

    //Getters
    public ArrayList<DispositivoTecnologico> getDispositivoTecnologicos() {
        return dispositivoTecnologicos;
    }
    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }
    public String getFechaCompra() {
        return fechaCompra;
    }

    //Setters
    private void setDispositivoTecnologicos(ArrayList<DispositivoTecnologico> dispositivoTecnologicos) {
        this.dispositivoTecnologicos = dispositivoTecnologicos;
    }
    private void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }
    private void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
