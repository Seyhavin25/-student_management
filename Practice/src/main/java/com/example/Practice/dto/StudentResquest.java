package com.example.Practice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResquest {
    @NotBlank(message = "Name is required")
    private String  name;

    @NotBlank(message = "email is requried")
    @Email(message = "email must be valid")
    private String email;


    @NotBlank(message = "phone number is requied")
    private String phone_number;
}
