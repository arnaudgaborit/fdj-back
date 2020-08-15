package com.choupies.fdj.fdjback.model;

import com.choupies.fdj.fdjback.model.enums.TypeLoterie;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="code", nullable=false, length=50)
    private String code;

    @Column(name="libelle", nullable=false, length=50)
    private String libelle;

    @Column(name="cout", nullable=false)
    private Double cout;

    @Column(name="actif", nullable=false)
    private boolean actif;

    @ElementCollection(targetClass = TypeLoterie.class)
    private List<TypeLoterie> typeLoteries;
}
