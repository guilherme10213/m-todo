package listFunction;
import java.util.Scanner;
public class ex1 {
	public static void main(String agrs[]) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor investido");
		double i=ler.nextDouble();
		System.out.println("digite o quantidade de meses");
		int m=ler.nextInt();
		System.out.printf("%.2f%n",Juros(i,m));
	}
	public static double Juros(double i,int m) {
		for(int j=0;j<m;j++) {
			i = i+(i*0.01);
		}
		return i;
	}
}
