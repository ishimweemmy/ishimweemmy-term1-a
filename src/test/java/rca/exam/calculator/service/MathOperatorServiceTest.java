package rca.exam.calculator.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import rca.exam.v1.exceptions.InvalidOperationException;
import rca.exam.v1.serviceImpls.MathOperatorImpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathOperatorServiceTest {

    @InjectMocks
    private MathOperatorImpl mathOperatorService;

    @Mock
    private MathOperatorImpl mathOperatorMock;

    @Test
    public void shouldPerformMathOperationSuccessfully() throws InvalidOperationException {
        // Given
        double operand1 = 89;
        double operand2 = 10;
        String operation = "/";

        // When
        double mathOperation = mathOperatorService.doMath(operand1, operand2, operation);

        // Then
        verify(mathOperatorMock, times(1)).doMath(operand1, operand2, operation);

        // Assert
        assertThat(mathOperation).isEqualTo(0.0); // Adjust this based on the actual behavior of your method
    }
}
