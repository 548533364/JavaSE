package Demo03;
/*
打印指定次数
 */
public class Demo_MethodPrint {
    public static void main ( String[] args ) {
        printCount ( 5 );
    }
    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println ("Hello World"+(i+1) );
        }
    }
}
