
package com.mycompany.tiendadepostres;

import com.murcia.utils.*;


public class Comanda {
    private int nmesa;
    private int cantPostre;
    private Postre postre;
    private Cliente cliente;
    //private ListaEnlazada armarPedido;
    
    
    public Comanda(){}
    public Comanda(int nmesa, int cantPostre, Postre postre, Cliente cliente) {
        this.nmesa = nmesa;
        this.cantPostre = cantPostre;
        this.postre = postre;
        this.cliente = cliente;
        
    }
    
    public int getNmesa() {
        return nmesa;
    }

    public void setNmesa(int nmesa) {
        this.nmesa = nmesa;
    }

    public int getCantPostre() {
        return cantPostre;
    }

    public void setCantPostre(int cantPostre) {
        this.cantPostre = cantPostre;
    }
    /*public void AgregarPedido (Object pedido) {
        ListaEnlazada armarPedido = new ColaEnlazada();
        armarPedido.add(pedido);
    }*/
    
    public String toString(){
        return "\nCliente: " + cliente.InfoComanda() + 
                "\nPostre del Pedido: " + postre +
                "\nNumero de mesa: " + nmesa +
                "\nCandidad de postres: " + cantPostre;
    }
    
}
