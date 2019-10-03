package pl.lkre.service;

import pl.lkre.model.Result;

public class CalculatorImpl implements Calculator {
    public Result square(int a) {
        return new Result(a * a);
    }
}
