package net.imwork.zhanlong.data_structure.linked_list;

/**
 * 此接口定义了链表的数据操作
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
     * 在链表添加一个教师电话记录，并且在添加时按教师编号从小到大的顺序插入结点
     * @param node
     */
    void add(TeacherTel node);

    /**
     * 遍历顺链表中所有教师电话记录
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
