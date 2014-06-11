package tr.com.lucidcode.demo.calculator;
 
public class Calculator {
    
    public Integer firstNumber;
    public Integer secondNumber;
    public String operator;
 
    public Integer performOperation() {
        if ("+".equals(this.operator)) {
            return firstNumber + this.secondNumber;
        } else {
            return firstNumber - this.secondNumber;
        }      
    }
}
