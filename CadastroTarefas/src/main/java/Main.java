import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TarefaControladora controladora = new TarefaControladora();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o título da tarefa: ");
        String titulo = scanner.nextLine();

        System.out.println("Escolha a prioridade: ");
        for (Prioridade p : Prioridade.values()) {
            System.out.println("- " + p);
        }
        System.out.print("Digite (BAIXA, MEDIA, ALTA): ");
        Prioridade prioridade = Prioridade.valueOf(scanner.nextLine().toUpperCase());

        Tarefa novaTarefa = new Tarefa(titulo, prioridade);
        controladora.salvarTarefa(novaTarefa);

        System.out.println("\n📋 Tarefas Salvas:");
        ArrayList<Tarefa> tarefas = controladora.carregarTarefas();
        for (Tarefa t : tarefas) {
            System.out.println("- " + t.getTitulo() + " (" + t.getPrioridade() + ")");
        }

        scanner.close();
    }
}
