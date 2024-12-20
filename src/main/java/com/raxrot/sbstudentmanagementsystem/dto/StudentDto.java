package com.raxrot.sbstudentmanagementsystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private long id;
    @NotEmpty(message = "Student firstName should not be empty")
    private String firstName;
    @NotEmpty(message = "Student lastName should not be empty")
    private String lastName;
    @NotEmpty(message = "Student email should not be empty")
    @Email
    private String email;
}
