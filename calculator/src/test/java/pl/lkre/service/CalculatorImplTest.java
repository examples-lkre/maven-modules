package pl.lkre.service;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.apachecommons.ReflectionEquals;
import pl.lkre.model.Result;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorImplTest {

    @Test
    void square() {
        //given
        Calculator calculator = new CalculatorImpl();
        //when
        Result actual = calculator.square(5);
        Result expected = new Result(25);
        //then
        assertTrue(new ReflectionEquals(actual).matches(expected));
    }
}