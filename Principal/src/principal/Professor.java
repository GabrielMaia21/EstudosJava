package principal;

//classe professor com os atributos//
public class Professor extends Usuario {
    private String contrato;
    private String turno;
    private String aula;
    private String franquia;
    private String data;
    
    
    //metodo professor sem parametro(vazio)//
    public Professor(){
        
    }

    //metodo professor com parametro//
     Professor(String nome, String cpf,String contrato, String bairro, int id,String turno, String aula, String franquia, String data, String telefone) {
        super( nome, cpf, telefone, id, bairro);
        this.turno = turno;
        this.aula = aula;
        this.franquia = franquia;
        this.data = data;
        this.contrato = contrato;
    }

     //getters e setters//
    public String getNome() {
        return nome;
    }

    public void setNome2(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getFranquia() {
        return franquia;
    }

    public void setFranquia(String franquia) {
        this.franquia = franquia;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
    
    
    
    //metodo listar para exibir alguns atributos para o usuario quando ele solicitar a listagem dos professores//
    void listar(){
        System.out.println(" \tId:" + this.id + "\tNome: " + this.nome + " \tAula: " + this.aula + "\tTurno "  + this.turno);

          
}
}
