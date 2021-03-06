package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel
{
    private String npm;

    @Size(min = 1)
    private String name;

    private double gpa;
    public String getNpm()
    {
        return npm;
    }

    public String getName()
    {
        return name;
    }

    public double getGpa()
    {
        return gpa;
    }
}
