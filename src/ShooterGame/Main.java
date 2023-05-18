package ShooterGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, что бы выстрелить,"
                        + " - 1 что бы выйти%n",
                player.getSlotsCount()
        );
        int slot;
        while (true) {
            slot = scanner.nextInt();
            player.showWithWeapon(slot);

        }
    }
}
