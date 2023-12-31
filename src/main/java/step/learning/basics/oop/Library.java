package step.learning.basics.oop;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class Library {
    private final List<Literature> funds;

    public Library() {
        funds = new LinkedList<>();
    }

    public void add(Literature literature){
        funds.add(literature);
    }

    public void printAllCards(){
        for (Literature literature : funds){
            System.out.println(literature.GetCard());
        }
    }

    public void printCopyable(){
        for( Literature literature : funds){
            if(isCopyable( literature)){
                System.out.println(literature.GetCard());
            }
        }
    }

    public void printNonCopyable(){
        for( Literature literature : funds){
            if(!isCopyable( literature)){
                System.out.println(literature.GetCard());
            }
        }
    }

    public boolean isCopyable(Literature literature){
        return literature instanceof Copyable;
    }

    public boolean isPeriodic(Literature literature){
        return literature instanceof Periodic;
    }

    public void printPeriodic(){
        for (Literature literature : funds){
            if (isPeriodic(literature)){
                Periodic listAsPeriodic = (Periodic) literature;
                System.out.println(listAsPeriodic.GetPeriod() + " " + literature.GetCard());
            }
        }
    }

    public void printPeriodic2()
    {
        for(Literature literature: funds)
        {
            try{
                Method getPeriodMethod = literature.getClass().getDeclaredMethod("GetPeriod");
                System.out.println(getPeriodMethod.invoke(literature) + " " + literature.GetCard());
            }
            catch (Exception ignored)
            {

            }
        }
    }

    public void printNonPeriodic(){
        for (Literature literature : funds) {
            if (!isPeriodic(literature)) {
                System.out.println(literature.GetCard());
            }
        }
    }

    public void printPrintable(){
        for( Literature literature : funds){
            if(isPrintable( literature)){
                System.out.println(literature.GetCard());
            }
        }
    }

    public void printNonPrintable(){
        for( Literature literature : funds){
            if(isHologram( literature)){
                System.out.println(literature.GetCard());
            }
        }
    }

    public boolean isPrintable(Literature literature){
        return literature instanceof Printable;
    }

    public boolean isHologram(Literature literature){
        return literature instanceof Hologram;
    }

    public void printMultiple(){
        for( Literature literature : funds){
            if(isMultiple( literature)){
                System.out.println(literature.GetCard());
            }
        }
    }

    public void printNonMultiple(){
        for( Literature literature : funds){
            if(!isMultiple( literature)){
                System.out.println(literature.GetCard());
            }
        }
    }

    public boolean isMultiple(Literature literature){
        return literature instanceof Multiple;
    }
}