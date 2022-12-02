package principal;

//Importação de bilioteca//
import java.util.Scanner;
public class Principal{

    public static void main(String[] args){
        
        //Declaração de variaveis temporarias//
        
        String nome3,cpf2,objetivo2,turno2,aula2;
        int opcao;
        int idAluno = 1;
        int idProfessor = 1;
        

        
        String nome = null,nome2,cpf = null,objetivo = null,turno,aula,franquia,telefone = null,data,bairro,nivel,contrato;      
        
        double altura,peso = 0;        
        
        int idade = 0 ;       
        
        //Instanciando objetos, adicionando objetos ao arraylist//
        
        
        DadosProfessores novoDadosProfessores = new DadosProfessores();       
        
        DadosAlunos novoDadadosAlunos = new DadosAlunos();      
        
        Scanner entrada = new Scanner(System.in);      
        
        Aluno novoAluno = new Aluno( "Lucas Neto", "12345678091" , "Hipertrofia", 1.75, 90, 20, "71985690011",idAluno++,"Brotas","Iniciante"); 
        Aluno novoAluno2 = new Aluno( "Roberto Carlos", "98765432176" , "Perder Peso", 1.75, 90, 20, "71985690011",idAluno++,"Campo Grande","Profissional");
        Aluno novoAluno3 = new Aluno( "Elis Regina", "76538902431" , "Resistência", 1.75, 90, 20, "71985690011",idAluno++,"Lapa","Intermediário");
        Aluno novoAluno4 = new Aluno( "Edson Arantes", "67923409134" , "Resistência", 1.75, 90, 20, "71985690011",idAluno++,"Barra","Iniciante");
        Aluno novoAluno5 = new Aluno( "Neymar Junior", "38671980143" , "Hipertrofia", 1.75, 90, 20, "71985690011",idAluno++,"Mata Escura","Profissional");
        novoDadadosAlunos.insereAluno(novoAluno);
        novoDadadosAlunos.insereAluno(novoAluno2);
        novoDadadosAlunos.insereAluno(novoAluno3);
        novoDadadosAlunos.insereAluno(novoAluno4);
        novoDadadosAlunos.insereAluno(novoAluno5);
        
        
        
        Professor novoProfessor = new Professor("Cristiano Ronaldo","Matutino","Musculação","Pituba","21/2/2022",idProfessor++,"Engomadeira","98457023741","Estagiário","719999999";       
        Professor novoProfessor2 = new Professor("Lionel Messi","Nortuno","Boxe","Lapa","03/10/2020",idProfessor++,"Engomadeira","98457023741","Estagiário","719999999");
        novoDadosProfessores.insereProfessor(novoProfessor);
        novoDadosProfessores.insereProfessor(novoProfessor2);
        
        //Menu principal utilizando laço de repetição Do while e switch//
        
        do{
            System.out.println("\n-----------------");
            System.out.println("     MENU");
            System.out.println("Escolha uma opção");
            System.out.println("1- Cadastrar");
            System.out.println("2- Listar");
            System.out.println("3- Exluir");
            System.out.println("4- Alterar");
            System.out.println("0- Sair");
            
            opcao = entrada.nextInt();

            switch(opcao){
                
                case 1:
                    
                    //menu secundario perguntando quais objetos o usuario quer cadastrar
                    System.out.println("1-Cadastrar Aluno");
                    System.out.println("2-Cadastrar Professor");
                    opcao = entrada.nextInt();
                    entrada.nextLine();
                    
                    
                    
                    
                    switch(opcao){
                        case 1:
                            
                            //pedindo dados dos objetos ao usuario, com limitação  de caracteres para cada dado//
                            
                            //numero minimo de caracteres : 6  numero maximo de caracteres 30//
                            do{
                            System.out.println("\nInforme o nome do Aluno completo");
                            
                            nome = entrada.nextLine();
                            }while(nome.length() < 6 || nome.length() > 30);
                                                        
                            //numero minimo de caracteres : 11  numero maximo de caracteres 14 para considerar pontos(".") e o traço ("-")//
                            do{
                            System.out.println("\nInforme o cpf do Aluno");
                            cpf = entrada.nextLine();
                            }while(cpf.length() > 11 && cpf.length() < 15);
                            
                            //numero minimo de caracteres : 4  numero maximo de caracteres 20//
                            do{
                            System.out.println("\nInforme o objetivo do Aluno");
                            objetivo = entrada.nextLine();
                            }while(objetivo.length() < 4 || objetivo.length() > 20);
                         
                            System.out.println("\nInforme o peso do Aluno");
                            peso = entrada.nextDouble();
                            
                            System.out.println("\nInforme a Altura do Aluno");
                            altura = entrada.nextDouble();
                            
                            
                            System.out.println("\nInforme a idade do Aluno");
                            idade = entrada.nextInt();
                            
                            //numero minimo de caracteres: 10  numero maximo de caracteres: 11  (considerando DDD)  //
                            do{
                            System.out.println("\nInforme o Telefone do Aluno");
                            telefone = entrada.nextLine();
                            entrada.nextLine();
                            }while(telefone.length() < 10 || telefone.length() > 11 );
                            
                            System.out.println("\nInforme o bairro do Aluno");
                            bairro = entrada.nextLine();
                            
                            System.out.println("\nInforme o nivel do Aluno");
                            nivel = entrada.nextLine();
                            
                            System.out.println("Aluno Cadastrado!");
                             
                            //Instanciando aluno cadastrado utilizando os atributos da classe como parametro e  adicionando esse aluno ao arraylist//
                            novoAluno = new Aluno(nome,cpf,objetivo,peso,altura,idade,telefone,idAluno++,bairro,nivel);                        
                            
                            novoDadadosAlunos.insereAluno(novoAluno);
                            
                            break;
                        case 2:
                            
                            //numero minimo de caracteres : 6  numero maximo de caracteres: 30//
                            do{
                            System.out.println("\nInforme o nome do Professor completo");
                            nome = entrada.nextLine();
                            }while(nome.length() < 6 || nome2.length() > 30);
                            
                            //numero minimo de caracteres:7  numero maximo de caracteres: 10. A ideia era limitar apenas a digitação para as palavras: Matutino/Vespertino/Noturno.// 
                            do{
                            System.out.println("\nInforme o turno do Professor");
                            turno = entrada.nextLine();
                            }while(turno.length() < 7 || turno.length() > 10);
                            
                            //numero minimo de caracteres: 4  numero maximo de caracteres: 10.//
                            do{
                            System.out.println("\nInforme a aula desse professor");
                            aula = entrada.nextLine();
                            }while(aula.length() < 4 || aula.length() > 10);
                            
                            //numero minimo de caracteres: 8  numero maximo de caracteres: 10.//
                            do{
                            System.out.println("\nInforme a data de admissão do Professor");
                            data = entrada.nextLine();
                            }while(data.length() < 8 || data.length() >10 );
                            
                            //numero minimo de caracteres: 4  numero maximo de caracteres: 20//
                            do{
                            System.out.println("\nInforme a Franquia do professor");
                            franquia = entrada.nextLine();
                            }while(franquia.length() < 4 || franquia.length() > 20);
                            
                            System.out.println("\nInforme o bairro do professor");
                            bairro = entrada.nextLine();
                            
                            System.out.println("\nInforme o cpf do professor");
                            cpf = entrada.nextLine();
                            
                            System.out.println("\nInforme o tipo de contrato do professor");
                            contrato = entrada.nextLine();
                            
                            System.out.println("\nInforme o telefone do professor");
                            telefone = entrada.nextLine();
                            
                            System.out.println("Professor Cadastrado!");
                            
                            //Instanciando professor cadastrado utilizando os atributos da classe como parametro e  adicionando esse professor ao arraylist//
                             novoProfessor3 = new Professor(nome,turno,aula,data,franquia,idProfessor++,bairro,cpf,contrato,telefone);
                                    
                            novoDadosProfessores.insereProfessor(novoProfessor);
                            
                            break;
                    }
                    break;
                case 2:                       
                            
                            //menu secundario perguntando ao usuario quais objetos ele quer listar//
                            System.out.println("1-Listar Alunos");
                            System.out.println("2-Listar Professores");
                           
                            opcao = entrada.nextInt();                                                     
                            switch(opcao){
                                case 1 -> novoDadadosAlunos.listaDeAlunos();
                                case 2 -> novoDadosProfessores.listaDeProfessores();
                                    
                            }
                    
                    break;             
                
                case 3:
                    
                    //menu secundario para perguntar qual o tipo do objeto que o usuario quer excluir//
                    System.out.println("1-Excluir Alunos");
                    System.out.println("2-Excluir Professores");
                    
                    opcao = entrada.nextInt();
                    switch(opcao){
                        case 1:
                            
                            //listando os objetos para o usuario poder excluir atraves do id//
                            novoDadadosAlunos.listaDeAlunos();
                            System.out.println("Qual Aluno deseja Excluir?");
                            opcao = entrada.nextInt();
                            novoDadadosAlunos.excluirAlunos(opcao);
           
                            break;
                        case 2:
                            novoDadosProfessores.listaDeProfessores();
                            System.out.println("Qual Professor deseja Excluir?");
                            opcao = entrada.nextInt();
                            novoDadosProfessores.excluirProfessor(opcao);
                            break;
                    }
                    break;
                case 4:
                    
                    //menu secundario para perguntar qual o tipo do objeto que o usuario quer alterar//
                    System.out.println("1-Alterar Alunos");
                    System.out.println("2-Alterar Professores");
                    opcao = entrada.nextInt();
                    entrada.nextLine();
                    switch(opcao){
                        case 1:
                           
                            //listando os objetos para o usuario poder alterar atraves do id//
                            novoDadadosAlunos.listaDeAlunos();
                            System.out.println("Qual Aluno deseja Alterar?");
                            opcao = entrada.nextInt();
                            
                            //menu para o usuario informar qual atributo visivel ele quer alterar//
                            novoDadadosAlunos.identificarAluno(opcao);
                            System.out.println("1-Alterar Nome");
                            System.out.println("2-Alterar Cpf");
                            System.out.println("3-Alterar Objetivo");
                            opcao = entrada.nextInt();
                            
                            switch(opcao){
                                case 1:
                                   
                                    //pedindo para o usuario informar o novo dado do atributo e alterando o dado em seguida//
                                    System.out.println("Qual o novo nome?");
                                    entrada.nextLine();
                                    nome3 = entrada.nextLine();
                                    
                                    novoDadadosAlunos.alterarNomeAluno(nome3);
                                    break;
                                case 2:
                                    
                                    //pedindo para o usuario informar o novo dado do atributo e alterando o dado em seguida//
                                    System.out.println("Qual o novo cpf?");
                                    entrada.nextLine();
                                    cpf2 = entrada.nextLine();
                                    
                                    novoDadadosAlunos.alterarCpfAluno(cpf2);
                                    break;
                                case 3:
                                    
                                    //pedindo para o usuario informar o novo dado do atributo e alterando o dado em seguida//
                                    System.out.println("Qual o novo Objetivo?");
                                    entrada.nextLine();
                                    objetivo2 = entrada.nextLine();
                                    
                                    novoDadadosAlunos.alterarObjetivoAluno(objetivo2);
                                    break;
                            }

           
                            break;
                        case 2:
                            
                            //listando os objetos para o usuario poder alterar atraves do id//
                            novoDadosProfessores.listaDeProfessores();
                            System.out.println("Qual Professor deseja Alterar?");
                            opcao = entrada.nextInt();
                            
                            //menu para o usuario informar qual atributo visivel ele quer alterar//
                            novoDadosProfessores.identificarProfessor(opcao);
                            System.out.println("1-Alterar Nome");
                            System.out.println("2-Alterar Aula");
                            System.out.println("3-Alterar Turno");
                            opcao = entrada.nextInt();
                             switch(opcao){
                                case 1:
                                    
                                     //pedindo para o usuario informar o novo dado do atributo e alterando o dado em seguida//
                                    System.out.println("Qual o novo nome?");
                                    entrada.nextLine();
                                    nome3 = entrada.nextLine();
                                    
                                    novoDadosProfessores.alterarNomeProfessor(nome3);
                                    break;
                                case 2:
                                    
                                     //pedindo para o usuario informar o novo dado do atributo e alterando o dado em seguida//
                                    System.out.println("Qual a nova Aula?");
                                    entrada.nextLine();
                                    aula2 = entrada.nextLine();
                                    
                                    novoDadosProfessores.alterarAulaProfessor(aula2);
                                    break;
                                case 3:
                                    
                                     //pedindo para o usuario informar o novo dado do atributo e alterando o dado em seguida//
                                    System.out.println("Qual o novo Turno?");
                                    entrada.nextLine();
                                    turno2 = entrada.nextLine();
                                    
                                    novoDadosProfessores.alterarTurnoProfessor(turno2);
                                    break;
                            }
                            
                            break;
                    }
                    break;
                    
                case 0:
                  
                    //opção para sair do menu  principal
                    System.out.println("Obrigado por usar nosso Sistema!");
                          
                    break;
                            
                default:
                    
                    //mensagem para ser exibida sempre q o usuario digitar uma opção que nao está no menu//
                    System.out.println("\nOpção Inválida");
             
            
        }
        
 }while(opcao != 0);  //laço de repetição para sempre que o usuário digitar uma opção que não está no menu//
        
        
    }

}

   
