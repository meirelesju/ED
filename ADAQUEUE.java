import java.util.Scanner;

 class ADAQUEUE {
   
    private static final int primeiroElemento = 1000000;
    //Esse 1000000 é pq a primeira linha deve ter entre 1 e 10^6
    private static int maisBaixo = -1;
    private static int maisAlto = -1;
    private static boolean reverso;

    
    public static void Inicio(int []i) {

        if((reverso && maisAlto > maisBaixo) || (!reverso && maisBaixo > maisAlto) || maisBaixo == -1) {
            System.out.println("No job for Ada?");
            return;
        }

        System.out.println(i[maisBaixo]);
        if(reverso) {
            maisBaixo--;
        } else {
            maisBaixo++;
        }


    }

    public static void Fim(int [] j) {

        if((reverso && maisAlto > maisBaixo) || (!reverso && maisBaixo > maisAlto) || maisBaixo == -1) {
            System.out.println("No job for Ada?");
            return;
        }

        System.out.println(j[maisAlto]);
        if(reverso) {
            maisAlto++;
        } else {
            maisAlto--;
        }


    }

    public static void AdicionaInicio(int [] aux, int valor) {


        if(maisAlto == -1) {
            maisAlto = primeiroElemento;
            maisBaixo = primeiroElemento;
        } else {
            if(reverso) {
                maisBaixo++;
            } else {
                maisBaixo--;
            }
        }


         aux[maisBaixo] = valor;

    }

    public static void AdicionaFim(int []aux, int valor) {

        if(maisBaixo == -1) {
            maisAlto = primeiroElemento;
            maisBaixo = primeiroElemento;
        } else {
            if(reverso) {
                maisAlto--;
            } else {
                maisAlto++;
            }
        }

            aux[maisAlto] = valor;

    }

public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();

        int [] Array = new int[2000000];
        reverso = false;

        while (j --> -1) {

            String digita = scanner.nextLine();
            String [] entradas = digita.split(" ");
            // Vê se tem espaço separando as entradas
            
            if(entradas.length == 1) {
                if("front".equals(entradas[0])) {
                    Inicio(Array);
                }
                else if("back".equals(entradas[0])) {
                    Fim(Array);
                } 
                else {

                    int temp = maisBaixo;
                    maisBaixo = maisAlto;
                    maisAlto = temp;
                    reverso = !reverso;
                }


            } else {

                int juju = Integer.valueOf(entradas[1]);
               
                if("toFront".equals(entradas[0])) {
                    AdicionaInicio(Array, juju);
                } else if("push_back".equals(entradas[0])) {
                    AdicionaFim(Array, juju);
                }

            }

        }

    }

}



