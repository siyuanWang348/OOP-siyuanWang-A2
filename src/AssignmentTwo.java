/**
 * 主类，包含各部分功能的演示方法
 */
public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo demo = new AssignmentTwo();

        // 依次运行各部分演示
        System.out.println("==================================== Part3 演示：队列管理 ====================================");
        demo.partThree();

        System.out.println("\n==================================== Part4A 演示：乘坐历史管理 ====================================");
        demo.partFourA();

        System.out.println("\n==================================== Part4B 演示：历史排序 ====================================");
        demo.partFourB();

        System.out.println("\n==================================== Part5 演示：运行游乐设施周期 ====================================");
        demo.partFive();

        System.out.println("\n==================================== Part6 演示：导出历史到文件 ====================================");
        demo.partSix();

        System.out.println("\n==================================== Part7 演示：从文件导入历史 ====================================");
        demo.partSeven();
    }

    // Part3：队列管理演示
    public void partThree() {
        // 创建操作员
        Employee operator = new Employee("张三", 30, "13800138000", "EMP001", "过山车区域");
        // 创建游乐设施
        Ride rollerCoaster = new Ride("过山车", "刺激类", true, operator, 2);

        // 添加5名游客到队列
        rollerCoaster.addVisitorToQueue(new Visitor("Jack", 25, "13900139001", "VIS001", true));
        rollerCoaster.addVisitorToQueue(new Visitor("Sharon", 22, "13900139002", "VIS002", false));
        rollerCoaster.addVisitorToQueue(new Visitor("Benny", 30, "13900139003", "VIS003", true));
        rollerCoaster.addVisitorToQueue(new Visitor("Leo", 18, "13900139004", "VIS004", false));
        rollerCoaster.addVisitorToQueue(new Visitor("Lucy", 28, "13900139005", "VIS005", true));

        // 打印队列
        rollerCoaster.printQueue();

        // 移除1名游客
        rollerCoaster.removeVisitorFromQueue();

        // 打印移除后的队列
        System.out.println("\n移除1名游客后的队列：");
        rollerCoaster.printQueue();
    }

    // Part4A：乘坐历史管理演示
    public void partFourA() {
        Ride thunderstorm = new Ride("雷暴飞车", "极速类", true, null, 4);

        // 添加5名游客到历史
        Visitor v1 = new Visitor("Tom", 24, "13700137001", "VIS006", false);
        Visitor v2 = new Visitor("Sherly", 26, "13700137002", "VIS007", true);
        Visitor v3 = new Visitor("Ben", 21, "13700137003", "VIS008", false);
        Visitor v4 = new Visitor("David", 35, "13700137004", "VIS009", true);
        Visitor v5 = new Visitor("Lisa", 29, "13700137005", "VIS010", false);

        thunderstorm.addVisitorToHistory(v1);
        thunderstorm.addVisitorToHistory(v2);
        thunderstorm.addVisitorToHistory(v3);
        thunderstorm.addVisitorToHistory(v4);
        thunderstorm.addVisitorToHistory(v5);

        // 检查游客是否在历史中
        Visitor checkVisitor = new Visitor("Sherly", 26, "13700137002", "VIS007", true);
        System.out.println("\n游客 " + checkVisitor.getName() + " 是否在乘坐历史中？" + (thunderstorm.checkVisitorFromHistory(checkVisitor) ? "是" : "否"));

        // 打印历史游客数量
        System.out.println("乘坐历史游客总数：" + thunderstorm.numberOfVisitors());

        // 打印乘坐历史
        thunderstorm.printRideHistory();
    }

    // Part4B：历史排序演示
    public void partFourB() {
        Ride logFlume = new Ride("激流勇进", "水上类", true, null, 6);

        // 添加5名游客到历史
        logFlume.addVisitorToHistory(new Visitor("Alice", 22, "13600136001", "VIS011", false));
        logFlume.addVisitorToHistory(new Visitor("Bob", 18, "13600136002", "VIS012", true));
        logFlume.addVisitorToHistory(new Visitor("Charlie", 22, "13600136003", "VIS013", true));
        logFlume.addVisitorToHistory(new Visitor("Diana", 30, "13600136004", "VIS014", false));
        logFlume.addVisitorToHistory(new Visitor("Eve", 18, "13600136005", "VIS015", false));

        // 排序前打印
        System.out.println("排序前的乘坐历史：");
        logFlume.printRideHistory();

        // 使用自定义比较器排序
        logFlume.sortRideHistory(new VisitorComparator());

        // 排序后打印
        System.out.println("\n排序后的乘坐历史（按年龄升序，同年龄有快速通行证在前）：");
        logFlume.printRideHistory();
    }

    // Part5：运行游乐设施周期演示
    public void partFive() {
        // 创建操作员
        Employee operator = new Employee("李四", 35, "13500135000", "EMP002", "水上设施区域");
        // 创建游乐设施（每周期最多4人）
        Ride waterSlide = new Ride("水上滑梯", "水上类", true, operator, 4);

        // 添加10名游客到队列
        for (int i = 0; i < 10; i++) {
            waterSlide.addVisitorToQueue(new Visitor(
                    "游客" + (i + 1),
                    18 + (i % 20), // 年龄18-37岁
                    "1340013400" + i,
                    "VIS0" + (20 + i),
                    i % 3 == 0 // 每3人1个快速通行证
            ));
        }

        // 打印运行前队列
        System.out.println("运行前队列：");
        waterSlide.printQueue();

        // 运行1个周期
        waterSlide.runOneCycle();

        // 打印运行后队列和历史
        System.out.println("\n运行后队列：");
        waterSlide.printQueue();

        System.out.println("\n运行后的乘坐历史：");
        waterSlide.printRideHistory();
    }

    // Part6：导出历史到文件演示
    public void partSix() {
        Ride FerrisWheel = new Ride("摩天轮", "观光类", true, null, 8);

        // 添加5名游客到历史
        FerrisWheel.addVisitorToHistory(new Visitor("Mike", 27, "13300133001", "VIS030", true));
        FerrisWheel.addVisitorToHistory(new Visitor("Emma", 23, "13300133002", "VIS031", false));
        FerrisWheel.addVisitorToHistory(new Visitor("Olivia", 25, "13300133003", "VIS032", true));
        FerrisWheel.addVisitorToHistory(new Visitor("Noah", 32, "13300133004", "VIS033", false));
        FerrisWheel.addVisitorToHistory(new Visitor("Sophia", 29, "13300133005", "VIS034", true));

        // 导出到CSV文件（路径可根据实际调整）
        FerrisWheel.exportRideHistory("ride_history_export.csv");
    }

    // Part7：从文件导入历史演示
    public void partSeven() {
        Ride importRide = new Ride("导入测试设施", "测试类", true, null, 5);

        // 从Part6导出的文件导入
        importRide.importRideHistory("ride_history_export.csv");

        // 验证导入结果
        System.out.println("导入后的游客总数：" + importRide.numberOfVisitors());
        System.out.println("导入的游客详情：");
        importRide.printRideHistory();
    }
}