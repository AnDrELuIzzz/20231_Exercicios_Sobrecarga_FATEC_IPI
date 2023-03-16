import java.lang.Math;
public class Impressora{
    public void exibir(double a){
        System.out.println(a);
    }

    public void exibir(double a, Double b){
        System.out.println( a + ", " + b);
    }

    public void exibir(double a, String b){
        System.out.println( a + ", " + b);
    }

    public void exibir(String b, double a){
        System.out.println( a + ", " + b);
    }

    public void exibir(String a, String b, String c){
        System.out.println( a + ", " + b + ", " + c);
    }

    public void exibir(int a, int b, String c){
        System.out.printf(a + ", " + b + ", " + c);
    }

    public double raiz(int a){
        return Math.sqrt(a);
    }
    public double raiz(double a){
        return Math.sqrt(a);
    }
    public double raiz(String a){
        return Math.sqrt(Double.parseDouble(a));
    }

    public double potencia()
}