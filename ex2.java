package listFunction;
import java.util.*;
public class ex2 {
	public static void main(String[] args) {		
		chamada();
	}
	public static double op1(double g) {
		g=g-(g*0.1);
		return g;
	}
	public static double op2(double g) {
		g=g/2;
		return g;
	}
	public static double op3(double g,int m) {
		if(g>=100) {
			for(int i=1;i<=m;i++) {
				g = g+(g*0.03);
			}
		}else {
			System.out.println("O valor pra essa opção tem que ser maior que R$100,00");
		}
		return g;
	}
	public static void chamada(){
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite 1 para opção a vista | 2 para opção 2x | 3 para opção 3 ate 10x");		
		int opcao = ler.nextInt();
		System.out.println("Digite o gasto do cliente");
		double gasto = ler.nextDouble();
		if(opcao == 1) {
			System.out.println("O valor a vista eh : R$"+op1(gasto));

		}
		if(opcao == 2) {
			System.out.println("O em duas vezes de R$"+op2(gasto));
		}
		if(opcao == 3) {
			System.out.println("Digite a quantidade de meses");
			int mes = ler.nextInt();
			if(mes < 10) {
				System.out.printf("Preco total junto ao juros : R$%.2f%n",op3(gasto,mes));
				System.out.printf("Preco de cada parcela: R$%.2f%n",op3(gasto,mes)/mes);
			}else {
				System.out.println("Parcela de 3 ate 10x");
			}
		}
	}
	
}
