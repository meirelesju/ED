import java.io.IOException;
import java.util.Stack;
import java.util.Scanner;
import java.lang.String;


/**
 *
 * @author Julianny Meireles
 */


public class onp {
   
        public static void main(String[] args) throws IOException{
        try{

            Scanner scanner = new Scanner(System.in);
            String frase = new String();
            int i;
            i = scanner.nextInt();

                while(i > 0){
                frase = scanner.next();
                Stack<Character> pilha = new Stack<Character>();
                //Stack é uma classe pronta do pacote java.util que permite manusear pilhas mais facilmente
                String k = new String();
                int tamanho = frase.length();
                char c;		
                String output = "";
                for(int j = 0;j < tamanho; j++){
                c = frase.charAt(j);
                // Esse charAt retorna o caracter da posição j da string frase
                if (c =='('){ 
                    continue;
                }
                if (c == '+'){
                    pilha.add(c);
                    continue;
                }
                if (c== '-'){
                    pilha.add(c);
                    continue;
                }
		if (c== '*'){
                   pilha.add(c);
                    continue;
                }
		if (c == '/'){
                    pilha.add(c);
                    continue;
                }
                if(c == '^'){
                    pilha.add(c);
                    continue;
                }
                else if(c == ')'){
                  output += pilha.pop();
		continue;
		} 
                else{
		output += String.valueOf(c);
		continue;
		}
                }
        
        System.out.println(output.trim());
	i--;    
	 }
                    
                
                    
    }catch(Exception e){}
        
        
        }}
