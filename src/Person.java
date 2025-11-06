/**
 * 抽象人员类，包含人员通用属性和方法
 * 不可实例化，仅作为Employee和Visitor的父类
 */
public abstract class Person {
    // 3个实例变量（姓名、年龄、联系电话）
    private String name;
    private int age;
    private String phoneNumber;

    // 默认构造器
    public Person() {}

    // 带参构造器（初始化所有实例变量）
    public Person(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Getter和Setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) { // 数据验证
            this.age = age;
        } else {
            System.out.println("年龄输入无效，必须在0-120之间");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // 重写toString方法，用于打印人员信息
    @Override
    public String toString() {
        return "姓名: " + name + ", 年龄: " + age + ", 联系电话: " + phoneNumber;
    }
}