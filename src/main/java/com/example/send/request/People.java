package com.example.send.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {
    private String name;
    @JsonAlias("last-name")
    private String lastName;
    private Integer age;
    private Address address;
    private List<Phone> phone;
}
