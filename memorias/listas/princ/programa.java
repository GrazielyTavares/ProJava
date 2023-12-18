package memorias.listas.princ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import memorias.listas.comp.Funcionario;

public class programa {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner ab = new Scanner(System.in);

        // List = Interface
        //Não pode ser instânciada, portanto instancia uma classe concreta e iguala a interface
        List<Funcionario> lista = new ArrayList<>();

        System.out.print("Quantas pessoas irá registrar?");
        int p = ab.nextInt();

        for(int i=0; i<p; i++){
            System.out.println("Funcionario #" + (i+1) + " : ");
            System.out.print("Id: ");
            Integer id = ab.nextInt();
            System.out.print("Name: ");
            ab.nextLine();
            String nome = ab.nextLine();
            System.out.print("Salario: ");
            Double salario = ab.nextDouble();

            //instânciou o objeto para adicionar informações a lista
            Funcionario emp = new Funcionario(id, nome, salario);

            //adicionando a lista
            lista.add(emp);
        }


        //expressão lambada = procurar um elemento com 1 linha somente
        // 
        System.out.println();
        System.out.print("Adicione o Id do funcionário que terá o salário incrementado : ");
        int id = ab.nextInt();

        //busca usando a lista.stream
        // filter = filtra alista somente da expressão 
        // findFirst = pega o primeiro return da filtragem
        //orElse = caso não filtrar será retornado nulo
        Funcionario emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("O id não existe!");
        } 
        else{
            System.out.print("Insira a porcentagem  : ");
            
            //acrescenta a porcentagem
            double porcentagem = ab.nextDouble();
            emp.acrescento(porcentagem);
        }

        System.out.println();
        System.out.println("Liste o Funcionarios");
        for (Funcionario em : lista){
            System.out.println(emp);

             ab.close();
        }

       
    }
}
