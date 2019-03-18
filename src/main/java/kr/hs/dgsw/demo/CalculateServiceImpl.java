package kr.hs.dgsw.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService{
    @Override
    public int calculate(int num1, int num2, String cal) {
        switch (cal){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "÷":
                return num1 / num2;
        }
        return 0;
    }
}
