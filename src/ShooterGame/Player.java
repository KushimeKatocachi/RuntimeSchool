package ShooterGame;

public class Player {
    private Weapon[] weaponsSlots;

    public Player() {
        weaponsSlots = new Weapon[]{
                new sllingShot(),
                new RPG(),
                new Gun(),
                new automatic(),
                new waterGun(),

        };
    }

    public int getSlotsCount() {

        return weaponsSlots.length;
    }

    public void showWithWeapon(int slot) {

        for (int i = 0; i < weaponsSlots.length; i ++) {
            if (slot >= weaponsSlots.length) {
                System.out.println("Выбран недопустимый слот оружия.");
                return;
            } else getSlotsCount();

        }
        Weapon weapon = weaponsSlots[slot];
        weapon.shot();
    }
}