import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ClinicaVeterinaria clinica = new ClinicaVeterinaria();

        Veterinario vet1 = new Veterinario("Dr. Carlos", "987.654.321-00", "carlos@vets.com", "CRM12345");

        Tutor tutor1 = new Tutor("João Silva", "123.456.789-00", "joao@gmail.com");
        Animal animal1 = new Animal("Rex", "Cachorro", 5, tutor1);

        clinica.adicionarAnimal(animal1);
        clinica.adicionarVeterinario(vet1);

        try {
            Consulta consulta1 = new Consulta(animal1, vet1, LocalDateTime.now().plusDays(1));
            clinica.agendarConsulta(consulta1);
        } catch (ConsultaInvalidaException | AnimalNaoCadastradoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Animais cadastrados:");
        for (Animal animal : clinica.listarAnimais()) {
            System.out.println(animal);
        }

        System.out.println("Veterinários cadastrados:");
        for (Veterinario veterinario : clinica.listarVeterinarios()) {
            System.out.println(veterinario);
        }

        System.out.println("Consultas agendadas:");
        for (Consulta consulta : clinica.listarConsultas()) {
            System.out.println(consulta);
        }
    }
}
