package cl.duoc.mpazbackend.controller;

import cl.duoc.mpazbackend.model.AvanceEscolar;
import cl.duoc.mpazbackend.repository.AvanceRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/avances")
@CrossOrigin(origins = "*")
public class AvanceController {

    private final AvanceRepository repository;

    public AvanceController(AvanceRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<AvanceEscolar> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public AvanceEscolar crearAvance(@RequestBody AvanceEscolar avance) {
        avance.setId(null);
        return repository.save(avance);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AvanceEscolar> actualizarAvance(@PathVariable Long id, @RequestBody AvanceEscolar datos) {
        return repository.findById(id)
                .map(existente -> {
                    existente.setAsignatura(datos.getAsignatura());
                    existente.setCodigoOa(datos.getCodigoOa());
                    existente.setAcertado(datos.isAcertado());
                    existente.setPokemonRecompensa(datos.getPokemonRecompensa());
                    existente.setObservacionDocente(datos.getObservacionDocente());
                    existente.setValidadoPorDocente(datos.isValidadoPorDocente());
                    return ResponseEntity.ok(repository.save(existente));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAvance(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}