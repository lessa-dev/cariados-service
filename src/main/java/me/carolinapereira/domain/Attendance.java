package me.carolinapereira.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Attendance {

    @Id
    private static final String SEQUENCE_NAME = "ATTENDANCE_SEQ";

    @Id
    @GeneratedValue(generator = SEQUENCE_NAME, strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = SEQUENCE_NAME, sequenceName = SEQUENCE_NAME, allocationSize = 1)
    private Long id;
    private String procedure;
    private LocalDateTime dateTime;
    private Double payment;
    private Double debit;
    @ManyToOne
    private Patient patient;
    private LocalDateTime createdDate = LocalDateTime.now();
}
