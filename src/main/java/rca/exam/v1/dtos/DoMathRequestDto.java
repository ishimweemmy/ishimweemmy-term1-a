package rca.exam.v1.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DoMathRequestDto {
    private double operand1;
    private double operand2;
    private String operation;
}
