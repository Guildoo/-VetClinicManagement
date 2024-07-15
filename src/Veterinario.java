public class Veterinario extends Pessoa {

    private String crm;

    public Veterinario(String nome, String cpf, String email, String crm) {
        super(nome, cpf, email);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Veterinario: " +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", crm='" + crm + '\'' +
                '}';
    }
}
