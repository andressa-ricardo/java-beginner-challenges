import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {
    // usuario posta uma nova tarefa
    // pode ver todas as outras tarefas
    // excluir alguma tarefa
    // editar alguma tarefa
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.print("Digite a tarefa: ");
                    String task = scanner.nextLine();
                    System.out.println();
                    tasks.add(task);
                    System.out.println("Tarefa adicionada.");
                    System.out.println();

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        System.out.println();
                        System.out.println("Lista de tarefas: ");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        break;
                    }
                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        System.out.println();
                        System.out.print("Digite o número da tarefa a ser removida: ");
                        int index = scanner.nextInt();
                        if (index >= 1 && index <= tasks.size()) {
                            tasks.remove(index - 1);
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Número de tarefa inválido.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (choice != 4);

        scanner.close();

    }

}
