package pro.sky.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    private final CalcServiceInterface calcService;

    public CalcController(CalcServiceInterface calcService) {
        this.calcService = calcService;
    }

    @RequestMapping(path = "/calculator")
    public String calc() {
        return calcService.calc();
    }

    @RequestMapping(path = "/calculator/plus")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.calculate(num1, num2);
    }
}
