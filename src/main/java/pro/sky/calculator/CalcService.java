package pro.sky.calculator;

import org.springframework.stereotype.Service;
@Service
public class CalcService implements CalcServiceInterface{
    public String calc(){
        return "Добро пожаловать в калькулятор";
    }
    public String calculate(int num1, int num2){
        num2 = 5;
        num1 = 5;
        int i = num1+num2;
        return num1 + " + " + num2 + " = " + i;
    }
}
