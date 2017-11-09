import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TREEORD {

    static class No{

        int value;
        No left;
        No right;
        static int T [][]; 
        static int pre [];
        static int post [];
                
	
    public No(int value) {
                this.value = value;
                left = null;
                right = null;
        }
	}
	
	
	static Integer in [];
	static boolean [][] menor;
	static boolean visitado [];
	static int aux = 0;
        static int n;
        
    static int Busca (ArrayList<Integer> Array) {
		int raiz = No.pre[aux];
		visitado[raiz] = true;
		ArrayList<Integer> menor1 = new ArrayList<>();
		ArrayList<Integer> maior = new ArrayList<>();
                
		for (int i = 0; i < Array.size(); i++)
			if (!visitado[Array.get(i)]) {
				if (menor[Array.get(i)][raiz]) menor1.add(Array.get(i));
				else maior.add(Array.get(i));
			}

		if (menor1.size() > 0) {
			aux++;
			No.T[raiz][0] = Busca(menor1);
		}
		if (maior.size() > 0) {
			aux++;
			No.T[raiz][1] = Busca(maior);
		}
		return raiz;
	}
	
    static boolean Teste (int no) {
		boolean juju = true;

		if (No.T[no][0] != -1) {
			juju &= Teste(No.T[no][0]);
		}
		if (No.T[no][1] != -1) {
			juju &= Teste (No.T[no][1]);
		}
		return juju & (No.post[aux++] == no);
	}

    
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
                
                
		No.pre = new int[n];
		No.post = new int[n];
		in = new Integer[n];
		visitado = new boolean[n];
		menor = new boolean[n][n];
		
		No.T = new int[n][2];
		for (int i = 0; i < n; i++)
			No.T[i][0] = No.T[i][1] = -1;
		
		for (int i = 0; i < n; i++)
			No.pre[i] = scanner.nextInt() - 1;
		for (int i = 0; i < n; i++)
			No.post[i] = scanner.nextInt() - 1;
		for (int i = 0; i < n; i++)
			in[i] = scanner.nextInt() - 1;
		
		for (int i = 0; i < n; i++)
			for (int j = i + 1;  j < n; j++)
				menor[in[i]][in[j]] = true;
		
		Busca(new ArrayList<Integer>(Arrays.asList(in)));
		
                    aux = 0;
		System.out.println(Teste(No.pre[0]) ? "yes" : "no");
		
		
	}}