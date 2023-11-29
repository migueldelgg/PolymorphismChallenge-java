package entities;

public abstract class Leason {
    private String title;

    public Leason() {

    }
    public Leason(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public abstract Integer duration();
}
