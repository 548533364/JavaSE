package Demo01_Circulation;

public class Demo_dowhile {
    /**
     * 标准格式
     * do{
     *     循环体；
     * }while（条件判断）；
     *
     *
     * 扩展格式
     * do{
     *     循环体；
     *     步进语句；
     * }while()；
     */
    public static void main ( String[] args ) {
        for (int i= 1; i<=10; i++){
            System.out.println ("我原谅你了" );
        }
        System.out.println ("###########" );

        int i = 1;//初始化语句
        do {
            System.out.println ("我原谅你了"+i );
            i++;
        }while (i<=10);

    }
}
