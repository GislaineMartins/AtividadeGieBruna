public class calculoMedia{

    public static void main(String[] args) {
        cabecalho();
        
        
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