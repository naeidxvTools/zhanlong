package net.imwork.zhanlong.demo3;

import java.util.Random;

/**
 * @author Administrator
 *
 * 随机生成 50 个数字（整数），每个数字的范围是[10, 50]，统计每个数字出现的次数以及出现次数最多的数字与它的个数，
 * 最后将每个数字及其出现次数打印出来，如果某个数字出现次数为 0，则不要打印它。打印时按照数字的升序排列。
 */
public class Homework
{
    public static void main(String[] args)
    {

        int[] count = new int[41];

        Random random = new Random();

        for(int i = 0; i < 50; i++)
        {
            // [10, 50]
            int number = random.nextInt(41) + 10;

            System.out.println(number);

            count[number - 10]++;
        }

        for(int i = 0; i < count.length; i++)
        {
            if(0 == count[i])
            {
                continue;
            }

            System.out.println((10 + i) + "出现次数：" + count[i]);
        }

        int max = count[0];

        for(int i = 0; i < count.length; i++)
        {
            if(max < count[i])
            {
                max = count[i];
            }
        }

        System.out.println("出现的最大次数为：" +  max + "次");

        for(int i = 0; i < count.length; i++)
        {
            if(max == count[i])
            {
                System.out.println(i + 10);
            }
        }

    }
}
