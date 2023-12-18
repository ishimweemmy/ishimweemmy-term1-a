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
    public void OnAdditionOperation_Should_AddProperly() throws InvalidOperationException {
        double operator1 = 30;
        double operator2 = 10;
        String operation = "+";
        double expectedResult = 40.0;

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);
        double actualMathResult = mathOperatorService.doMath(operator1, operator2, operation);
        assertThat(actualMathResult).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }

        @Test
    public void OnSubtractionOperation_Should_SubtractProperly() throws InvalidOperationException {
        double operator1 = 30;
        double operator2 = 10;
        String operation = "-";
        double expectedResult = 20.0;

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);
        double actualMathResult = mathOperatorService.doMath(operator1, operator2, operation);
        assertThat(actualMathResult).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }

        @Test
    public void OnMultiplicationOperation_Should_MultiplyProperly() throws InvalidOperationException {
        double operator1 = 30;
        double operator2 = 10;
        String operation = "*";
        double expectedResult = 300.0;

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);
        double actualMathResult = mathOperatorService.doMath(operator1, operator2, operation);
        assertThat(actualMathResult).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }

        @Test
    public void OnDivisionOperation_Should_DivideProperly() throws InvalidOperationException {
        double operator1 = 30;
        double operator2 = 10;
        String operation = "/";
        double expectedResult = 3.0;

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);
        double actualMathResult = mathOperatorService.doMath(operator1, operator2, operation);
        assertThat(actualMathResult).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }
}
