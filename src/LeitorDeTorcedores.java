import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeitorDeTorcedores{
    public static void main(String[] args){
        ArrayList<Torcedor> torcedores = new ArrayList<>();

        
        torcedores.add(new Torcedor("Pedro", 18));
        torcedores.add(new Torcedor("Ismael", 24));
        torcedores.add(new Torcedor("Cleber", 38));

        try{
            FileWriter escritor = new FileWriter("Torcedores.txt");
            
            String linhas;

            for(Torcedor c : torcedores){
                escritor.write(c.toString() + "\n");
            }

            escritor.close();

             ArrayList<Torcedor> torcedoreslidos = new ArrayList<>();


            BufferedReader leitor = new BufferedReader(new FileReader("Torcedores.txt"));

            while ((linhas = leitor.readLine()) != null) {
                String[] partes = linhas.split(";");
                String nome = partes[0];
                int idade = Integer.parseInt(partes[1]);

                Torcedor c = new Torcedor(nome, idade);
                torcedoreslidos.add(c);
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