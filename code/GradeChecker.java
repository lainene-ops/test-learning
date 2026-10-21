import java.nio.charset.Charset;
import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, Charset.forName("GBK"));
        System.out.print("请输入分数（0-100）：");

        if (!sc.hasNextInt()) {
            System.out.println("请输入数字");
            return;
        }
        int score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("分数超出范围");
            return;
        }
        // TODO 1：判断范围，超出 0-100 就提示并结束
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        // TODO 2：按分数输出 A / B / C / D
    }System.out.println("switch 版本："+ gradeWithSwitch(score));
}



public static String gradeWithSwitch(int score) {
    int level = score / 10;
    switch (level) {
        case 10:
        case 9:
            return "A";
        case 8:
            return "B";
        case 7:
        case 6:
            return "C";
        default:
            return "D";
    }
}
