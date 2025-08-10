package com.inventoy_management.system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SequenceGenerator(
        name = "global_seq",
        sequenceName = "global_id_seq",
        allocationSize = 1
)
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String row;

    @Column(nullable = false)
    private int level;

    @Column(nullable = false)
    private String section;

    @OneToMany(mappedBy = "location")
    private List<Item> items = new ArrayList<>();

}
