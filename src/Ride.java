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

    // ------------------------------ Part4A：乘坐历史管理方法 ------------------------------
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor != null) {
            rideHistory.add(visitor);
            System.out.println("成功添加游客到乘坐历史：" + visitor.getVisitorId() + "-" + visitor.getName());
        } else {
            System.out.println("添加失败：游客对象为空");
        }
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        if (visitor == null) {
            System.out.println("查询失败：游客对象为空");
            return false;
        }
        for (Visitor v : rideHistory) {
            if (v.getVisitorId().equals(visitor.getVisitorId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("乘坐历史为空");
            return;
        }
        System.out.println("=== " + rideName + " 乘坐历史（共" + rideHistory.size() + "人）===");
        Iterator<Visitor> iterator = rideHistory.iterator(); // 必须使用Iterator
        int index = 1;
        while (iterator.hasNext()) {
            Visitor visitor = iterator.next();
            System.out.println(index + ". " + visitor);
            index++;
        }
    }

    // ------------------------------ Part4B：排序方法 ------------------------------
    /**
     * 使用Comparator对乘坐历史进行排序
     */
    public void sortRideHistory(Comparator<Visitor> comparator) {
        if (rideHistory.isEmpty()) {
            System.out.println("乘坐历史为空，无需排序");
            return;
        }
        Collections.sort(rideHistory, comparator);
        System.out.println("乘坐历史排序完成");
    }

    // ------------------------------ Part5：运行游乐设施周期 ------------------------------
    @Override
    public void runOneCycle() {
        // 检查是否有操作员
        if (operator == null) {
            System.out.println("运行失败：" + rideName + " 未分配操作员");
            return;
        }
        // 检查队列是否有游客
        if (waitingLine.isEmpty()) {
            System.out.println("运行失败：" + rideName + " 队列无等待游客");
            return;
        }
        // 检查设施是否可用
        if (!isOperational) {
            System.out.println("运行失败：" + rideName + " 目前不可用");
            return;
        }

        System.out.println("\n=== " + rideName + " 开始运行第" + (numOfCycles + 1) + "周期 ===");
        int ridersThisCycle = 0;

        // 从队列取出最多maxRider名游客
        while (!waitingLine.isEmpty() && ridersThisCycle < maxRider) {
            Visitor visitor = waitingLine.poll();
            addVisitorToHistory(visitor); // 添加到乘坐历史
            ridersThisCycle++;
        }

        numOfCycles++; // 周期数+1
        System.out.println("周期运行完成！本次载客：" + ridersThisCycle + "人，累计运行：" + numOfCycles + "周期");
    }

    // ------------------------------ Part6：导出乘坐历史到文件 ------------------------------
    public void exportRideHistory(String filePath) {
        if (rideHistory.isEmpty()) {
            System.out.println("导出失败：乘坐历史为空");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // 遍历历史，按CSV格式写入（游客ID,姓名,年龄,电话,快速通行证）
            for (Visitor visitor : rideHistory) {
                String line = String.join(",",
                        visitor.getVisitorId(),
                        visitor.getName(),
                        String.valueOf(visitor.getAge()),
                        visitor.getPhoneNumber(),
                        String.valueOf(visitor.isHasFastPass())
                );
                writer.write(line);
                writer.newLine();
            }
            System.out.println("成功导出乘坐历史到文件：" + filePath);
        } catch (IOException e) {
            System.out.println("导出失败：" + e.getMessage());
        }
    }

    // ------------------------------ Part7：从文件导入乘坐历史 ------------------------------
    public void importRideHistory(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("导入失败：文件不存在 - " + filePath);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int importedCount = 0;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                // 按逗号分割CSV数据
                String[] parts = line.split(",");
                if (parts.length != 5) {
                    System.out.println("跳过无效数据行：" + line);
                    continue;
                }

                // 解析数据并创建游客对象
                Visitor visitor = new Visitor(
                        parts[1], // 姓名
                        Integer.parseInt(parts[2]), // 年龄
                        parts[3], // 电话
                        parts[0], // 游客ID
                        Boolean.parseBoolean(parts[4]) // 快速通行证
                );
                rideHistory.add(visitor);
                importedCount++;
            }
            System.out.println("导入完成！共导入" + importedCount + "名游客的乘坐历史");
        } catch (IOException e) {
            System.out.println("导入失败：" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("导入失败：数据格式错误 - " + e.getMessage());
        }
    }
}