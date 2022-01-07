import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        /*2. O professor Wuni Jim Yensonal precisa de um programa para ajudar com um problema simples: para uma turma com 50 alunos precisa calcular a média da sala e descobrir quais são os alunos que precisarão de um atendimento personalizado. O fluxo do programa deve ser o seguinte: 
A. Digitar as 50 notas em um vetor e, para cada nota digitada, digitar o nome do aluno correspondente em outro vetor
B. Calcular a média das notas digitadas
C. Para cada uma das notas que foi digitada e ficou abaixo da média, exibir uma mensagem que diga “Chamar o aluno para conversar”*/
        //Criar as variáveis 
        double notas[] = new double[5];
        String nomes[] = new String[notas.length];
        Scanner leitor = new Scanner(System.in);
        double media=0;
        //Digitar as 50 notas em um vetor e os 50 nomes em outro
        for(int i=0;i<notas.length;i++) {
            System.out.println("Por favor, informe a nota do " + (i+1) + "º aluno");
            notas[i] = leitor.nextDouble();
            System.out.println("Por favor, informe o nome deste aluno");
            nomes[i] = leitor.next();
            media = media + notas[i];
        }
        //Calcular a média
        media = media / (double)notas.length;
        System.out.println("A média das notas desta turma foi " + media);
        //Para cada nota que estiver abaixo da média, exibir uma mensagem.
        for(int i=0;i<notas.length;i++) {
            if(notas[i]<media) {
                System.out.println("O aluno " + nomes[i] + " tirou " + notas[i] + ", uma nota abaixo da média. Você deve chamá-lo para conversar");
            }
        }
    }
}