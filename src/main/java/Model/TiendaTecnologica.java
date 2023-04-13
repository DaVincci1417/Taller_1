package Model;

import java.util.ArrayList;

public class TiendaTecnologica{
    private String direccion;
    private ArrayList<DispositivoTecnologico> dispositivoTecnologicos;
    private ArrayList<Cliente> clientes;

    private ArrayList<Venta> ventas;
    public TiendaTecnologica(String direccion){
        setDireccion(direccion);
    }

    //Metodos que buscan dispositvos tecnologicoss segun tipo, marca o modelo.
    public ArrayList<DispositivoTecnologico> buscarProductosSegunTipo(String tipo) {
        ArrayList<DispositivoTecnologico> productosDeLaCategoria = new ArrayList<>();
        if (dispositivoTecnologicos == null) {
            return null;
        } else {
            int posicion = -1;
            for (int i = 0; i < dispositivoTecnologicos.size(); i++) {
                if (dispositivoTecnologicos.get(i).getTipo().equalsIgnoreCase(tipo)) {
                    productosDeLaCategoria.add(dispositivoTecnologicos.get(posicion));
                }
            }
            if (posicion != -1) {
                return productosDeLaCategoria;
            } else {
                return null;
            }
        }
    }
    public ArrayList<DispositivoTecnologico> buscarProductosSegunMarca(String marca) {
        ArrayList<DispositivoTecnologico> productosDeLaCategoria = new ArrayList<>();
        if (dispositivoTecnologicos == null) {
            return null;
        } else {
            int posicion = -1;
            for (int i = 0; i < dispositivoTecnologicos.size(); i++) {
                if (dispositivoTecnologicos.get(i).getMarca().equalsIgnoreCase(marca)) {
                    productosDeLaCategoria.add(dispositivoTecnologicos.get(posicion));
                }
            }
            if (posicion != -1) {
                return productosDeLaCategoria;
            } else {
                return null;
            }
        }
    }
    public ArrayList<DispositivoTecnologico> buscarProductosSegunModelo(String modelo) {
        ArrayList<DispositivoTecnologico> productosDeLaCategoria = new ArrayList<>();
        if (dispositivoTecnologicos == null) {
            return null;
        } else {
            int posicion = -1;
            for (int i = 0; i < dispositivoTecnologicos.size(); i++) {
                if (dispositivoTecnologicos.get(i).getModelo().equalsIgnoreCase(modelo)) {
                    productosDeLaCategoria.add(dispositivoTecnologicos.get(posicion));
                }
            }
            if (posicion != -1) {
                return productosDeLaCategoria;
            } else {
                return null;
            }
        }
    }

    //Agregar y buscar clientes por nombre numero de contacto
    public void agregarClientes(Cliente cliente){
        clientes.add(cliente);
    }
    public Cliente buscarClienteSegunNumeroContacto(String numeroContacto) {
        if (dispositivoTecnologicos == null) {
            return null;
        } else {
            int posicion = -1;
            for (int i = 0; i < dispositivoTecnologicos.size(); i++) {
                if (clientes.get(i).getNumeroContacto().equalsIgnoreCase(numeroContacto)) {
                    posicion = i;
                }
            }
            if (posicion != -1) {
                return clientes.get(posicion);
            } else {
                return null;
            }
        }
    }
    //Realizar Vente
    public void realizarVenta(ArrayList<DispositivoTecnologico> dispositivoTecnologicos, Cliente cliente){
        if(dispositivoTecnologicos == null){
            System.out.println("No hay productos par vender");
        }else{
            Venta ventaNueva = new Venta(dispositivoTecnologicos, cliente, "Fecha Generica");
            for(int i = 0; i < dispositivoTecnologicos.size(); i++){
                this.dispositivoTecnologicos.remove(dispositivoTecnologicos.get(i));
            }
            ventas.add(ventaNueva);
        }
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
