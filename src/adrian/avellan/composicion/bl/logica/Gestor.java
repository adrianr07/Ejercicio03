package adrian.avellan.composicion.bl.logica;


import adrian.avellan.composicion.bl.entidades.Factura;

import java.util.ArrayList;

public class Gestor {

    public ArrayList<Factura> facturas;

    public Gestor() {
        this.facturas = new ArrayList<>();
    }

    public void registrarFactura(Factura nuevaFactura){
        Factura nueva = new Factura();
        facturas.add(nueva);
    }

    public ArrayList<Factura> listarFacturas(){
        return this.facturas;
    }


}
