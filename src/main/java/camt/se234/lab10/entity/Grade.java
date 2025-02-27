package camt.se234.lab10.entity;

import lombok.Builder;
import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
@Builder
public class Grade {
    private static final Logger logger = LoggerFactory.getLogger(Grade.class);
    String grade;  // Vulnerable to log-based information leakage

    public void logGrade() {
        // Logging sensitive information without encryption or masking
        logger.info("Grade: " + grade);
    }
}

