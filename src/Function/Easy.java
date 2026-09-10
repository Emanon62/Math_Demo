package Function;

import java.util.Random;//随机生成
import java.util.Scanner;
@SuppressWarnings("all")
public class Easy {//简单程度,20以内整数加减乘除
    private int score = 0;
    private String[] operators = {"+","-","*"};//随机生成加减乘除符号
    private String operator;
    private int num1;
    private int num2;
    private double answer;//输入答案
    private String[] mistake = new String[10];
    private int k = 0;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    //----------随机生成num1----------//
    public int returnNum1() {
        num1 = random.nextInt(21);
        return num1;
    }

    //----------随机生成num2----------//
    public int returnNum2() {
        num2 = random.nextInt(21);
        return num2;
    }

    //----------随机生成运算符----------//
    public String returnoperator() {
        int opIndex = random.nextInt(operators.length);
        operator = operators[opIndex];
        return operator;
    }

    //运算,随机生成题目,并返回最后的分数;
    public void calculate() {
        for(int i=0;i<10;i++) {
            num1 = returnNum1();
            num2 = returnNum2();
            operator = returnoperator();
            switch(operator) {
                case "+" :
                    System.out.print("第"+(i+1)+"题: " + num1 + " + " + num2 + " = ");
                    if(Answer() == (num1 + num2)) {
                        score+=10;
                    }else {
                        mistake[k++] = num1 + "+" + num2 + "=" + (num1+num2);
                    }
                    break;
                case "-" :
                    System.out.print("第"+(i+1)+"题: " + num1 + " - " + num2 + " = ");
                    if(Answer() == (num1 - num2)) {
                        score+=10;
                    }else {
                        mistake[k++] = num1 + "-" + num2 + "=" + (num1-num2);
                    }
                    break;
                case "*" :
                    System.out.print("第"+(i+1)+"题: " + num1 + " * " + num2 + " = ");
                    if(Answer() == (num1 * num2)) {
                        score+=10;
                    }else {
                        mistake[k++] = num1 + "*" + num2 + "=" + (num1*num2);
                    }
                    break;
            }
        }
        System.out.println("\n您的最终得分为: " + score);
        if(score!=100) {
            System.out.print("是否展示错题(Yes/No): ");
            Print(mistake,k);
        }
    }
    //==========从键盘输入答案==========//
    public double Answer() {
        try {
            answer = scanner.nextDouble();
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            System.out.println("错误类型: " + e.getMessage());
            scanner.nextLine();
        }
        return answer;
    }
    public void Print(String[] mistake,int k) {//用于判断输出错题
        while(true) {
            String answer = scanner.next();
            if(answer.toUpperCase().equals( "YES")) {
                int j = 0;
                for(int i=0;i<k;i++) {
                    System.out.print(mistake[i] + "  ");
                    j++;
                    if(j % 3 == 0) {
                        System.out.println();
                    }
                }
                System.out.println();
                return;
            }else if(answer.toUpperCase().equals( "NO")){
                return;
            }else {
                System.out.print("请输入正确的指令(Yes/No): ");
            }
        }
    }
}
