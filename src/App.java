public class App {
    public static void main(String[] args) throws Exception {
        GerenTarefa gerenciador = new GerenTarefa();

        Tarefa tarefa1 = new Tarefa("Estudar Java", "alta");
        Tarefa tarefa2 = new Tarefa("Ir ao mercado", "baixa");
        Tarefa tarefa3 = new Tarefa("Enviar relatório", "média");

        gerenciador.addTarefa(tarefa1);
        gerenciador.addTarefa(tarefa2);
        gerenciador.addTarefa(tarefa3);

        gerenciador.listarTarefa();

        gerenciador.marcarClonclu(1);

        gerenciador.listarTarefa();

        gerenciador.listarPrioridade("alta");

        gerenciador.delTarefa(1);

        gerenciador.listarTarefa();
    }
}
