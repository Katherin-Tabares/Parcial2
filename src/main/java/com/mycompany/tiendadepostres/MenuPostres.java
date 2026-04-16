
package com.mycompany.tiendadepostres;

public class MenuPostres {
    private String Pchescake;
    private String Ptorta;
    
    
    public MenuPostres() {
        Pchescake = "CHEESECAKE";
        Ptorta = "TORTA";    
    }
    public String Pchescake () {
        return "maracuya, fresa, mora, coco";
    }
    public String Ptorta () {
        return "chocolate, vainilla, tresleches, redvelvet";
    }

    //metodo de menu mostrar opciones de postres y
    public String mostrarMenu() {
        return "1. Cheesecake\n2. Torta";
    }
    
    //Metodo mostrar sabores menu de Cheesecake y Torta
    public String saboresCheesecake() {
        return Pchescake + "\nSabores: Mora, Maracuya, Coco y Fresa";
    }    
    
    public String saboresTorta(){
      return Ptorta + "\nSabores: Chocolate, Vainilla, Tres Leches y Red Velvet";

    }
    
}
