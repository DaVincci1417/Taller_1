package Controller;

import Model.Cliente;
import Model.Computador;
import Model.Tablet;
import Model.TiendaTecnologica;

public class Launcher {
    public static void inicializar(){
        TiendaTecnologica tiendaTecnologica = new TiendaTecnologica("Visivir 02170");
        tiendaTecnologica.agregarDispositivosTecnologicos(new Tablet("Marca Generica","1",
                "2 Tb", "Android", "J5",
                "2023", "120.000", "5", "120 Hz",
                "Ninguno"));
        tiendaTecnologica.agregarClientes(new Cliente("Eliezer", "Caniulaf", "ecaniulaf.20@gmail.com",
                "+56976255361", "Soltero", "Temuco"));
        tiendaTecnologica.realizarVenta(tiendaTecnologica.buscarProductosSegunTipo("Tablet"),tiendaTecnologica.getClientes().get(0));
    }

    public static void main(String [] args){

    }
}
