import java.util.Scanner;

public class NICEBTRE {
    
    class No { 
        private char conteudo;
        private No esq;
        private No dir;

        public char getConteudo() {
            return conteudo;
        }

        public void setConteudo(char c) {
            conteudo = c;
        }

        public No getEsqu() {
            return esq;
        }

        public void setEsq(No n) {
            esq = n;
        }

        public No getDir() {
            return dir;
        }

        public void setDir(No n) {
            dir = n;
        }

    }
     
    public String traversal;
    public int aux = 0;
    
    private No Adiciona (No parent, char data) {
            No auxNo = new No();

            if(data == 'l') {
                    auxNo.setEsq(null);
                    auxNo.setDir(null);
            }else if(data == 'n') {
                    auxNo.setEsq(Adiciona(auxNo, traversal.charAt(++aux)));
                    auxNo.setDir(Adiciona(auxNo, traversal.charAt(++aux)));

            }
        return auxNo;    
    }
  
    public No raiz;
    
  public NICEBTRE(String t) {
        
     
      traversal = t;
        
        No No = new No();
        raiz = No;
        raiz.setConteudo(traversal.charAt(aux));
        if (raiz.getConteudo() == 'l') {
            raiz.setEsq(null);
            raiz.setDir(null);
        } else {
            raiz.setEsq(Adiciona(raiz, traversal.charAt(++aux)));
            raiz.setDir(Adiciona(raiz, traversal.charAt(++aux)));
        }
    }
    
  public int Tamanho() {
	
      return Tamanho(raiz) - 1;
}
		
		private int Tamanho(No no) {
			if (no == null) {
				return 0;
			}

			int tamanhoDir = Tamanho(no.getEsqu());
			int tamanhoEsq = Tamanho(no.getDir());

			if (tamanhoEsq > tamanhoDir) {
				return ++tamanhoEsq;
			}else{
				return ++tamanhoDir;
			}
		}
	
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int juju = sc.nextInt();
        sc.nextLine();

        String traversal;
        int i;
        for (i = 0; i < juju; i++) {
            traversal = sc.nextLine();

            NICEBTRE arvore = new NICEBTRE(traversal);
            System.out.println(arvore.Tamanho());
            
        }
    }


}



       
