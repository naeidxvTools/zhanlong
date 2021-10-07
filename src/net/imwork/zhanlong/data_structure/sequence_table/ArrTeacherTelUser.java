package net.imwork.zhanlong.data_structure.sequence_table;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 展龙
 */
public class ArrTeacherTelUser
{
    public static void main(String[] args) throws IOException
    {
        ArrTeacherTel teacherTel = new ArrTeacherTel(20);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            System.out.print("********教师电话管理系统********\n");
            System.out.print("1 增加记录\n");
            System.out.print("2 显示所有信息\n");
            System.out.print("3 根据教师编号查找记录\n");
            System.out.print("4 获取教师电话信息记录个数\n");
            System.out.print("5 根据编号删除记录\n");
            System.out.print("6 根据教师姓名查找记录\n");
            System.out.print("7 根据教师姓名删除记录\n");
            System.out.print("0 退出\n");
            System.out.print("请输入你的选择： ");
            int choice = Integer.parseInt(br.readLine());

            switch (choice)
            {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("\n请输入教师编号：");
                    int TeacherNum = Integer.parseInt(br.readLine());
                    System.out.print("请输入姓名： ");
                    String TeacherName = br.readLine();
                    System.out.print("请输入电话号码： ");
                    String TeacherTelephone = br.readLine();
                    TeacherTel teacherNode = new TeacherTel(TeacherNum, TeacherName, TeacherTelephone);
                    teacherTel.add(teacherNode);
                    System.out.println();
                    break;
                case 2:
                    teacherTel.listAll();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("\n请输入教师编号：");
                    int teacherNo = Integer.parseInt(br.readLine());
                    teacherTel.search(teacherNo);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("教师电话记录个数为： " + teacherTel.getCounts());
                    break;
                case 5:
                    System.out.println("请输入要删除记录的教师编号：");
                    int teacherId = Integer.parseInt(br.readLine());
                    teacherTel.delete(teacherId);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("请输入要查询记录的教师姓名：");
                    String name1 = br.readLine();
                    teacherTel.delete(name1);
                    System.out.println();
                    break;
                case 7:
                    System.out.println("请输入要删除的教师姓名：");
                    String name = br.readLine();
                    teacherTel.delete(name);
                    System.out.println();
                    break;
            }

        }

    }
}
