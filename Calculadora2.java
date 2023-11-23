import java.util.Scanner;

public class Calculadora2 {
    // usuario escolhe se quer dividir, multiplicar, somar
    // ou subtrair

    private int x;
    private int y;

    public Calculadora2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int somar() {
        return x + y;
    }

    public int subtrair() {
        return x - y;
    }

    public int multiplicar() {
        return x * y;
    }

    public int dividir() {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("Nao e possivel dividir por zero");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora: ");
        System.out.println("Escolha uma operação:");
        System.out.println("1: Somar: ");
        System.out.println("2: Subtrair: ");
        System.out.println("3: Multiplicar: ");
        System.out.println("4: Dividir: ");

        int escolha = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int valor2 = scanner.nextInt();

        Calculadora2 calculadora = new Calculadora2(valor1, valor2);

        int resultado;
        switch (escolha) {
            case 1:
                resultado = calculadora.somar();
                break;

            case 2:
                resultado = calculadora.subtrair();
                break;

            case 3:
                resultado = calculadora.multiplicar();
                break;

            case 4:
                resultado = calculadora.dividir();
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }
        System.out.println("Resultado: " + resultado);
        scanner.close();

    }

}
