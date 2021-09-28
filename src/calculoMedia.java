public class calculoMedia{

    public static void main(String[] args) {
        cabecalho();
        int resultSoma1 = somar(10, 10);
        int resultSoma2 = somar(20, 20);
        int resultSoma3 = somar(30, 30);
        int resultSoma4 = somar(40, 40);

        double resultMedia = media(resultSoma1, resultSoma2, resultSoma3, resultSoma4);

        
        System.out.printf("O valor da media calculada é:  %.2f",resultMedia);
        
        
    }

    static void cabecalho(){
        System.out.println("\n\t**************Calculo de media****************\n");
    }

    static int somar(int n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }

    static double media(int n1, int n2, int n3, int n4){
        double media = (n1 + n2 + n3 + n4) / 4;
        return media;
    }



}