import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> alunos = new LinkedList<>();

        alunos.add("Joao");
        alunos.add("Maria");
        alunos.add("Pedro");
        alunos.add("Ana");
        alunos.add("Carlos");

        for (String aluno : alunos) {
            System.out.println("Dado[ " + aluno + " ]");
        }
    }
}