package OrientaçãoObjeto.Composição.DesafioComposicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	


		
		final String nome;
		
		
		
		
		Cliente(String nome){
			this.nome = nome;
		}
		
   final  List<Compra> compras = new ArrayList<>();
    
    double obterValorTotal() {
    	double total = 0;
    	
    	for(Compra compra: compras) {
    		total += compra.obterVrTotal();
    	}
    	return total;
    }
       
  
    	 
    	   
    	   
    	   
     
       
       
	 
	
	
	  
}
