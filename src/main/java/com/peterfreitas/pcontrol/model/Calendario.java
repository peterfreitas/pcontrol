package com.peterfreitas.pcontrol.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class Calendario {

    private Long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;

}
