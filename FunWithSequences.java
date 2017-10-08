
import java.util.*;


	class Main {

	public static void main(String[] args){
		try{

			int a;
			int b;
			int c;
			int d;
		
			int A[];
			int B[];
		
			Scanner scan = new Scanner(System.in);
			Scanner scan2 = new Scanner (System.in);

			a = scan.nextInt();
			A = new int [a];
		
			for(int i = 0; i < a; i++){
				b = scan2.nextInt();
				A[i] = b;
			}
		
			c = scan.nextInt();
			B = new int [c];
		
			for(int i = 0; i < c; i++){
		
				d = scan2.nextInt();
				B[i] = d; 
			}
		
			boolean primeiro = true;
			for(int i = 0; i < a; i++){
				boolean igual = false;
		
				for (int j = 0; j < c; j++){
					if (A[i] == B[j]){
						igual = true;
						break;
					}
				}
				if (igual == false){
					if (primeiro){
						System.out.print(A[i]);
						primeiro = false;
					}
					else {
						System.out.print(" "+ A[i]);
					}
				}
			}
		}
		catch(Exception e){}
	}
}

# ED
