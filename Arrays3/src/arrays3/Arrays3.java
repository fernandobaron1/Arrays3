
package arrays3;

import java.util.Random;


public class Arrays3 {

   
    public static void main(String[] args) {
        
        String [] nomes = new String[10];
        
        nomes[0] = "João" ;
        nomes[1] = "Bruno" ;
        nomes[2] = "Maria" ;
        nomes[3] = "Joana" ;
        nomes[4] = "Marcos" ;
        nomes[5] = "Fernando" ;
        nomes[6] = "Bruna" ;
        nomes[7] = "Jacson" ;
        nomes[8] = "Marcelo"  ;
        nomes[9] = "Angelica" ;
        
        Random r = new Random();
        
        int idx = r.nextInt(nomes.length);
       // int idx = r.nextInt (10);
        System.out.println (nomes [idx]);
    }
    
}
