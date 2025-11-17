import java.util.Scanner;

public class lerContatinhoPorNome { public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do contatinho que deseja buscar: ");
        String nomeBusca = sc.nextLine();

        Contatinho encontrado = agenda.lerContatinhoPorNome(nomeBusca, "contatinhos.txt");

        if (encontrado != null) {
            System.out.println("\nContatinho encontrado:");
            System.out.println(encontrado);
        } else {
            System.out.println("\nContatinho não encontrado.");
        }

        sc.close();
    }
}