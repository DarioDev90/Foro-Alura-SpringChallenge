package org.dariodev.foro.api.domain.respuesta;

import jakarta.persistence.*;
import lombok.*;
import org.dariodev.foro.api.domain.topico.Topico;
import org.dariodev.foro.api.domain.usuario.Usuario;

import java.time.LocalDateTime;

@Table(name = "respuestas")
@Entity(name = "Respuesta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;

    @ManyToOne(fetch = FetchType.LAZY)
    private Topico topico;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    private Boolean solucion;

    @PrePersist
    public void prePersist(){
        this.fechaCreacion = LocalDateTime.now();
        this.solucion = false;
    }

}