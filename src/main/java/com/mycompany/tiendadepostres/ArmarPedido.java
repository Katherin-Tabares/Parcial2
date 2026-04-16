
package com.mycompany.tiendadepostres;

import com.murcia.utils.*;

public class ArmarPedido {
    private ListaEnlazada armarPedidoLlevar;
    private ListaEnlazada armarPedidoComanda;
    
    public ArmarPedido(){
        armarPedidoLlevar = new ColaEnlazada();
        armarPedidoComanda = new ColaEnlazada();
    }
    public ArmarPedido(ListaEnlazada armarPedidoLlevar, ListaEnlazada armarPedidoComanda){
        this.armarPedidoLlevar = armarPedidoLlevar;
        this.armarPedidoComanda = armarPedidoComanda;
    }
    
    public void AgregarPedidoLlevar (Object pedidoL) {
        armarPedidoLlevar.add(pedidoL);
    }
    public void AgregarPedidoComanda (Object pedidoC) {
        armarPedidoComanda.add(pedidoC);
    }
    public String mostrarPedidoLlevar (){
        String resultado = "";
        for (int i=0; i < armarPedidoLlevar.size(); i++){
            resultado += armarPedidoLlevar.get(i) + "\n__________________________________";
        } 
        return resultado;
    }
     public String mostrarPedidoComanda (){
        String resultado = "";
        for (int i=0; i < armarPedidoComanda.size(); i++){
            resultado += armarPedidoComanda.get(i) + "\n__________________________________";
        } 
        return resultado;
    }
}
