import java.util.Scanner;

class CBBAtividadePratica6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int MaiorNumero = Integer.MIN_VALUE;

        for(int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");

            int resposta = sc.nextInt();
            array[i] = resposta;

            if (resposta > MaiorNumero) {
                MaiorNumero = resposta;
            }
        }
        int j = 0;
        while(j < array.length) {
            System.out.println(array[j]);
            j++;
        }
        System.out.print("O maior numero foi: " + MaiorNumero);
        sc.close();
    }
}