/**
 * 员工类（游乐设施操作员），继承自Person类
 * 包含员工特有属性（员工ID、负责区域）
 */
public class Employee extends Person {
    // 2个特有实例变量
    private String employeeId;
    private String responsibleArea;

    // 默认构造器
    public Employee() {}

    // 带参构造器（初始化父类属性和自身属性）
    public Employee(String name, int age, String phoneNumber, String employeeId, String responsibleArea) {
        super(name, age, phoneNumber);
        this.employeeId = employeeId;
        this.responsibleArea = responsibleArea;
    }

    // Getter和Setter方法
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getResponsibleArea() {
        return responsibleArea;
    }

    public void setResponsibleArea(String responsibleArea) {
        this.responsibleArea = responsibleArea;
    }

    // 重写toString方法，补充员工特有信息
    @Override
    public String toString() {
        return super.toString() + ", 员工ID: " + employeeId + ", 负责区域: " + responsibleArea;
    }
}