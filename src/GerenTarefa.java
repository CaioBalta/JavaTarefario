public class GerenTarefa {
    private Tarefa[] tarefas;
    private int cont;

    public GerenTarefa()
    {
        tarefas = new Tarefa[50];
        cont =0;
    }

    public void addTarefa(Tarefa tarefa)
    {
        if(cont <tarefas.length)
        {
            tarefas[cont] = tarefa;
            cont++;
            System.out.println("Tarefa adicionada: " + tarefa.pegDescri());
        }else
        {
            System.out.println("Tarefa não atribuida...");
        }
    }
    

    public void delTarefa(int posi)
    {
        if (posi >= 0 && posi < cont)
        {
            System.out.println("Removendo a tarefa: " + tarefas[posi].pegDescri());
            tarefas[posi] = tarefas[cont - 1 ];
            tarefas[cont - 1] = null;
            cont--; 
        }else
        {
            System.out.println("Posição não existente...");
        }
    }

    public void marcarClonclu(int posi)
    {
        if(posi >= 0 && posi< cont)
        {
            tarefas[posi].atualiStatus("Concluida");
            System.out.println("Tarefa marcada como concluida foi: " + tarefas[posi].pegDescri());
        }else
        {
            System.out.println("Posição não existente");
        }
    }

    public void listarTarefa()
    {
        System.out.println("Tarefas pendêntes: ");
        for(int i =0; i < cont; i++)
        {
            if(tarefas[i].pegStatus().equals("Pendentes"))
            {
                System.out.println(tarefas[i]);
            }
        }

        System.out.println("tarfas concluidas");
        for(int j = 0; j <cont; j++)
        {
            if(tarefas[j].pegStatus().equals("Concluida"))
            {
                System.out.println(tarefas[j]);
            }
        }
    }

    public void listarPrioridade(String Prioridade)
    {
        System.out.println("Tarefas com prioridade: " + Prioridade + " : ");
        for(int i = 0; i< cont; i++)
        {
            if(tarefas[i].pegPrioridade().equalsIgnoreCase(Prioridade))
            {
                System.out.println(tarefas[i]);
            }
        }
    }
} 
