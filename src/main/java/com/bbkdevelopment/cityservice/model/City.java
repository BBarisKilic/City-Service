package com.bbkdevelopment.cityservice.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    private String id;

    private String name;

    private Date creationDate = new Date();
}
