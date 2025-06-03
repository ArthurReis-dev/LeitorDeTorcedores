public class Torcedor {
    public String nome;
    public int idade;

    public Torcedor(String nome, int idade){
        this.nome = nome;
        this.idade= idade;
    }

    public String toString() {
        return nome + ";" + idade;
    }
}
