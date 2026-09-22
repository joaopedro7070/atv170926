import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {

        Stack<String> pilha = new Stack<>();

        pilha.push("css");
        pilha.push("java");
        pilha.push("html");
        pilha.push("c++");
        pilha.push("python");

        while (!pilha.isEmpty()) {
            String linguagem = pilha.pop();

            System.out.println("Dado[ " + linguagem + " ]");
        }
    }
}