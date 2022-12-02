package principal;

//importação de biblioteca//
import java.util.ArrayList;

//classe para armazenar os dados dos alunos  e adiciona-los ao array//
public class DadosProfessores {
    
    //criando arraylist//
    ArrayList<Professor> listaDeProfessores;
    
    //construindo variavel identificar para o metodo identificarProfessor//
    Professor identificar = new Professor();
    
    //metodo getter e setter do arraylist//
    public ArrayList<Professor> getListaDeProfessores() {
        return listaDeProfessores;
    }

    public void setListaDeProfessores(ArrayList<Professor> listaDeProfessores) {
        this.listaDeProfessores = listaDeProfessores;
    }


//metodo criado para listar os elementos do arraylist//
public DadosProfessores(){
    this.listaDeProfessores = new ArrayList<>();
}

//metodo para adicionar o novo professor cadastrado com os dados informados pelo usuario//
void insereProfessor(Professor novoProfessor){
    listaDeProfessores.add(novoProfessor);
}

//metodo para listar os alunos cadastrados//
void listaDeProfessores(){
    System.out.println("\nLista de Professores");
    for(Professor novoProfessor:listaDeProfessores){
        novoProfessor.listar();
        
    }
}

//metodo para excluir os professores do array atraves do id, criando variavel "remove" do tipo professor//
void excluirProfessor(int idProfessor){
    boolean excluiu = false;
    Professor remove = new Professor();
    for(Professor novoProfessor:listaDeProfessores){
        if (novoProfessor.getId() == idProfessor){
         remove = novoProfessor;
            excluiu = true;
        }
    }
    if(excluiu){
        listaDeProfessores.remove(remove);
        System.out.println("Professor Excluído com Sucesso!");
    }
}

//metodo identificar professor para reconhecer o id do professor//
void identificarProfessor(int idProfessor){
    
        for(Professor novoProfessor:listaDeProfessores){
        if (novoProfessor.getId() == idProfessor){
         identificar = novoProfessor;
        }
    }
    
}

//metodo para alterar o nome do professor//
void alterarNomeProfessor(String nome2){
    identificar.setNome2(nome2);
    System.out.println("Nome Alterado com Sucesso!");
}

//metodo para alterar a aula do professor//
void alterarAulaProfessor(String aula){
    identificar.setAula(aula);
    System.out.println("Aula Alterada com Sucesso!");
}

//metodo para alterar o turno do professor//
void alterarTurnoProfessor(String turno){
        identificar.setTurno(turno);
    System.out.println("Turno Alterado com Sucesso!");
}
}
