package com.epam.task.Spring_boot_task.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainerTrainingResponseDto {

    private String trainingName;

    private LocalDate trainingDate;

    private String trainingType;

    private int trainingDuration; // Assuming duration is in hours or minutes

    private String traineeName;
}