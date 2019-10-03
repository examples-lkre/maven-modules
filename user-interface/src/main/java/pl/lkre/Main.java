package pl.lkre;

import pl.lkre.model.Result;
import pl.lkre.service.Calculator;
import pl.lkre.service.CalculatorImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int i = scanner.nextInt();
        Result result = calculator.square(i);
        System.out.println("Wynik: " + result.getValue());
    }
}
