package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GoodsDTO {

    private Long id;

    private String name;

    private String category;

    private String size;

    private String color;

    private Long count;

    private Long price;

    private String description;
}
