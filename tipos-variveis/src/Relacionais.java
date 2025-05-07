public class Relacionais {
    public static void main(String[] args) {
        // Operadores relacionais
        String nomeUm = "Lucas";
        String nomeDois  = "Lucas";
        System.out.println(nomeUm == nomeDois); // true

        int numero1 = 1;
        int numero2 = 2;

        if (numero1 < numero2) { // true
            System.out.println("numero1 é menor que numero2"); // true
        } else {
            System.out.println("numero1 não é menor que numero2"); // false
        }

        boolean simNao = numero1 == numero2; // false
        System.out.println("numero1 é igual a numero2? " + simNao); // false

        simNao = numero1 != numero2; // true
        System.out.println("numero1 é diferente de numero2? " + simNao); // true

        simNao = numero1 > numero2; // false            
        System.out.println("numero1 é maior que numero2? " + simNao); // false
        

    }
    
}
