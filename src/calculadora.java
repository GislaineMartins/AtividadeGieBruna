import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

		cabecalho();
		menu();
		int opcao =  ler_opcao("\nDigite opcao");
		int verifica = verificaOpcao(opcao);
		opcaoEscolhida(verifica);
			
	}
	
	static void cabecalho(){
	    System.out.println("\n*****Calculadora*****\n");
	}
	
	static void menu(){
	    System.out.println("1- Somar");
	    System.out.println("2- subtratir");
	    System.out.println("3- multiplicar");
	    System.out.println("4- dividir");
	}
	
	static int ler_opcao(String mensagem){
	    Scanner sc = new Scanner(System.in);
	    System.out.println(mensagem);
	    int opcao = Integer.parseInt(sc.nextLine());
	    return opcao;
	}
	
	static int verificaOpcao(int opcao){
	    do{
	        if(opcao < 1 || opcao > 4){
	        System.out.println("Opcao deve estar entre 1 e 4");
	        opcao = ler_opcao("Digite opcao novamente: ");
	    }
	        
	    }while(opcao < 1 || opcao > 4);
	    
	    return opcao;
	}
	
	static void opcaoEscolhida(int opcao){
	    switch(opcao){
	        case 1:
	            int valor1 = ler_opcao("Digite valor 1: ");
	            int valor2 = ler_opcao("Digite valor 2: ");
	            double somar = somar(valor1, valor2);
	            System.out.println("soma: "+ somar);
	            break;
	            
	       case 2:
	            int valor3 = ler_opcao("Digite valor 1: ");
	            int valor4 = ler_opcao("Digite valor 2: ");
	            double subtrair = subtrair(valor3, valor4);
	            System.out.println("subtracao: "+ subtrair);
	           
	           break;
	           
	       case 3:
	           int valor5 = ler_opcao("Digite valor 1: ");
	            int valor6 = ler_opcao("Digite valor 2: ");
	            double multiplicar = multiplicar(valor5, valor6);
	            System.out.println("multiplicação: "+ multiplicar);
	           
	           break;
	           
	       case 4:
	            int valor7 = ler_opcao("Digite valor 1: ");
	            int valor8 = ler_opcao("Digite valor 2: ");
	            double dividir = dividir(valor7, valor8);
	            System.out.println("divisão: "+ dividir);
	           break;	        
	    }
	    
	}
	
	static double somar(double num1, double num2){
	    double resultado = num1 + num2;
	    return resultado;
	}
	
	
	static double subtrair(double num1, double num2){
	    double resultado = num1 - num2;
	    return resultado;
	}
	
	static double multiplicar(double num1, double num2){
	    double resultado = num1 * num2;
	    return resultado;
	}
	
   static double dividir(double num1, double num2){
	    double resultado = num1 / num2;
	    return resultado;
	}
}
