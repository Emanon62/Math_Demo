package Function;

@SuppressWarnings("all")
public class Moderate extends Easy{//中等难度,100以内整数加减乘除
    private int score = 0;

    private String[] operators = {"+","-","*"};//随机生成加减乘除符号
    private String operator;
    private int num1;
    private int num2;
    private double answer;
    //重写returnNum1()方法
    public int returnNum1() {
        num1 = random.nextInt(101);
        return num1;
    }
    //重写returnNum2()方法
    public int returnNum2() {
        num2 = random.nextInt(101);
        return num2;
    }

}