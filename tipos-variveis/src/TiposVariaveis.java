public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
           // Tipos primitivos: byte, short, int, long, float, double, char, boolean
        double salarioMinimo = 1416.70;
        byte idade = 20;
        short Ano = 2023;
        int cep = 12345678;
        long cpf = 12345678901L; // 12345678901 é um número muito grande, o L indica que é um long
        float pi = 3.14F; // 3.14 é um número decimal, o F indica que é um float


        // Variaveis x Constantes
        int numero = 5;
        numero = 10; // Reatribuição de valor
        System.out.println(numero); // Saída: 10

        final double VALOR_DE_PI = 3.14; // Constante, não pode ser reatribuída
        System.out.println(VALOR_DE_PI); // Saída: 3.14
        
    }

}
