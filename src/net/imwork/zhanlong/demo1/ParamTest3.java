package net.imwork.zhanlong.demo1;

/**
 * @author Administrator
 */
public class ParamTest3
{
    public void change(Person person, Person person2)
    {
        person.name = "lisi";
        person2.name = "wangwu";
    }

    public static void main(String[] args)
    {
        ParamTest3 paramTest3 = new ParamTest3();

        Person person = new Person();

        person.name = "zhangsan";

//        Person person2 = person;
        Person person2 = new Person();

        paramTest3.change(person, person2);

        System.out.println(person.name);


    }
}

class Person
{
    String name;
}
