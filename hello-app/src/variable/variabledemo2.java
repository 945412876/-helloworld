package variable;

public class variabledemo2 {
    public static void main(String[] args) {


        // 目标 理解变量使用的注意事项
        // 1变量使用要先声明
        int a = 23;
        System.out.println(a);
        //2变量声明之后，不能再存储其他类型的数据
        // 比如上面 a=1.5 就会报错
        // 3变量的有效范围是从定义开始到}截止 。且在同一个范围内部不能定义两个同名的变量
        {
            int b = 2;

            System.out.println(b);

        }
        //b.sout在外面就会失效
        System.out.println(a);
        //4但a不会失效，但是不能在外面重新定义a，不然就会报错
        //5不可以 int c= （定义）但是 可以 c=（赋值）
        //6定义变量可以没有初始值，但是要输出必须要有初始值

    }
}