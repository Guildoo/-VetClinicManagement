import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private Animal animal;
    private Veterinario veterinario;
    private LocalDateTime dataHora;

    public Consulta(Animal animal, Veterinario veterinario, LocalDateTime dataHora) {
        this.animal = animal;
        this.veterinario = veterinario;
        this.dataHora = dataHora;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataHoraFormatada = dataHora.format(formatter);
        return  "animal=" + animal +
                ", veterinario=" + veterinario +
                ", dataHora=" + dataHoraFormatada;
    }
}
