package cl.duoc.mpazbackend.repository;

import cl.duoc.mpazbackend.model.AvanceEscolar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvanceRepository extends JpaRepository<AvanceEscolar, Long> {
}