package com.peterfreitas.pcontrol.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class NivelAcesso {

    private Long id;
    private String descricao;

}
