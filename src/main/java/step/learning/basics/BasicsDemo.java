package step.learning.basics;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BasicsDemo {
    public void run() {
        // region Types and variables
        System.out.println( "BasicsDemo" ) ;
        System.out.printf( "Interpolated '%s' value%n", "hello" ) ;
        // Змінні та типи даних
        // primitives              У Java всі цілі типи даних - знакові
        byte  b = 10;          // 8 біт (-128..+127) - 256 комбінацій
        short s = 100;         // 16  64k
        int   i = 10000;       // 32  4G
        long  l = 1000000000;  // 64
        // Цим типам наявні reference-аналоги
        Byte    rb = 10;       // boxing-обгортки для primitive-типів
        Short   rs = 1000;
        Integer ri = 10000;
        Long    rl = 100000000000L;

        float f = 1e-3f;   // 32  MeE M - мантиса: число від 1.0 до 9.(9)
        double d = 2e-7;   // 64      Е - експонента: ціле число - показник 10
        // 1e-3 = 1 x 10^(-3) = 0.001
        // 2e-7 = 2 x 10^(-7) = 0.0000002
        // 3.3e3 = 3.3 x 10^3 = 3300

        boolean bool = true;
        char c = 'A';

        String str1 = "Hello";   // String pooling - збирання однакових значень
        String str2 = "Hello";   // та використання їх для різних рядків
        String str3 = new String( "Hello" );
        if( str1 == str2 ) {     // у Java == - об'єктна рівність (рівність посилань)
            System.out.println( "str1 == str2" ) ;   // рівні оскільки pooling
        }
        else {
            System.out.println( "str1 != str2" ) ;
        }
        if( str1 == str3 ) {
            System.out.println( "str1 == str3" ) ;
        }
        else {
            System.out.println( "str1 != str3" ) ;
        }
        // для порівняння вмісту використовується .equals()
        if( str1.equals( str3 ) ) {
            System.out.println( "str1 equals str3" ) ;
        }
        else {
            System.out.println( "str1 !equals str3" ) ;
        }
        // endregion

        arrDemo();
    }

    private void arrDemo() {
        // масиви, колекції, цикли
        int[] arr1 = { 5, 4, 3, 2, 1 };
        int[] arr2 = new int[] { 5, 4, 3, 2, 1 };
        int[][] arr2d = {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print( arr1[i] + " " ) ;
        }

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d.length; j++) {
                System.out.print( arr2d[i][j] + " " );
            }
            System.out.print("\n");
        }
        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        for (Integer x : list1)
        {
            System.out.println(x + " ");
        }

        File dir = new File("./");
        if(dir.exists())
        {
            System.out.println("path exists");
            System.out.printf("Path is %s %n", dir.isDirectory() ? "directory" : "file");
            System.out.println(dir.getAbsolutePath());
        }
    }
}
