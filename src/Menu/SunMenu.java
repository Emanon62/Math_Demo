package Menu;

import Function.*;
import java.util.Scanner;
public class SunMenu {//子菜单,负责执行主菜单的命令
    Easy e = new Easy();
    Moderate m = new Moderate();
    char key = ' ';
    Scanner scanner = new Scanner(System.in);
    public void Selection() {//进行难易程度选择
        System.out.print("选择你需要的难易程度(A/B/C): ");
        readChar();
        switch(key) {
            case 'A' :
                System.out.println("\n简 单 程 度");
                e.calculate();
                break;
            case 'B' :
                System.out.println("\n中 等 程 度");
                m.calculate();
                break;
            case 'C' :
                break;
        }
    }
    public void readChar() {//对输入结果进行判断ABC
        key = scanner.next().charAt(0);
        if(key == 'a'||key == 'A')
            key = 'A';
        else if(key == 'b'||key == 'B')
            key = 'B';
        else if(key == 'c'|| key == 'C')
            key = 'C';
        else {
            System.out.print("请重新选择(A/B/C): ");
            readChar();//递归
        }
    }

}
