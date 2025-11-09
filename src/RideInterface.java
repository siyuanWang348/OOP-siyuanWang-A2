/**
 * 游乐设施接口，定义游乐设施必须实现的核心方法
 */
import java.util.Visitor;

public interface RideInterface {
    // 队列管理方法
    void addVisitorToQueue(Visitor visitor);
    void removeVisitorFromQueue();
    void printQueue();

    // 乘坐历史管理方法
    void addVisitorToHistory(Visitor visitor);
    boolean checkVisitorFromHistory(Visitor visitor);
    int numberOfVisitors();
    void printRideHistory();

    // 运行游乐设施方法
    void runOneCycle();
}