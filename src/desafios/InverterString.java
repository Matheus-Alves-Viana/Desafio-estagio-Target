package desafios;

import java.util.Scanner;

public class InverterString {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma string para inverter: ");
        String dig = sc.next();
        
        String invertedString = inverterString(dig);

        System.out.println("String invertida: " + invertedString);

        sc.close();
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}