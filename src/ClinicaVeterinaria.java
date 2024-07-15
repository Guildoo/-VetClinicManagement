import java.util.ArrayList;
import java.util.List;

public class ClinicaVeterinaria {
    private List<Animal> animais;
    private List<Veterinario> veterinarios;
    private List<Consulta> consultas;

    public ClinicaVeterinaria() {
        this.animais = new ArrayList<>();
        this.veterinarios = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void adicionarVeterinario(Veterinario veterinario) {
        this.veterinarios.add(veterinario);
    }

    public void agendarConsulta(Consulta consulta) throws ConsultaInvalidaException, AnimalNaoCadastradoException {
        if (!animais.contains(consulta.getAnimal())) {
            throw new AnimalNaoCadastradoException("Animal não cadastrado na clínica.");
        }
        if (!veterinarios.contains(consulta.getVeterinario())) {
            throw new ConsultaInvalidaException("Veterinário não cadastrado na clínica.");
        }

        this.consultas.add(consulta);
    }

    public List<Animal> listarAnimais() {
        return animais;
    }

    public List<Veterinario> listarVeterinarios() {
        return veterinarios;
    }

    public List<Consulta> listarConsultas() {
        return consultas;
    }
}
