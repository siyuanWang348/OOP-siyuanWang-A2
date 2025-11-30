# 课程作业：OOP-siyuanWang-A2

运行结果如下：
输入java -cp bin AssignmentTwo

C:\Users\28247\Desktop\OOP-siyuanWang-A2>java -cp bin AssignmentTwo
==================================== Part3 Demonstration: Queue Management ====================================
成功添加游客到队列：VIS001-sherry
成功添加游客到队列：VIS002-Susan
成功添加游客到队列：VIS003-Alina
成功添加游客到队列：VIS004-siyuanWang
成功添加游客到队列：VIS005-Lucy
=== Roller Coaster 等待队列（共5人）===
1. 姓名: sherry, 年龄: 25, 联系电话: 13900139001, 游客ID: VIS001, 快速通行证: 有
2. 姓名: Susan, 年龄: 22, 联系电话: 13900139002, 游客ID: VIS002, 快速通行证: 无
3. 姓名: Alina, 年龄: 30, 联系电话: 13900139003, 游客ID: VIS003, 快速通行证: 有
4. 姓名: siyuanWang, 年龄: 18, 联系电话: 13900139004, 游客ID: VIS004, 快速通行证: 无
5. 姓名: Lucy, 年龄: 28, 联系电话: 13113560313, 游客ID: VIS005, 快速通行证: 有
成功从队列移除游客：VIS001-sherry

Queue after removing 1 visitor:
=== Roller Coaster 等待队列（共4人）===
1. 姓名: Susan, 年龄: 22, 联系电话: 13900139002, 游客ID: VIS002, 快速通行证: 无
2. 姓名: Alina, 年龄: 30, 联系电话: 13900139003, 游客ID: VIS003, 快速通行证: 有
3. 姓名: siyuanWang, 年龄: 18, 联系电话: 13900139004, 游客ID: VIS004, 快速通行证: 无
4. 姓名: Lucy, 年龄: 28, 联系电话: 13113560313, 游客ID: VIS005, 快速通行证: 有

==================================== Part4A Demonstration: Ride History Management ====================================
成功添加游客到乘坐历史：VIS006-sherry
成功添加游客到乘坐历史：VIS007-Susan
成功添加游客到乘坐历史：VIS008-Alina
成功添加游客到乘坐历史：VIS009-siyuanWang
成功添加游客到乘坐历史：VIS010-Lisa

Is visitor Susan in ride history? Yes
Total visitors in ride history: 5
=== Thunderstorm Ride 乘坐历史（共5人）===
1. 姓名: sherry, 年龄: 24, 联系电话: 13700137001, 游客ID: VIS006, 快速通行证: 无
2. 姓名: Susan, 年龄: 26, 联系电话: 13700137002, 游客ID: VIS007, 快速通行证: 有
3. 姓名: Alina, 年龄: 21, 联系电话: 13700137003, 游客ID: VIS008, 快速通行证: 无
4. 姓名: siyuanWang, 年龄: 35, 联系电话: 13700137004, 游客ID: VIS009, 快速通行证: 有
5. 姓名: Lisa, 年龄: 29, 联系电话: 13113560313, 游客ID: VIS010, 快速通行证: 无

==================================== Part4B Demonstration: History Sorting ====================================
成功添加游客到乘坐历史：VIS011-sherry
成功添加游客到乘坐历史：VIS012-Susan
成功添加游客到乘坐历史：VIS013-Alina
成功添加游客到乘坐历史：VIS014-siyuanWang
成功添加游客到乘坐历史：VIS015-Eve
Ride history before sorting:
=== Log Flume 乘坐历史（共5人）===
1. 姓名: sherry, 年龄: 22, 联系电话: 13600136001, 游客ID: VIS011, 快速通行证: 无
2. 姓名: Susan, 年龄: 18, 联系电话: 13600136002, 游客ID: VIS012, 快速通行证: 有
3. 姓名: Alina, 年龄: 22, 联系电话: 13600136003, 游客ID: VIS013, 快速通行证: 有
4. 姓名: siyuanWang, 年龄: 30, 联系电话: 13600136004, 游客ID: VIS014, 快速通行证: 无
5. 姓名: Eve, 年龄: 18, 联系电话: 13113560313, 游客ID: VIS015, 快速通行证: 无
乘坐历史排序完成

Ride history after sorting (ascending by age, fast pass first for same age):
=== Log Flume 乘坐历史（共5人）===
1. 姓名: Susan, 年龄: 18, 联系电话: 13600136002, 游客ID: VIS012, 快速通行证: 有
2. 姓名: Eve, 年龄: 18, 联系电话: 13113560313, 游客ID: VIS015, 快速通行证: 无
3. 姓名: Alina, 年龄: 22, 联系电话: 13600136003, 游客ID: VIS013, 快速通行证: 有
4. 姓名: sherry, 年龄: 22, 联系电话: 13600136001, 游客ID: VIS011, 快速通行证: 无
5. 姓名: siyuanWang, 年龄: 30, 联系电话: 13600136004, 游客ID: VIS014, 快速通行证: 无

