package com.ecommerce.library.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class AdminDto {
    @Size(min = 3, max = 10, message = "Invalid first name! (3-10 characters)")
    private  String firstName;

    @Size(min = 3, max = 10, message = "Invalid last name! (3-10 characters)")
    private String lastName;

    private String username;

    @Size(min = 8, max = 20, message = "Invalid password! (8-20 characters")
    private String password;

    private String confirmPassword;

}
