import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.print("Quantos contatinhos deseja adicionar? ");
        int qtd = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < qtd; i++) {

            System.out.println("\n--- Contatinho " + (i + 1) + " ---");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Telefone: ");
            String telefone = sc.nextLine();

            System.out.print("Categoria: ");
            String categoria = sc.nextLine();

           
            Contatinho c = new Contatinho(nome, email, telefone, categoria);

           
            agenda.addContatinho(c);
        }

      
        agenda.ordenarLista();

        agenda.salvarLista("contatinhos.txt");

        System.out.println("\nLista ordenada salva no arquivo contatinhos.txt");

        sc.close();
    }
}