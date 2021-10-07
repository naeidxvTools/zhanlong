package net.imwork.zhanlong.data_structure.sequence_table;

/**
 * 此接口定义了顺序表的数据操作
 * @author 展龙
 */
public interface TeacherTelOperation
{
    /**
     * 获取记录个数
     * @return
     */
    int getCounts();

    /**
     * 在顺序表的尾部添加一个教师电话记录
     * @param node
     */
    void add(TeacherTel node);

    /**
     * 遍历顺序表中所有教师电话记录
     */
    void listAll();

    /**
     *  根据教师编号查询记录
     * @param index
     */
    void search(int index);

    /**
     *  根据教师姓名查询记录
     * @param name
     */
    void search(String name);

    /**
     * 根据教师编号删除记录
     * @param index
     */
    void delete(int index);

    /**
     * 根据教师姓名删除记录
     * @param name
     */
    void delete(String name);

}
