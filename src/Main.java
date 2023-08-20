public class Main {
    public static void main(String[] args) {

        //create instances
        Player player = new Player("Hero", 10, "Warrior");
        Enemy enemy = new Enemy("Evil One", 8, "Dragon");
        //called methods of player and enemy
        player.attack();
        player.useSpecialAbility();
        System.out.println();
        enemy.attack();
        enemy.yell();
    }
}