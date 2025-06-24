package br.edu.ifmg.escola.entities;


import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull // entra no construtor requeri
    //@ToString.Exclude
    //@Getter(value = AcessLevel.NONE)
    private String authority;
}