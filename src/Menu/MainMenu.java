package Menu;

import java.util.Scanner;
public class MainMenu {//主菜单
    SunMenu s = new SunMenu();
    char key = ' ';
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    public MainMenu() {
        System.out.println("欢迎进入小猿口算!\n");
    }
    public void mainMenu() {
        do {
            System.out.println("\\t\\t\\t1 开 始 答 题");//里面有难度选择
            System.out.println("\\t\\t\\t2 限 时 挑 战");
            System.out.println("\\t\\t\\t4 退 出 程 序");//loop = false
            key = scanner.next().charAt(0);
            switch(key) {
                case '1' :
                    s.Selection();
                    break;
                case '2' :
                    break;
                case '3' :
                    break;
                case '4' :
                    break;
            }
        }while(loop);
    }
}
