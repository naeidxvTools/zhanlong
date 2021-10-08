package net.imwork.zhanlong.data_structure.sequence_table;

/**
 * 定义顺序表中的数据元素类型
 * @author Administrator
 */
public class TeacherTel
{
    private String name;
    private int teacherNo;
    private String telephone;

    public TeacherTel()
    {
    }

    public TeacherTel(int teacherNo, String name, String telephone)
    {
        this.name = name;
        this.teacherNo = teacherNo;
        this.telephone = telephone;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getTeacherNo()
    {
        return teacherNo;
    }

    public void setTeacherNo(int teacherNo)
    {
        this.teacherNo = teacherNo;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    @Override
    public String toString()
    {
        return teacherNo + "," + name + "," + telephone;
    }
}
