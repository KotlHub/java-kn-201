package step.learning.basics.oop;

public abstract class Literature {
    public String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract String GetCard();
}
