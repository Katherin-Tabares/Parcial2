
package com.mycompany.tiendadepostres;


public class Cliente {
   //Atributos
    private String nomCliente;
    private String telCliente;
    private String direcCliente;
  
    //metodos
    
    public Cliente () {} 
    
    public Cliente (String nombre, String telefono, String direccion){
        this.nomCliente = nombre;
        this.telCliente = telefono;
        this.direcCliente = direccion;
    }
    public String getnomCliente(){
        return nomCliente;
    }
    public void setnomCliente(String nomCliente){
        this.nomCliente = nomCliente;
    }
    public String gettelCliente(){
        return telCliente;
    }
    public void settelCliente(String telCliente){
        this.telCliente = telCliente;
    }
    public String getdirecCliente(){
        return direcCliente;
    }
    public void setdirecCliente(String direcCliente){
         this.direcCliente = direcCliente;
    }
    public String InfoComanda (){
     return "Nombre del Cliente: " + nomCliente;   
    }
    public String InfoPedidoLevar(){
    return "Nombre del Cliente: " + nomCliente + 
            "\nTelefono del Cliente: " + telCliente + 
            "\nDireccion: " + direcCliente;
    }
    /*public String mostrarPedidoLlevar (){
        nomCliente.setnomCliente = 0;
        return nomCliente;
    }*/
    
    
    
    
    
}
