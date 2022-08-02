package variable;

public class variabledemo3
{
    public static void main(String[] args) {
        // 目标：掌握使用基本数据类型定义不同的变量
        //1. byte字节型 占用一个字节-128-127
        byte number =98;
        System.out.println(number);
        // byte number2 =128就会报错
        //2 .short短整型 占用两个字节 （三万多）
        //3 .int 整型 默认的类型 占4个字节 一般都用int）
        //4 long 长整型 占用8个字节
        long lg=11241244l;
        System.out.println(lg);
        //随便写一个正数字面量 就会被当作int类型
        //如果希望随便写的一个数据当作long类型来看，要在数字后面加一个l 或者L (大小写都行


        // 5浮点类型（小数）
        //float 是单精度占4个字节
         float as=123.3f;
        System.out.println(as);
        //随便写一个小数的话默认是double类型，如果希望随便写一个是float类型的话要在后面加上    F/f
        //doubled代表双精度占用8个字节
        //6. 字符类型 char
        char aq='a' ;
        System.out.println(aq);
        //7. 布尔类型 ，bo'o'lean
        boolean rs=true;
                boolean re2= false;
        System.out.println(rs);
        System.out.println(re2);

        String name  ="西门吹雪";
        System.out.println(name);
        //  )
    }
}
