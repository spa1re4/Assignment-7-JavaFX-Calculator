package org.example.calculator;

public class calculator {
    private double operand1;
    private double operand2;
    private char operator;
    private boolean error;
    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }
    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }
    public void setOperator(char operator) {
        this.operator = operator;
    }
    public boolean isError() {
        return error;
    }
    public double getResult() {
        error = false;
        double result = 0;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    error = true;
                }
                break;
            default:
                error = true;
                break;
        }
        return result;
    }
}
