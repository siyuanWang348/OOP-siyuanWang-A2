// src/VisitorComparator.java
/**
 * 游客比较器，实现Comparator接口
 * 排序规则：先按年龄升序，再按是否有快速通行证降序（有通行证在前）
 */
import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // 1. 按年龄升序排序
        int ageCompare = Integer.compare(v1.getAge(), v2.getAge());
        if (ageCompare != 0) {
            return ageCompare;
        }

        // 2. 年龄相同则按快速通行证降序（有>无）
        return Boolean.compare(v2.isHasFastPass(), v1.isHasFastPass());
    }
}