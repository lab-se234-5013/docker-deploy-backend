package camt.se234.lab10.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Grade {
    String grade;  // No authorization check to verify if user has permission to set the grade
}
