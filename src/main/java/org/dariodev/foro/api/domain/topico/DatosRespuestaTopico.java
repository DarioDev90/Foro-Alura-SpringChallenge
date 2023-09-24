package org.dariodev.foro.api.domain.topico;

import org.dariodev.foro.api.domain.curso.IdRegistroCurso;
import org.dariodev.foro.api.domain.usuario.IdRegistroUsuario;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, StatusTopic status, LocalDateTime fechaCreacion, IdRegistroUsuario usuario, IdRegistroCurso curso) {
}
