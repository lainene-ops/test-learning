"""第 1 周练习：名片打印程序。"""


def make_card(name, age, school, major):
    return (
        "=" * 30
        + f"\n姓名：{name}"
        + f"\n年龄：{age}"
        + f"\n学校：{school}"
        + f"\n专业：{major}"
        + "\n" + "=" * 30
    )


if __name__ == "__main__":
    print(make_card("张三", 19, "某某大学", "计算机科学与技术"))
