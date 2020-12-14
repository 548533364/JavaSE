package Demo02;

/**
 * 方法定义格式
 * public static void (){
 *     方法体；
 * }
 *
 *          注意事项：
 *          1、方法定义无先后
 *          2、方法定义必须是挨着的
 *          3、方法定义之后是不会运行的，如果希望执行一定要调用
 */
public class Demo_Method {
    public static void main ( String[] args ) {
        printMethod ();
    }
    public static void printMethod(){

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i <20 ; i++) {
                System.out.print ("*" );
            }
            System.out.println ( );
        }
    }
}
