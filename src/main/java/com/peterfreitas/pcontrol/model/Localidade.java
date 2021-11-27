package com.peterfreitas.pcontrol.model;

import lombok.*;

import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class Localidade {

    private Long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;

}
