package me.carolinapereira.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Partner {

    @Id
    private static final String SEQUENCE_NAME = "PARTNER_SEQ";

    @Id
    @GeneratedValue(generator = SEQUENCE_NAME, strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = SEQUENCE_NAME, sequenceName = SEQUENCE_NAME, allocationSize = 1)
    private Long id;
    private String name;
    private String responsible;
    private String phone;
    private String mobile;
    private LocalDateTime createdDate = LocalDateTime.now();
}
