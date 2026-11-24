package cl.duoc.mpazbackend;

import cl.duoc.mpazbackend.model.AvanceEscolar;
import cl.duoc.mpazbackend.repository.AvanceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MpazBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpazBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner precargarDatos(AvanceRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.save(new AvanceEscolar(
                        null,
                        "Eduardo Barrera",
                        "Matemática",
                        "OA 8",
                        true,
                        "#051 Dugtrio",
                        "Validado por UTP - Unidad 1",
                        true
                ));
                repository.save(new AvanceEscolar(
                        null,
                        "Eduardo Barrera",
                        "Lenguaje y Comunicación",
                        "OA 4",
                        true,
                        "#025 Pikachu",
                        "Comprensión lectora lograda",
                        true
                ));
            }
        };
    }
}