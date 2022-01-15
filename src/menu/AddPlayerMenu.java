package menu;

public class AddPlayerMenu extends AbstractMenu implements CloseableMenu {

    public AddPlayerMenu(String title) {
        super(title);
    }

    @Override
    public void showMenu() {
        System.out.println("Nama player: ");
        System.out.println("Score player: ");

        if (choice == 0) {
            this.close();
        }
    }

    @Override
    public void close() {
        System.exit(0);
    }

}
