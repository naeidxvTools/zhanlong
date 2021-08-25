package net.imwork.zhanlong.demo2;

/**
 * @author Administrator
 */
public class StringTest
{
    public static void main(String[] args)
    {

        String str = "aa";
        String str2 = new String("aa");

        String str3 = str2.intern();

        System.out.println(str == str3);


        Person person = new Person();

        System.out.println("person: " + person);

        System.out.println("person.toString(): " + person.toString());

        System.out.println("===================");

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello ").append("world.");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.toString());

        int a = 10;

        Integer ii = new Integer(a);
        System.out.println(ii.intValue());

        System.out.println(Integer.MAX_VALUE);

        int i = Integer.parseInt("10", 16);
        System.out.println(i);



    }
}

class Person
{

}
