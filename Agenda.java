import java.io.*;
import java.util.*;

public class Agenda {

    private List<Contatinho> lista = new ArrayList<>();

    public void addContatinho(Contatinho c) {
        lista.add(c);
    }

    public void ordenarLista() {
        Collections.sort(lista) ;
    }

    public void salvarLista(String nomeArquivo) {
        try (FileWriter fw = new FileWriter(nomeArquivo)) {

            for (Contatinho c : lista) {
                fw.write(c.toString() + "\n");
            }

        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }


    public Contatinho lerContatinhoPorNome(String nomeProcurado, String nomeArquivo) {

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {

            String linha;

            while ((linha = br.readLine()) != null) {

                String[] partes = linha.split("#");

                String nome = partes[0];
                String email = partes[1];
                String telefone = partes[2];
                String categoria = partes[3];

                if (nome.equalsIgnoreCase(nomeProcurado)) {
                    return new Contatinho(nome, email, telefone, categoria);
                }
            }

        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        return null;
    }

}
