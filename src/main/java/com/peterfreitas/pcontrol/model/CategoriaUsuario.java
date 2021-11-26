package com.peterfreitas.pcontrol.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class CategoriaUsuario {

    private long id;
    private String descricao;

}
