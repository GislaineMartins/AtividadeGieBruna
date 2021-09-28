import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        cabecalho();
        menu();
        ler("Escolha uma das opções: ");
    }

    static void cabecalho(){
        System.out.println("\n\t************Calculadora***********");
    }

    static void menu(){
        System.out.println("\t1- Somar");
        System.out.println("\t2- Subtrair");
        System.out.println("\t3- Multiplicar");
        System.out.println("\t4- Dividir");
    }

    static int ler(String mensagem){
        Scanner sc = new Scanner(System.in);
        int opcao;
        do{
            System.out.println(mensagem);
            opcao = Integer.parseInt(sc.nextLine());
            if(opcao < 0 || opcao > 4){
                System.out.println("\nDigite o número novamente: ");
            }
        }while(opcao < 0 || opcao > 4);
        return opcao;
    }

}
