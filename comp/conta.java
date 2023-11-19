package comp;


import java.util.Locale;

public class conta {

        private String nome;
        private int num;
        private double valor;

        public conta(int num, String nome) {
            this.num = num;
            this.nome = nome;
        }

        public conta(int num, String nome, double deposInicial) {
            this.num = num;
            this.nome = nome;
            deposit(deposInicial);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getNum() {
            return num;
        }

        public double getValor() {
            return valor;
        }

    public void deposit(double money){
        valor += money;

    }

    public void saque(double money){
        valor -= money + 5.0;

    }

    public String toString(){
            return "Conta "
                    + num
                    + ", nome: "
                    + nome
                    +" no valor de : "
                    + String.format("%.2f", valor);
    }

    }



