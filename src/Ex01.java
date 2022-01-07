import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        /*Faça um programa que permita ao usuário digitar 30 atividades que ele realizou no dia. Ao final, o programa deve possibilitar que o usuário escolha se quer exibir as atividades na ordem em que digitou ou em ordem reversa. * */
        //Criar variáveis
        String atividades[] = new String[5];
        Scanner leitor = new Scanner(System.in);
        int opcao;
        //Pedir para digitar as 30 atividades
        for(int i=0;i<atividades.length;i++) {
            System.out.println("Por favor, digite a " + (i+1) + "ª atividade do dia de hoje");
            atividades[i] = leitor.nextLine();
        }
        //Perguntar a forma de exibição
        System.out.println("Você deseja exibir as atividades na ordem em que foram digitadas ou em ordem inversa?: 1-EM ORDEM ou 2-ORDEM INVERSA");
        opcao = leitor.nextInt();
        //Verificar a forma de exibição escolhida
        if (opcao==1) {
            //Exibir as 30 atividades em ordem
            for(int i=0; i<atividades.length;i++) {
                System.out.println(atividades[i]);
            }
        }else if (opcao == 2) {
            //Exibir as 30 atividades de trás para frente
            for(int i=atividades.length-1;i>=0;i--) {
                System.out.println(atividades[i]);
            }
        }else {
            System.out.println("Opção inválida");
            leitor.close();
        }
    }
}