package Ent;

public class entra {

    public String nome;
    public double preco;
    public int quant;

    public double totalValueInStock(){

        return preco*quant;
    }

    public void AddProducts(int quant){

        this.quant += quant;
//o This simboliza que ele está chamando o atributo quant da classe e não o do parametro do metodo
    }

    public void RemoveProducts(int quantity){
        this.quant -= quant;
    }

    public String toString(){
        //irá imprimir o objeto em String como incremetação, só precisando chamar o objeto no código principal
        return nome
                + ", $"
                + preco
                + ", "
                + quant
                + " unidades, Total: $"
                + String.format("%.2f", totalValueInStock());
    }
}
