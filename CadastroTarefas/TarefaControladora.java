import java.io.*;
import java.util.ArrayList;

public class TarefaControladora {
    private static final String ARQUIVO = "tarefas.txt";

    public void salvarTarefa(Tarefa tarefa) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
            bw.write(tarefa.toString());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Tarefa> carregarTarefas() {
        ArrayList<Tarefa> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                lista.add(Tarefa.fromString(linha));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
