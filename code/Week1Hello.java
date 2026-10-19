
/** 第 1 周练习：名片打印程序。 */
import java.util.Scanner;

public class Week1Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入姓名：");
        String name = sc.nextLine();

        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("请输入专业：");
        String major = sc.nextLine();

        System.out.print("请输入学校：");
        String school = sc.nextLine();

        String line = "=".repeat(30);
        System.out.println(line);
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("专业：" + major);
        System.out.println("学校：" + school);
        System.out.println(line);
    }
}
