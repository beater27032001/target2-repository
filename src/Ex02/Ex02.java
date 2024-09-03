package Ex02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string para verificar a quantidade de letras 'a':");
        String palavra = scanner.nextLine();

        String lowerCaseString = palavra.toLowerCase();

        // Contar a ocorrência da letra 'a'
        for (char c : lowerCaseString.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não ocorre na string.");
        }
    }
}
