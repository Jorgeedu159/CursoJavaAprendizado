import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		
		
		for(int i = 0; i < vetorA.length; i++){
		System.out.println ("Entre com a posição: " + i);
		vetorA[i] scan.nextInt();
		
		}
		
		for(int i = 0; i < vetorA.length; i++){
		System.out.println ("Entre com a posição: " + i);
		vetorB[i] = vetorA[i];
		
		}
		
		System.out.println("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
		System.out.print(vetorA[i] + "    ");
		
		}
		System.out.println();
		
		System.out.println("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++) {
		System.out.print(vetorB[i] + "    ");
		
		}
		System.out.println();
		
		
		
			
	}

}
