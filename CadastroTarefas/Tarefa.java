public class Tarefa {
    private String titulo;
    private Prioridade prioridade;

    public Tarefa(String titulo, Prioridade prioridade) {
        this.titulo = titulo;
        this.prioridade = prioridade;
    }

    public String getTitulo() {
        return titulo;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return titulo + ";" + prioridade.name(); // para salvar no .txt
    }

    public static Tarefa fromString(String linha) {
        String[] partes = linha.split(";");
        return new Tarefa(partes[0], Prioridade.valueOf(partes[1]));
    }
}
