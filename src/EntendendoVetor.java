import java.util.Scanner;

public class EntendendoVetor {

	public static void main(String[] args) {
		int vetor [] = new int [6];
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0; i<6; i++) {
			System.out.println("Digite o ano de lan�amento de um filme");
			vetor[i] = leitor.nextInt();
		}
		for(int i=0; i<6; i++) {
			System.out.println("O filme foi lan�ado em: " + vetor[i]);
			leitor.close();
	}
		}

}
