package Demo01_Circulation;

/**
 * 嵌套循环
 */
public class Demo_Qiantao {
    public static void main ( String[] args ) {
        for (int hour = 1; hour < 24; hour++) {   //外层控制小时
            for (int minute = 0; minute <60 ; minute++) {//  内层控制分钟

                for (int min = 0; min <60 ; min++) {
                    System.out.println (hour+"点" +minute+"分"+min+"秒");
                }

            }
        }
    }
}
