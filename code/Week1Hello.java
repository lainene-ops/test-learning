/** 第 1 周练习：名片打印程序。 */
public class Week1Hello {
    public static void main(String[] args) {
        String name = "张三";
        int age = 19;
        String school = "某某大学";
        String major = "计算机科学与技术";

        String line = "=".repeat(30);
        System.out.println(line);
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("学校：" + school);
        System.out.println("专业：" + major);
        System.out.println(line);
    }
}
