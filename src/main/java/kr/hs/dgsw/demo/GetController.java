package kr.hs.dgsw.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @Autowired
    private CalculateService cs;

    @GetMapping("/cal/{num1}/{num2}/{cal}")
    public int cal(@PathVariable int num1, @PathVariable int num2, @PathVariable String cal){
        return cs.calculate(num1, num2, cal);
    }
}
