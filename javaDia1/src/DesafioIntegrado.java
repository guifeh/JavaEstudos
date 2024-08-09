import java.util.Scanner;

public class DesafioIntegrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();

        int soma = num + num2;
        int subtracao = num - num2;
        int multiplicacao = num * num2;
        int divisao = num / num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);

        sc.close();
    }
}
