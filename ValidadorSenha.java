import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean senhaValida = false;

        while (!senhaValida) {
            System.out.print("Digite uma senha: ");
            String senha = scanner.nextLine();

            if (validarSenha(senha)) {
                System.out.println("A senha é válida.");
                senhaValida = true; 
            } else {
                System.out.println("Senha inválida. Deve conter pelo menos 8 caracteres, letras e números.");
            }
        }

        scanner.close();
    }

    public static boolean validarSenha(String senha) {
        if (senha.length() < 8) {
            return false;
        }

        boolean temLetra = false;
        boolean temNumero = false;

        for (char caractere : senha.toCharArray()) {
            if (Character.isLetter(caractere)) {
                temLetra = true;
            } else if (Character.isDigit(caractere)) {
                temNumero = true;
            }
        }

        return temLetra && temNumero;
    }
}
