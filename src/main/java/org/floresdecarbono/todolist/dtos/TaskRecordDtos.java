package org.floresdecarbono.todolist.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record TaskRecordDtos(@NotBlank String name, @NotBlank String description) {
}
