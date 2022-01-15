package menu;

public abstract class AbstractMenu {

    private String title;

    public AbstractMenu(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void showMenu();

}
