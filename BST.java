import java.util.Scanner;

  class BST {
    
    static class No { 
        protected int conteudo;
        protected No esq;
        protected No dir;

    public No(int conteudo) {
        this.conteudo = conteudo;
        esq = null;
        dir = null;
        
    }
    }

    static class ArvBin {
        protected No raiz;
        protected int c;

        public ArvBin() {
            raiz = null;
            c = 0;
        }

        public void insereRaiz(int x) {
            No newNo = new No(x);
            raiz = newNo;
        }

        public void insere(int x, No n) {
           
            c++;

		if (x < n.conteudo) {
			if (n.esq == null) {
				n.esq = new No(x);
			} else {
				insere(x, n.esq);
			}
		} else if (x > n.conteudo) {
			if (n.dir == null) {
				n.dir = new No(x);
			} else {
				insere(x, n.dir);
			}
		}
        } 
    }
  

  public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    ArvBin a = new ArvBin();

    int tamanho = sc.nextInt();

    for (int i = 0; i < tamanho; i++) {
        int x = sc.nextInt();

        if (i == 0) {
            a.insereRaiz(x);
            System.out.println(a.c);
        } else {
            a.insere(x, a.raiz);
            System.out.println(a.c);
        }
    }
}
}