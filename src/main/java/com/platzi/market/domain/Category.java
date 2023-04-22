package com.platzi.market.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Category {
    private int categoryId;
    private String category;
    private boolean active;


}
