public class Ternario {
    public static  void main(String[] args) {
        int a, b;

        a = 6;
        b = 6;
        String resultado = "";

        // Operador ternário como se fosse um if else
        /*
        if(a == b) {
            resultado = "Iguais";
        } else {
            resultado = "Diferentes";
        }
        System.out.println(resultado); // Diferentes */

        // O mesmo código acima, mas utilizando o operador ternário
        resultado = (a == b) ? "Iguais" : "Diferentes";
        System.out.println(resultado); // Diferentes


        


    }
}
