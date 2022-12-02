package principal;

//classe aluno com os atributos//
public class Aluno {
     private String nome;
     private String cpf;
     private String objetivo;
     private double altura;
     private String telefone;
     private double peso;
     private int idade;
     private int id;
     
     //metodo aluno sem parametro(vazio)//
     public Aluno(){
         
     }

     //metodo aluno com parametros //
     Aluno(String nome, String cpf, String objetivo, double peso, double altura, int idade, String telefone,int id) {
     this.nome = nome;
     this.cpf = cpf;
     this.objetivo = objetivo;
     this.peso = peso;
     this.altura = altura;
     this.idade = idade;
     this.telefone = telefone;
     this.id = id;
    }

     //getters e setters//
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     //metodo listar para exibir alguns atributos para o usuario quando ele solicitar a listagem dos alunos//
    void listar(){
        System.out.println(" \tId:" + this.id + "\tNome: " + this.nome + " \tCpf: " + this.cpf + "\tObjetivo: " + this.objetivo);
        
        
    }

     
}
