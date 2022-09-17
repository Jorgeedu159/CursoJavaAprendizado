package jorge.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome Completo é:" + nomeCompleto);
		
		System.out.println("Digite o seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu nome Completo é:" + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);
		
		System.out.println("Digite seu nome, idade, quantidade de filhos, altura e seu animal de estimação: ");
		
		/*String primeiroNome = scan.next();
		int idade = scan.nextInt();
		int qtdFilhos = scan.nextInt();
		double altura = scan.nextDouble();
		boolean animal = scan.nextBoolean();
		
		System.out.println("você digitou os seguintes valores:");
		
		System.out.println("Primeiro nome:" + primeiroNome);
		System.out.println("Idade é " + idade);
		System.out.println("Quantidade de filhos" +	qtdFilhos);
		System.out.println("Sua altura é " + altura);
		System.out.println("Possui animal?" + animal);*/
		
		
			

	}

}
