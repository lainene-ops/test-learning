import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== 通讯录管理 ===");
            System.out.println("1-添加/修改");
            System.out.println("2-查询");
            System.out.println("3-查看全部");
            System.out.println("4-删除");
            System.out.println("0-退出");
            System.out.print("请选择：");

            String input = scanner.nextLine();
            int choice;

            try {
                choice = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("无效选项");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("请输入姓名：");
                    String name = scanner.nextLine().trim();
                    System.out.print("请输入电话：");
                    String phone = scanner.nextLine().trim();

                    if (name.isEmpty() || phone.isEmpty()) {
                        System.out.println("姓名和电话都不能为空");
                        break;
                    }

                    contacts.put(name, phone);
                    if (contacts.containsKey(name)) {
                        System.out.println("添加/修改成功");
                    }
                    break;

                case 2:
                    System.out.print("请输入要查询的姓名：");
                    String queryName = scanner.nextLine().trim();
                    if (contacts.containsKey(queryName)) {
                        System.out.println("电话号码：" + contacts.get(queryName));
                    } else {
                        System.out.println("没有找到");
                    }
                    break;

                case 3:
                    if (contacts.isEmpty()) {
                        System.out.println("通讯录为空");
                        break;
                    }

                    System.out.println("全部联系人：");
                    for (Map.Entry<String, String> entry : contacts.entrySet()) {
                        System.out.println(entry.getKey() + "：" + entry.getValue());
                    }
                    System.out.println("当前联系人数量：" + contacts.size());
                    break;

                case 4:
                    System.out.print("请输入要删除的姓名：");
                    String deleteName = scanner.nextLine().trim();
                    if (contacts.containsKey(deleteName)) {
                        contacts.remove(deleteName);
                        System.out.println("删除成功");
                    } else {
                        System.out.println("没有找到");
                    }
                    break;

                case 0:
                    System.out.println("退出通讯录");
                    scanner.close();
                    return;

                default:
                    System.out.println("无效选项");
                    break;
            }
        }
    }
}
