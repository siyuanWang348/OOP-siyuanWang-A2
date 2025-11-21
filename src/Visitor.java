// src/Visitor.java
/**
 * 游客类，继承自Person类
 * 包含游客特有属性（游客ID、是否有快速通行证）
 */
public class Visitor extends Person {
    // 2个特有实例变量
    private String visitorId;
    private boolean hasFastPass;

    // 默认构造器
    public Visitor() {}

    // 带参构造器（初始化父类属性和自身属性）
    public Visitor(String name, int age, String phoneNumber, String visitorId, boolean hasFastPass) {
        super(name, age, phoneNumber);
        this.visitorId = visitorId;
        this.hasFastPass = hasFastPass;
    }

    // Getter和Setter方法
    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public boolean isHasFastPass() {
        return hasFastPass;
    }

    public void setHasFastPass(boolean hasFastPass) {
        this.hasFastPass = hasFastPass;
    }

    // 重写toString方法，补充游客特有信息
    @Override
    public String toString() {
        return super.toString() + ", 游客ID: " + visitorId + ", 快速通行证: " + (hasFastPass ? "有" : "无");
    }
}