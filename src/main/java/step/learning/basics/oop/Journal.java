package step.learning.basics.oop;

public class Journal extends Literature implements Copyable, Periodic, Printable, Multiple, Hologram {
    public Journal(String title, int number, int count) {
        this.count = count;
        this.setNumber(number);
        super.setTitle(title);
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        this.Number = number;
    }

    private int Number;
    private int count;


    @Override
    public String GetCard() {
        return String.format(
                "Journal '%s' №%s",
                super.getTitle(),
                this.getNumber()
        );
    }

    @Override
    public String GetPeriod() {
        return "daily";
    }

    @Override
    public int GetCount() {
        return count;
    }
}
