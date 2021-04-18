package me.carolinapereira.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Treatment {

    @Id
    private static final String SEQUENCE_NAME = "TREATMENT_SEQ";

    @Id
    @GeneratedValue(generator = SEQUENCE_NAME, strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = SEQUENCE_NAME, sequenceName = SEQUENCE_NAME, allocationSize = 1)
    private Long id;
    private String tooth;
    private String procedure;
    private Double cost;
    private LocalDateTime createdDate = LocalDateTime.now();
}
