package step.learning;

import com.google.inject.Guice;
import com.google.inject.Injector;
import step.learning.IOC.ConfigModule;
import step.learning.IOC.IocDemo;
import step.learning.basics.BasicsDemo;
import step.learning.basics.FilesDemo;
import step.learning.basics.oop.OopDemo;
import step.learning.homework.code.Explorer;
import step.learning.homework.code.RandomString;

import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {

        Injector injector = Guice.createInjector( new ConfigModule());
        IocDemo iocDemo = injector.getInstance(IocDemo.class);
        iocDemo.run();
        //new OopDemo().run();

//        Scanner kbscaner = new Scanner(System.in);
//        System.out.print("Type min length: ");
//        int minLength = Integer.parseInt(kbscaner.next()); // Минимальная длина строки
//        System.out.print("Type min length: ");
//        int maxLength = Integer.parseInt(kbscaner.next()); // Максимальная длина строки
//        System.out.println(RandomString.generateString(minLength, maxLength));
    }
}