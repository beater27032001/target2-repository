package Ex03;

public class Ex03 {
    public static void main(String[] args) {
        int INDICIE = 12;
        int SOMA = 0;
        int K = 1;

        // Estrutura de repetição para realizar a soma
        while (K < INDICIE){
            K += 1;
            SOMA += K;
            System.out.println(SOMA);
        }
    }
}
