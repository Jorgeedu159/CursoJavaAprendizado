package jorge.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite a sua idade:  ");
		
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			
			System.out.println("Você já pode ser preso!");
			
		}else {
			
			System.out.println("cheirando a leite!");
			
		}*/
		
		//barato <= 10
		//10 < valor < 15 -pede desconto
		// 15 <= 17 - pesquisar mais
		//>= 17 - muito caro
		
		System.out.println("Digite o preço do produto: ");
		double valor = scan.nextDouble();
		
		if(valor <= 10) {
			System.out.println("Muito Barato! xD");
		}else if(valor > 10 && valor <15) {
			System.out.println("Pede um desconto vai!");
			
		}else if(valor >= 15 && valor < 17) {
			System.out.println("Bora guardar esse dinheiro?!!!!");
		}else {
			System.out.println("Um absurdo! Muito Caro!");
		}
		
	}

}
