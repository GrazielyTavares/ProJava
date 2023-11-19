package Ent;

public class trigo {

    public double larg, alt;

    public double Area(){
        return larg*alt;
    }

    public double Perimetro(){
        return  (larg*2)+(alt*2);
    }

    public double Diagonal(){
        return Math.sqrt((larg*larg)+(alt*alt));
    }
}
