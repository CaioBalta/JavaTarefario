public class Tarefa {
    private String descricao;
    private String prioridade;
    private String status;

    public Tarefa(String descricao, String prioridade)
     {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = "pendente"; 
    }

    public String pegDescri() 
    {
        return descricao;
    }

    public String pegPrioridade()
     {
        return prioridade;
    }

    public String pegStatus() 
    {
        return status;
    }

    public void atualiStatus(String status) 
    {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa Descrição: " + descricao + ",\n Prioridade: " + prioridade + ",\n Status: " + status;
    }
}
