package calculator;

public class Calculator {
    private float _num1;
    private float _num2;

    public Calculator(int num1, int num2) {
        this._num1 = num1;
        this._num2 = num2;
    }

    public void add() {
        float result = this._num1 + this._num2;
        System.out.println(this._num1 + "+" + this._num2 + " = " + result);
    }

    public void subtract() {
        double result = this._num1 - this._num2;
        System.out.println(this._num1 + "-" + this._num2 + " = " + result);
    }

    public void multiply() {
        float result = this._num1 * this._num2;
        System.out.println(this._num1 + "*" + this._num2 + " = " + result);
    }

    public void divide() {
        float result = this._num1 / this._num2;
        System.out.println(this._num1 + "/" + this._num2 + " = " + result);
    }

    public static void main(String[] args) {
        Calculator result1 = new Calculator(5, 7);
        result1.add();
        result1.subtract();
        result1.multiply();
        result1.divide();

        System.out.println("\n===========================\n");

        Calculator result2 = new Calculator(9, 17);
        result2.add();
        result2.subtract();
        result2.multiply();
        result2.divide();
    }
}