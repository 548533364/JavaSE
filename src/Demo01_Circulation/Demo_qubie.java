package Demo01_Circulation;

/**
 * 三种循环的区别
 * 1、如果条件从来没有满足过，【for】和【while】会被执行0次，【do-while】会被执行至少一次
 *2、 for循环的变量在小括号的定义，只有循环内部才能使用
 */
public class Demo_qubie {
    public static void main ( String[] args ) {
        for (int i=1;i<=0;i++){
            System.out.println ("HELLO" );
        }
        System.out.println ( "#################");
        int i = 1;
        do {
            System.out.println ("HELLO" );
            i++;
        }while (i<=0);
    }
}
