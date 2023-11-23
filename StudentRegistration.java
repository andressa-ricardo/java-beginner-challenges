import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String nome;
    int idade;
    double media;

    public Student(String nome, int idade, double media) {
        this.nome = nome;
        this.idade = idade;
        this.media = media;
    }
}

public class StudentRegistration {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Cadastro de Alunos");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Exibir Alunos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade do aluno: ");
                    int idade = scanner.nextInt();
                    System.out.print("Digite a média de notas do aluno: ");
                    double media = scanner.nextDouble();

                    Student student = new Student(nome, idade, media);
                    students.add(student);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        System.out.println();
                        System.out.println("Lista de Alunos:");
                        for (Student s : students) {
                            System.out.println("Nome: " + s.nome);
                            System.out.println("Idade: " + s.idade);
                            System.out.println("Média de Notas: " + s.media);
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }
    }
}
