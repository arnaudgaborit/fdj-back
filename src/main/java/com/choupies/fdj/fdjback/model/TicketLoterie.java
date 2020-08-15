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
@Table(name = "TicketLoterie")
public class TicketLoterie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="numeros", nullable=false, length=14)
    private String numeros;

    @Column(name="codeTicket", nullable=false, length=512)
    private String codeTicket;

    @Column(name="type", nullable=false)
    private TypeLoterie type;

    @ElementCollection(targetClass = Option.class)
    private List<Option> options;

}