package principal;

//importação de biblioteca//
import java.util.ArrayList;

//classe para recerber os dados dos alunos  e adiciona-los ao array//
public class DadosAlunos {
    
    //criando arraylist//
    ArrayList<Aluno> listaDeAlunos;
    
    //construindo variavel identificar para o metodo identificarAluno//
    Aluno identificar = new Aluno();
    
    //metodo getter e setter do arraylist//
    public ArrayList<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(ArrayList<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }
    
    

//metodo para listar os elementos do arraylist//
public DadosAlunos(){
    this.listaDeAlunos = new ArrayList<>();
    
}

//metodo para adicionar o novo aluno cadastrado com os dados informados pelo usuario//
void insereAluno(Aluno novoAluno){
    listaDeAlunos.add(novoAluno);
}

//metodo para listar os alunos cadastrados//
void listaDeAlunos(){
    System.out.println("\nLista de Alunos");
    for(Aluno novoAluno:listaDeAlunos){
        novoAluno.listar();
        
    }
}

//metodo para excluir os alunos do array atraves do id, criando variavel "remove" do tipo aluno//
void excluirAlunos(int idAluno){
    boolean excluiu = false;
    Aluno remove = new Aluno();
    for(Aluno novoAluno:listaDeAlunos){
        if (novoAluno.getId() == idAluno){
         remove = novoAluno;
            excluiu = true;
        }
    }
    if(excluiu){
        listaDeAlunos.remove(remove);
        System.out.println("Aluno Excluído com Sucesso!");
    }
}

//metodo identificar aluno para reconhecer o id do aluno//
void identificarAluno(int idAluno){
    
        for(Aluno novoAluno:listaDeAlunos){
        if (novoAluno.getId() == idAluno){
         identificar = novoAluno;
        }
    }
    
}

//metodo para alterar o nome do aluno//
void alterarNomeAluno(String nome){
    identificar.setNome(nome);
    System.out.println("Nome Alterado com Sucesso!");
}

//metodo para alterar o cpf do aluno//
void alterarCpfAluno(String cpf){
    identificar.setCpf(cpf);
    System.out.println("Cpf Alterado com Sucesso!");
}

//metodo para alterar o objetivo do aluno//
void alterarObjetivoAluno(String objetivo){
        identificar.setObjetivo(objetivo);
    System.out.println("Objetivo Alterado com Sucesso!");
}

}





