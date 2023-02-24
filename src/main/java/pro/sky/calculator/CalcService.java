package pro.sky.calculator;

import org.springframework.stereotype.Service;
@Service
public class CalcService implements CalcServiceInterface{
    public String calc(){
        return "Добро пожаловать в калькулятор";
    }
    public String calculate(int num1, int num2){
        int i = num1+num2;
        return num1 + " + " + num2 + " = " + i;
    }
    public String calculateMin(int num1, int num2){
        int i = num1-num2;
        return num1 + " - " + num2 + " = " + i;
    }
    public String calculateMultiply(int num1, int num2){
        int i = num1*num2;
        return num1 + " * " + num2 + " = " + i;
    }
    public String calculateDivide(int num1, int num2){
        if(num2 == 0) return "ошибка";
        int i = num1/num2;
        return num1 + " / " + num2 + " = " + i;
    }
}
