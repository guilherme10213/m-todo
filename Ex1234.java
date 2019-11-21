import java.util.Scanner;

public class Ex1234 {
	public static void main(String agrs[]) {
		Scanner ler = new Scanner (System.in);
		int bla;
		while(true) {
		System.out.println("1 para ex1 | 2 para ex2 | 3 para ex3 | 4 para ex4 | 0 parar");
		bla=ler.nextInt();
			if(bla == 1) { 
				Fatorial();
			}
			if(bla == 2) {
				Tabuada();
			}
			if(bla == 3) {
				Aposentar();
			}
			if(bla == 4) {
				Potencia();
			}
			if(bla == 0) {
				System.out.println("Tchau");
				break;
			}
		}
	}

	public static int Fatorial() {
			Scanner ler = new Scanner (System.in);
			System.out.println("Digite um numero");
			int n=ler.nextInt();
			int r=0;
			r=n*(n-1);
			for(int i=n-2;i>0;i--) {
				r = r*(i);
			}
			System.out.println(r);
			return r;
	}
	public static int Tabuada() {
		Scanner ler= new Scanner (System.in);
		System.out.println("digite um número");
		int n=ler.nextInt();
		int r=0;
		for(int i=0;i<=10;i++) {
			r = n*i;
			System.out.println(n+" x "+i+" = "+ r);
		}
		return r;
	}

	public static void Aposentar() {
		Scanner ler = new Scanner (System.in);
		String sexo;
		int idade;
		System.out.println("Digite H para homem e M para Mulher");
		sexo=ler.next();
		System.out.println("Digite sua idade");
		idade=ler.nextInt();
		if(sexo.equals("M")) {
			System.out.println("Falta "+(55-idade)+" anos para se aposentar");
		}else {
			System.out.println("Falta "+(60-idade)+" anos para se aposentar");
		}
	}
	public static int Potencia() {
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite a base e o expoente");
		int base = ler.nextInt();
		int exp = ler.nextInt();
		int r=base*base;
		for(int i=exp-2;i>0;i--) {
			r=r*base;
		}
		System.out.println(r);
		return r;
	}
}

