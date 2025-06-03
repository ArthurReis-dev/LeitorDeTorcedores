import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeitorDeTorcedores{
    public static void main(String[] args){
        ArrayList<Torcedor> torcedores = new ArrayList<>();

        try{
            BufferedReader leitor = new BufferedReader(new FileReader("Torcedores.txt"));
            String linhas;

            while ((linhas = leitor.readLine()) != null) {
                String[] partes = linhas.split(",");
                String nome = partes[0];
                int idade = Integer.parseInt(partes[1]);

                Torcedor c = new Torcedor(nome, idade);
                torcedores.add(c);
            }

            leitor.close();

            System.out.println("Torcedors lidos: ");
            for(Torcedor c : torcedores){
                System.out.println(c.nome + " - " + c.idade + " anos");
            }
        } catch (IOException e){
            System.out.println("Erro ao tentar ler arquivo de torcedores: ");
            e.printStackTrace();
        }

    }
}