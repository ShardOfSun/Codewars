
public class Main {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = "";
        while (Math.min(fighter1.health, fighter2.health) > 0){
            winner = firstAttacker;
            if (firstAttacker.equals(fighter1.name)){
                fighter2.health -= fighter1.damagePerAttack;
                firstAttacker = fighter2.name;
            }
            else if (firstAttacker.equals(fighter2.name)){
                fighter1.health -= fighter2.damagePerAttack;
                firstAttacker = fighter1.name;
            }
        }
        return winner;
    }
    public static void main(String[] args) {
        System.out.println(declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));

    }
}