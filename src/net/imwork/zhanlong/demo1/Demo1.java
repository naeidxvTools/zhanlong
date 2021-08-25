package net.imwork.zhanlong.demo1;

/**
 * @author 展龙
 */
public class Demo1
{
    public static void main(String[] args)
    {
        // 整型
        byte b = 127;
        Byte b2 = 127;

        short sh = 10;
        Short sh2 = 10;

        int i = 10;
        Integer i2 = 10;

        long lo = 10;
        Long lo2 = (long)10;

        // 浮点型
        float f = 1.2f;
        Float f2 = 1.2f;

        f = 10;
        double d = 1.2;
        Double d2 = 1.2;

        d = 10;

        d = b;

        // 字符型
        char ch = 'A';
        ch = 10;
        // 布尔型
        boolean bo = true;
        Boolean bo2 = true;

        // byte short int long float double char boolean
        // Byte Short Integer Long Float Double Character Boolean

        /*
        四、基本类型之间的转换

            将一种类型的值赋值给另一种类型是很常见的。在Java中，boolean 类型与其他7中类型的数据都不能进行转换，
            这一点很明确。但对于其他7种数据类型，它们之间都可以进行转换，只是可能会存在精度损失或其他一些变化。
            转换分为自动转换和强制转换：
            自动转换（隐式）：无需任何操作。
            强制转换（显式）：需使用转换操作符（type）。
            将6种数据类型按下面顺序排列一下：
            double > float > long > int > short > byte
            如果从小转换到大，那么可以直接转换，而从大到小，或char 和其他6种数据类型转换，则必须使用强制转换。
            1、自动转换
            自动转换时发生扩宽（widening conversion）。因为较大的类型（如int）要保存较小的类型（如byte），内存总是足够的，
            不需要强制转换。如果将字面值保存到byte、short、char、long的时候，也会自动进行类型转换。注意区别，此时从int（没有带L的整型字面值为int）
            到byte/short/char也是自动完成的，虽然它们都比int小。在自动类型转化中，除了以下几种情况可能会导致精度损失以外，其他的转换都不能出现精度损失。
            》int--> float
            》long--> float
            》long--> double
            》float -->double without strictfp
            除了可能的精度损失外，自动转换不会出现任何运行时（run-time）异常。
            2、强制类型转换
            如果要把大的转成小的，或者在short与char之间进行转换，就必须强制转换，也被称作缩小转换（narrowing conversion）,
            因为必须显式地使数值更小以适应目标类型。强制转换采用转换操作符（）。严格地说，将byte转为char不属于narrowing conversion），
            因为从byte到char的过程其实是byte-->int-->char，所以widening和narrowing都有。强制转换除了可能的精度损失外，还可能使模（overall magnitude）发生变化。强制转换格式如下：
            (target-type) value;
            如果整数的值超出了byte所能表示的范围，结果将对byte类型的范围取余数。例如a=256超出了byte的[-128,127]的范围，所以将257除以byte的范围（256）
            取余数得到b=1；需要注意的是，当a=200时，此时除了256取余数应该为-56，而不是200。
            将浮点类型赋给整数类型的时候，会发生截尾（truncation）。也就是把小数的部分去掉，只留下整数部分。此时如果整数超出目标类型范围，一样将对目标类型的范围取余数。
         */







    }

}

