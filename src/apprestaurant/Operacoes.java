/**
 * 12/01/2019
 * @author Alex Souza de Jesus
 */
package apprestaurant;

public class Operacoes {
    
    public static void pedido(String pedido[]){
        
        int entrada = 0;
        int acompanhamento = 0;
        int bebida = 0;
        int sobremesa = 0;
        int erro = 0;
        StringBuilder pedidoFinal = new StringBuilder();
        
        String periodo = pedido[0];//Passa a primeira posição do array para uma variável
        periodo = periodo.toLowerCase();//deixa todas as letras da variável minusculas
        
        if(!periodo.equals("noite")){
           char per[] = periodo.toCharArray();  
           per[4] = 'ã';//troca o 'a' por 'â' em 'manha' 
           periodo = new String(per);
        }

        //verifica se o periodo escolhido é valido
        if(!periodo.equals("manhã") && !periodo.equals("noite")){
            System.out.println("Pedido inválido, período não aceito.");
            System.exit(0);//caso a escolha de período seja diferente de manhã ou noite encerra o programa e informa que o periodo em questão não eixste
        }else{ 
            //FAZ A CONTAGEM DE QUANTO DE CADA ITEM EXISTE NO PEDIDO
                  for(int i=1; i < pedido.length ; i++){
                    switch(pedido[i]){
                        case "1":
                            entrada++;
                        break;
                        
                        case "2":
                            acompanhamento++;
                        break;
                        
                        case "3":
                            bebida++;
                        break;
                        
                        case "4":
                            sobremesa++;
                        break;
                        
                        default:
                            erro++;
                        break;
                    }
                   }
        }
                  //CASO O PERÍODO ESCOLHIDO SEJA MANHÃ
                    if(periodo.equals("manhã")){
                        
                        if(entrada>0)pedidoFinal.append("ovos");//
                        
                        if(acompanhamento>0)pedidoFinal.append(", torradas");
                        
                        if(bebida==1){ 
                        pedidoFinal.append(", café");
                        }else if(bebida>1){
                            pedidoFinal.append(", cafe(x"+bebida+")");
                            }
                        
                        if(sobremesa>0 || erro>0)pedidoFinal.append(", erro");
                        
                    //CASO O PERÍODO ESCOLHIDO SEJA NOITE
                    }else if(periodo.equals("noite")){
                        
                        if(entrada>0)pedidoFinal.append("carne");
                        
                        if(acompanhamento==1){
                            pedidoFinal.append(", batata");
                        }else if(acompanhamento>1){
                            pedidoFinal.append(", batata(x"+acompanhamento+")");
                            }

                        if(bebida>0)pedidoFinal.append(", vinho");
                        
                        if(sobremesa>0)pedidoFinal.append(", bolo");
                        
                        if(erro>0)pedidoFinal.append(", erro");
                        
                    }
        System.out.println(pedidoFinal.toString());//IMPRIME O PEDIDO FINAL
    }

}



