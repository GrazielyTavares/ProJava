package memorias.listas.comp;

public class Funcionario {

    private Integer id;
    private String nome;
    private Double salario;

    //construtor vazio
    public Funcionario(){
        
    }

    //construtor com argumentos
    public Funcionario(Integer id, String nome, Double salario){

        super();
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    

    // Get e Setters para transferir para outras classes

    public String getNome(){
        return nome;
    } 

    public void setNome(String nome){
        this.nome = nome;
    } 

    public Integer getId(){
        return id;
    } 

    public void setId(Integer id){
        this.id = id;
    } 

    public Double getSalario(){
        return salario;
    } 

    public void setSalario(Double salario){
        this.salario = salario;
    } 


    public void acrescento(double porcentagem){

        //para atualizar a variavel, iguala a variavel com a expressão +=  
        salario += salario * porcentagem / 100.0;
    }



} 