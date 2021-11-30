package com.peterfreitas.pcontrol.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
public class Ocorrencia {

    @Id
    private Long id;
    private String nome;
    private String descricao;

}
