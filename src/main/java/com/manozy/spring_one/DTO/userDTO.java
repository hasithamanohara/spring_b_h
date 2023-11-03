package com.manozy.spring_one.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class userDTO {
    private int id;
    private String Name;
    private String address;
}