==================================== Part5 Demonstration: Ride Cycle Operation ====================================
成功添加游客到队列：VIS020-Visitor1
成功添加游客到队列：VIS021-Visitor2
成功添加游客到队列：VIS022-Visitor3
成功添加游客到队列：VIS023-Visitor4
成功添加游客到队列：VIS024-Visitor5
成功添加游客到队列：VIS025-Visitor6
成功添加游客到队列：VIS026-Visitor7
成功添加游客到队列：VIS027-Visitor8
成功添加游客到队列：VIS028-Visitor9
成功添加游客到队列：VIS029-Visitor10
Queue before operation:
=== Water Slide 等待队列（共10人）===
1. 姓名: Visitor1, 年龄: 18, 联系电话: 13400134000, 游客ID: VIS020, 快速通行证: 有
2. 姓名: Visitor2, 年龄: 19, 联系电话: 13400134001, 游客ID: VIS021, 快速通行证: 无
3. 姓名: Visitor3, 年龄: 20, 联系电话: 13400134002, 游客ID: VIS022, 快速通行证: 无
4. 姓名: Visitor4, 年龄: 21, 联系电话: 13400134003, 游客ID: VIS023, 快速通行证: 有
5. 姓名: Visitor5, 年龄: 22, 联系电话: 13400134004, 游客ID: VIS024, 快速通行证: 无
6. 姓名: Visitor6, 年龄: 23, 联系电话: 13400134005, 游客ID: VIS025, 快速通行证: 无
7. 姓名: Visitor7, 年龄: 24, 联系电话: 13400134006, 游客ID: VIS026, 快速通行证: 有
8. 姓名: Visitor8, 年龄: 25, 联系电话: 13400134007, 游客ID: VIS027, 快速通行证: 无
9. 姓名: Visitor9, 年龄: 26, 联系电话: 13400134008, 游客ID: VIS028, 快速通行证: 无
10. 姓名: Visitor10, 年龄: 27, 联系电话: 13400134009, 游客ID: VIS029, 快速通行证: 有

=== Water Slide 开始运行第1周期 ===
成功添加游客到乘坐历史：VIS020-Visitor1
成功添加游客到乘坐历史：VIS021-Visitor2
成功添加游客到乘坐历史：VIS022-Visitor3
成功添加游客到乘坐历史：VIS023-Visitor4
周期运行完成！本次载客：4人，累计运行：1周期

Queue after operation:
=== Water Slide 等待队列（共6人）===
1. 姓名: Visitor5, 年龄: 22, 联系电话: 13400134004, 游客ID: VIS024, 快速通行证: 无
2. 姓名: Visitor6, 年龄: 23, 联系电话: 13400134005, 游客ID: VIS025, 快速通行证: 无
3. 姓名: Visitor7, 年龄: 24, 联系电话: 13400134006, 游客ID: VIS026, 快速通行证: 有
4. 姓名: Visitor8, 年龄: 25, 联系电话: 13400134007, 游客ID: VIS027, 快速通行证: 无
5. 姓名: Visitor9, 年龄: 26, 联系电话: 13400134008, 游客ID: VIS028, 快速通行证: 无
6. 姓名: Visitor10, 年龄: 27, 联系电话: 13400134009, 游客ID: VIS029, 快速通行证: 有

Ride history after operation:
=== Water Slide 乘坐历史（共4人）===
1. 姓名: Visitor1, 年龄: 18, 联系电话: 13400134000, 游客ID: VIS020, 快速通行证: 有
2. 姓名: Visitor2, 年龄: 19, 联系电话: 13400134001, 游客ID: VIS021, 快速通行证: 无
3. 姓名: Visitor3, 年龄: 20, 联系电话: 13400134002, 游客ID: VIS022, 快速通行证: 无
4. 姓名: Visitor4, 年龄: 21, 联系电话: 13400134003, 游客ID: VIS023, 快速通行证: 有

==================================== Part6 Demonstration: Export History to File ====================================
成功添加游客到乘坐历史：VIS030-sherry
成功添加游客到乘坐历史：VIS031-Susan
成功添加游客到乘坐历史：VIS032-Alina
成功添加游客到乘坐历史：VIS033-siyuanWang
成功添加游客到乘坐历史：VIS034-Sophia
成功导出乘坐历史到文件：ride_history_export.csv

==================================== Part7 Demonstration: Import History from File ====================================
导入完成！共导入5名游客的乘坐历史
Total visitors after import: 5
Imported visitor details:
=== Import Test Ride 乘坐历史（共5人）===
1. 姓名: sherry, 年龄: 27, 联系电话: 13300133001, 游客ID: VIS030, 快速通行证: 有
2. 姓名: Susan, 年龄: 23, 联系电话: 13300133002, 游客ID: VIS031, 快速通行证: 无
3. 姓名: Alina, 年龄: 25, 联系电话: 13300133003, 游客ID: VIS032, 快速通行证: 有
4. 姓名: siyuanWang, 年龄: 32, 联系电话: 13300133004, 游客ID: VIS033, 快速通行证: 无
5. 姓名: Sophia, 年龄: 29, 联系电话: 13113560313, 游客ID: VIS034, 快速通行证: 有
