package com.example.escicd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sentiment {
    private int id;
    private String message;
    private int status;
}
