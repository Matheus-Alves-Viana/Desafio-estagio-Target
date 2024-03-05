package desafios;

import java.util.Scanner;

public class Fibonacci {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int valor;
	        int a = 1;
	        int b = 0;
	        int aux;
	        
	        System.out.println("Insira um valor: ");
	        valor = sc.nextInt();
	        
	        while (a < valor) {
	            aux = a;
	            a = a + b;
	            b = aux;
	        }
	        
	        if (valor == a) {
	            System.out.println(valor + " pertence � sequ�ncia de Fibonacci!");
	        } else {
	            System.out.println(valor + " n�o pertence � sequ�ncia de Fibonacci!");
	        }
	        
	        sc.close();
	    }
	}
