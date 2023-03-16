import java.util.Scanner;
import java.math.*;
public class PBL2 {
    public static void main(String args[]){
        double y1; double y2; double area_trapezio;

        Scanner teclado = new Scanner(System.in);

        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        if(a<=b){
            int n = teclado.nextInt();
            if(n>0) {
                double area_total = 0;
                double x = a;
                double h = (b - a) / n;

                y1 = 2 * Math.sin(x) + (Math.cos(x) / 3);

                int i = 0;

                while (i < n) {
                    x = x + h;
                    y2 = 2 * Math.sin(x) + (Math.cos(x) / 3);

                    area_trapezio = ((y1 + y2) / 2) * h;
                    area_total = area_total + area_trapezio;

                    y1 = y2;
                    i = i + 1;
                }
                System.out.println(area_total);
            }
            else{
                    System.out.println("Erro: o valor de n deve ser maior que zero");
            }
        }
        else{
            System.out.println("Erro: valor de [a] deve ser menor ou igual ao valor de [b]");
        }
    }
}
