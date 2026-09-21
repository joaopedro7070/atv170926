import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> linguagens = new Stack<>();

        linguagens.push("css");
        linguagens.push("java");
        linguagens.push("html");
        linguagens.push("c++");
        linguagens.push("phython");

        for (String linguagem : linguagens) {
            System.out.println("Dado[ " + linguagem + " ]");
        }
    }
}