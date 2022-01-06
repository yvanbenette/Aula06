import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		double alunos [] = new double [5];
	double total=0;
	double qtde =0;
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0; i<alunos.length; i++) {
			System.out.println("Por favor, digite o consumo do " + (i+1) + "º aluno");
			alunos[i] = leitor.nextDouble();
			total = total + alunos[i];
		}
		
		
		
		System.out.println("O total de consumo foi de R$" + total);
		
		leitor.close();
		

	}

}
