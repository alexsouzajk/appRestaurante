/**
 * 12/01/2019
 * @author Alex Souza de Jesus
*/
package apprestaurant;

import java.util.Scanner;

public class AppRestaurant {

    public static void main(String[] args) {
      
       Operacoes oper = new Operacoes();
       Scanner scanPedido = new Scanner(System.in);
       
       System.out.print("Digite o pedido seguindo o exemplo abaixo:\n"
                        +"manha,1,2,3,4\n");
       String pedido = scanPedido.nextLine();   
       
       String arraypedido[] = pedido.split(",");//Transfroma a string em um array onde cada posição é definida a partir de uma virgula
       
       for(int i=0; i < arraypedido.length ; i++){
       arraypedido[i] = arraypedido[i].replaceAll(" ","");
       }
       
       oper.pedido(arraypedido);

   } 
}
