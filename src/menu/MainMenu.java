package menu;

import java.util.Scanner;

public class MainMenu extends AbstractMenu {

    public MainMenu(String title) {
        super(title);
    }

    @Override
    public void showMenu() {
        System.out.println("1. Add player\n" +
                           "2. Edit player\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                AddPlayerMenu addplayer = new AddPlayerMenu("add player");
                addplayer.showMenu();
                break;
            case 2:
                EditPlayerMenu editplayer = new EditPlayerMenu("add player");
                editplayer.showMenu();
                break;
        }
    }
}
