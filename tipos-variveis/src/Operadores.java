public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + " JAVA";
        System.out.println(nomeCompleto); // Saída: LINGUAGEM JAVA

        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1+"1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);  
        System.out.println(concatenacao); 

        
    }
    
}
