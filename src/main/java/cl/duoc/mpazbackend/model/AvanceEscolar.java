package cl.duoc.mpazbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "avances_escolares")
public class AvanceEscolar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String estudiante;
    private String asignatura;
    private String codigoOa;
    private boolean acertado;
    private String pokemonRecompensa;
    private String observacionDocente;
    private boolean validadoPorDocente;

    public AvanceEscolar() {}

    public AvanceEscolar(Long id, String estudiante, String asignatura, String codigoOa, boolean acertado, String pokemonRecompensa, String observacionDocente, boolean validadoPorDocente) {
        this.id = id;
        this.estudiante = estudiante;
        this.asignatura = asignatura;
        this.codigoOa = codigoOa;
        this.acertado = acertado;
        this.pokemonRecompensa = pokemonRecompensa;
        this.observacionDocente = observacionDocente;
        this.validadoPorDocente = validadoPorDocente;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEstudiante() { return estudiante; }
    public void setEstudiante(String estudiante) { this.estudiante = estudiante; }

    public String getAsignatura() { return asignatura; }
    public void setAsignatura(String asignatura) { this.asignatura = asignatura; }

    public String getCodigoOa() { return codigoOa; }
    public void setCodigoOa(String codigoOa) { this.codigoOa = codigoOa; }

    public boolean isAcertado() { return acertado; }
    public void setAcertado(boolean acertado) { this.acertado = acertado; }

    public String getPokemonRecompensa() { return pokemonRecompensa; }
    public void setPokemonRecompensa(String pokemonRecompensa) { this.pokemonRecompensa = pokemonRecompensa; }

    public String getObservacionDocente() { return observacionDocente; }
    public void setObservacionDocente(String observacionDocente) { this.observacionDocente = observacionDocente; }

    public boolean isValidadoPorDocente() { return validadoPorDocente; }
    public void setValidadoPorDocente(boolean validadoPorDocente) { this.validadoPorDocente = validadoPorDocente; }
}