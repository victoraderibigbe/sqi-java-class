public class Calculator {
    private int _num1;
    private int _num2;

    public Calculator(int num1, int num2) {
        _num1 = num1;
        _num2 = num2;
    }

    // public void add() {
    // System.out.println(_num1 + _num2);
    // }

    public int add() {
        return _num1 + _num2;
    }

    public static void main(String[] args) {
        Calculator result1 = new Calculator(5, 7);
        // result1.add();
        System.out.println(result1.add());
    }

}