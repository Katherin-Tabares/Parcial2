//Integrantes: Katherin Samantha Tabares Castillo (6014474) y Dayanna Acosta Ledesma (6014503)

package com.mycompany.tiendadepostres;

import com.murcia.utils.*;
public class TiendaDePostres {

    public static void main(String[] args) {
        
        MenuPostres menu = new MenuPostres();
        ArmarPedido lisComanda = new ArmarPedido();
        ArmarPedido lisPedidoLlevar = new ArmarPedido();
        
        final char SALIR = '6';
        String []opt = {"1. Comanda", "2. Para llevar", "3. Mostrar pedidos comanda", 
            "4. Mostrar pedidos para Llevar", "5. Buscar","6. Terminar"};
        Menu mnu = new Menu(opt, 'V', " ", "TIENDA DE POSTRES EEVEEBURON");
        char opc;

        do {
            System.out.println("________________________________" + "\nMENU");
            System.out.println(menu.saboresCheesecake());
            System.out.println(menu.saboresTorta());
            System.out.println("_________________________________");
            Consola.clrscr(); // Borra pantalla
            Consola.gotoxy(0, 0);
            opc = mnu.select("Su opcion [1-5]: ");
            Input.nextLine("");
            if (opc == '1'){ //Comanda
                String n, ps;
                int pr, m;
                
                n=Input.nextLine("Nombre cliente: ");
                Cliente c = new Cliente(n, "No necesita", "No necesita");
                
                ps = Input.nextLine("Nombre del postre: ");
                pr = Input.nextInt("Cantidad de porciones: ");
                Postre p = new Postre(ps, pr);
                
                m = Input.nextInt("Numero de mesa: ");
                
                Comanda co = new Comanda(m, pr, p, c);
                lisComanda.AgregarPedidoComanda(co);
                
            }    
            if (opc == '2'){//pedido llevar
               String n, t, d, ps;
               int pr;
               
               n=Input.nextLine("Nombre cliente: ");
               t=Input.nextLine("Telefono: ");
               d=Input.nextLine("Direccion: ");
               Cliente c = new Cliente(n, t, d);
               
               ps = Input.nextLine("Nombre del postre: ");
               pr = Input.nextInt("Cantidad de porciones: ");
               Postre p = new Postre(ps, pr);
               
               PedidoLlevar co = new PedidoLlevar(p, c, pr);
                lisPedidoLlevar.AgregarPedidoLlevar(co);
            }
            if (opc == '3'){//mostrar pedidos
                System.out.println("____________________________" + "\nPEDIDOS COMANDA");
                System.out.println(lisComanda.mostrarPedidoComanda());
                System.out.println("");
                //Comanda.mostrarPedido();
            }
            if (opc == '4'){//mostrar pedidos
                System.out.println( "____________________________" + "\nPEDIDOS PARA LLEVAR");
                System.out.println(lisPedidoLlevar.mostrarPedidoLlevar());
                System.out.println("");
               
            }if (opc == '5'){//buscar
                String pre;
                pre=Input.nextLine("Nombre cliente que desea buscar: ");
                if(pre == n.getnomCliente){
                    
                }
               
            }
        } while (opc != SALIR);
        
    }  
  
    
}
