package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "goods")
@Getter
@Setter
@NoArgsConstructor
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private String size;

    @Column
    private String color;

    @Column
    private Long count;

    @Column
    private Long price;

    @Column
    private String description;
}
