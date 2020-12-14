package Demo01_Circulation;

/**
 * 关于循环的选择，
 *      次数确定的循环用for，否则多用while
 */
public class Demo_Break {
    public static void main ( String[] args ) {
        for (int i = 1; i <=10 ; i++) {
            //如果希望从4开始，后续不要了，打断循环
            if (i==4){
                break;
            }
            System.out.println ("Hello"+i );
        }
    }
}
