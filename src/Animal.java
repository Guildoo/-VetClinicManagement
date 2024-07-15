public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private Tutor dono;

    public Animal(String nome, String especie, int idade, Tutor dono) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Tutor getDono() {
        return dono;
    }

    public void setDono(Tutor dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", especie=" + especie + '\'' +
                ", idade=" + idade +
                ", dono=" + dono.getNome() + " (" + dono.getCpf() + ")";

    }
}
