import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Buscacontatinho {

    public static Contatinho buscarPorNome(String nomeBuscado) {
        File arquivo = new File("contatinhos.txt");

        if (!arquivo.exists()) {
            return null;
        }

        try {
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split("#");

                if (dados[0].equalsIgnoreCase(nomeBuscado)) {
                    leitor.close();
                    return new Contatinho(dados[0], dados[1], dados[2], dados[3]);
                }
            }

            leitor.close();
        } catch (FileNotFoundException e) {
            return null;
        }

        return null;
    }
}
