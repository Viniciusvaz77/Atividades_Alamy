import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        // nome do arquivo conforme o enunciado
        String nomeArquivo = "tabuada_" + num + ".txt";

        try {
            FileWriter fw = new FileWriter(nomeArquivo);

            for (int i = 1; i <= 10; i++) {
                fw.write(num + " x " + i + " = " + (num * i) + "\n");
            }

            fw.close(); // salva de verdade
            System.out.println("Arquivo criado com sucesso: " + nomeArquivo);

        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo.");
        }

        sc.close();
    }
}
