import java.nio.charset.Charset;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, Charset.forName("GBK"));
        while (true) {
            System.out.print("请输入第一个数（输入 q 退出）：");
            String first = sc.nextLine();

            // TODO 1：如果输入的是 q，打印"已退出"并 break
            if (first.equals("q")) {
                System.out.println("已退出");
                break;
            }

            // TODO 2：把 first 转成 double，转不了就提示并 continue
            // 提示：Double.parseDouble(first)，用 try-catch 捕获异常
            double num1;
            try {
                num1 = Double.parseDouble(first);
            } catch (NumberFormatException e) {
                System.out.println("输入的第一个数不是有效数字，请重新输入！");
                continue;
            }

            System.out.print("请输入运算符（+ - * /）：");
            String op = sc.nextLine();

            System.out.print("请输入第二个数：");
            String second = sc.nextLine();

            // TODO 3：把 second 转成 double
            double num2;
            try {
                num2 = Double.parseDouble(second);
            } catch (NumberFormatException e) {
                System.out.println("输入的第二个数不是有效数字，请重新输入！");
                continue;
            }

            // TODO 4：用 switch 根据 op 计算结果
            // 除法时如果第二个数是 0，提示"除数不能为 0"并 continue
            double result = 0;
            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("除数不能为 0");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("非法运算符，请重新输入！");
                    continue;
            }

            // TODO 5：打印结果
            System.out.println("结果：" + result);
        }
    }
}
