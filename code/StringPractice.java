import java.nio.charset.Charset;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, Charset.forName("GBK"));
        System.out.print("请输入一句话：");
        String text = sc.nextLine();

        // 1. 总字符数
        System.out.println("字符总数：" + text.length());

        // 2. 空格个数
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;

            }
        }
        // TODO：用 for 循环 + charAt(i)，遇到空格就 +1

        System.out.println("空格个数：" + spaceCount);

        // 3. 去掉空格后的字符数
        String newtext = text.replace(" ", "");
        System.out.println("去掉完空格后的字符数：" + newtext.length());

        // TODO：用 replace 把空格换成空字符串，再取 length

        // 4. 反转
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("反转后：" + reversed);

        // 5. 是否包含"测试"
        boolean containTest = text.contains("测试");
        System.out.println("是否包含测试：" + containTest);
        // TODO：用 contains，输出 是 或 否

        // 6. 全大写
        System.out.println("大写：" + text.toUpperCase());
    }
}
