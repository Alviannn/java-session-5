package menu;

public class EditPlayerMenu extends AbstractMenu {

    public EditPlayerMenu(String title) {
        super(title);
    }

    @Override
    public void showMenu() {
        System.out.println("Who? ");
        System.out.println("new Score: ");
    }

}
