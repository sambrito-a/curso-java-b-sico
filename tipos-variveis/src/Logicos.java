public class Logicos {

    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("Ambas as condições são verdadeiras.");
        } else if (condicao1 || condicao2) {
            System.out.println("Pelo menos uma condição é verdadeira.");
        } else {
            System.out.println("Nenhuma condição é verdadeira.");
        }
    }
}
