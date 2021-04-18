package me.carolinapereira.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Patient {

    private static final String SEQUENCE_NAME = "PATIENT_SEQ";

    @Id
    @GeneratedValue(generator = SEQUENCE_NAME, strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = SEQUENCE_NAME, sequenceName = SEQUENCE_NAME, allocationSize = 1)
    private Long id;
    private String name;
    private LocalDate birthdate;
    private String mobile;
    private String cpf;
    @Lob
    private String anamnese;
    @Lob
    private String complaint;
    @ManyToOne
    @JoinColumn(name = "partner_id")
    private Partner partner;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    private List<Attendance> attendances;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    private List<Treatment> treatments;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    private List<Image> images;
    private LocalDateTime createdDate = LocalDateTime.now();
}
