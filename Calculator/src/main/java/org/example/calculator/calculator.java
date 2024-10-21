package org.example.calculator;

public class calculator {
    private int op1;
    private int op2;
    private char operator;
    private int result;
    private boolean isError;

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int getResult() {
        return result;
    }
    public void calculate() {
        if(this.operator == '+') {
            this.result = this.op1 + this.op2;
        }
        else if(this.operator == '-') {
            this.result = this.op1 - this.op2;
        }
        else if(this.operator == '*') {
            this.result = this.op1 * this.op2;
        }
        else if(this.operator == '/') {
            this.result = this.op1 / this.op2;
            if(this.op2==0)
            {
                this.isError = true;
            }
            else {
                this.isError = false;
            }
            }
        }
}

