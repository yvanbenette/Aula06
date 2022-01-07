import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        /*Fa�a um programa que permita ao usu�rio digitar 30 atividades que ele realizou no dia. Ao final, o programa deve possibilitar que o usu�rio escolha se quer exibir as atividades na ordem em que digitou ou em ordem reversa. * */
        //Criar vari�veis
        String atividades[] = new String[5];
        Scanner leitor = new Scanner(System.in);
        int opcao;
        //Pedir para digitar as 30 atividades
        for(int i=0;i<atividades.length;i++) {
            System.out.println("Por favor, digite a " + (i+1) + "� atividade do dia de hoje");
            atividades[i] = leitor.nextLine();
        }
        //Perguntar a forma de exibi��o
        System.out.println("Voc� deseja exibir as atividades na ordem em que foram digitadas ou em ordem inversa?: 1-EM ORDEM ou 2-ORDEM INVERSA");
        opcao = leitor.nextInt();
        //Verificar a forma de exibi��o escolhida
        if (opcao==1) {
            //Exibir as 30 atividades em ordem
            for(int i=0; i<atividades.length;i++) {
                System.out.println(atividades[i]);
            }
        }else if (opcao == 2) {
            //Exibir as 30 atividades de tr�s para frente
            for(int i=atividades.length-1;i>=0;i--) {
                System.out.println(atividades[i]);
            }
        }else {
            System.out.println("Op��o inv�lida");
            leitor.close();
        }
    }
}