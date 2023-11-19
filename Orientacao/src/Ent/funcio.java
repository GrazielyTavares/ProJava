package Ent;

public class funcio {
    public String nome;
    public double salario, taxa, porcen;




    public double NetSalary(){

        return salario - taxa;

    }

    double cont = salario * (porcen / 10);

    public double IncreaseSalary(){

        return salario + cont;
    }



    public String toString(){

        return nome
                + ", $"
                + String.format("%.2f", IncreaseSalary());
    }

}
