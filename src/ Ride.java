/**
 * 游乐设施类，实现RideInterface接口
 * 管理队列、乘坐历史、运行周期等核心功能
 */
import java.util.*;
import java.io.*;

public class Ride implements RideInterface {
    // 3个基础实例变量（名称、类型、状态）+ 1个Employee类型变量（操作员）
    private String rideName;
    private String rideType;
    private boolean isOperational;
    private Employee operator;

    // 队列（存储等待游客，FIFO）
    private Queue<Visitor> waitingLine;
    // 乘坐历史（存储已乘坐游客）
    private LinkedList<Visitor> rideHistory;

    // Part5要求的实例变量
    private int maxRider;       // 每周期最大载客量
    private int numOfCycles;    // 已运行周期数（默认0）

    // 构造器
    public Ride() {
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.numOfCycles = 0;
    }

    // 带参构造器
    public Ride(String rideName, String rideType, boolean isOperational, Employee operator, int maxRider) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.isOperational = isOperational;
        this.operator = operator;
        this.maxRider = maxRider;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.numOfCycles = 0;
    }

    // Getter和Setter方法
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean operational) {
        isOperational = operational;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        if (maxRider >= 1) { // 每周期至少1人
            this.maxRider = maxRider;
        } else {
            System.out.println("最大载客量无效，必须大于等于1");
            this.maxRider = 1; // 默认值
        }
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    // ------------------------------ Part3：队列管理方法 ------------------------------
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor != null) {
            waitingLine.offer(visitor);
            System.out.println("成功添加游客到队列：" + visitor.getVisitorId() + "-" + visitor.getName());
        } else {
            System.out.println("添加失败：游客对象为空");
        }
    }

    @Override
    public void removeVisitorFromQueue() {
        if (waitingLine.isEmpty()) {
            System.out.println("队列为空，无法移除游客");
            return;
        }
        Visitor removed = waitingLine.poll();
        System.out.println("成功从队列移除游客：" + removed.getVisitorId() + "-" + removed.getName());
    }

    @Override
    public void printQueue() {
        if (waitingLine.isEmpty()) {
            System.out.println("当前队列无等待游客");
            return;
        }
        System.out.println("=== " + rideName + " 等待队列（共" + waitingLine.size() + "人）===");
        int index = 1;
        for (Visitor visitor : waitingLine) {
            System.out.println(index + ". " + visitor);
            index++;
        }
    }

   