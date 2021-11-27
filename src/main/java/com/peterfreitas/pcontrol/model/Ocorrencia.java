package com.peterfreitas.pcontrol.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class Ocorrencia {

    private Long id;
    private String nome;
    private String descricao;

}
