package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers<6) countPlayers++;
    }

    public void run(){
        switch (stamina){
            case (1):
                stamina--;
                countPlayers--;
                break;
            case(0):
                break;
            default:
                stamina--;
                break;
        }
    }

    public static void info(){
        switch (countPlayers){
            case 5:
                System.out.println("На поле еще есть "+(6-countPlayers)+" свободное место");
                break;
            case 4:
            case 3:
            case 2:
                System.out.println("На поле еще есть "+(6-countPlayers)+"свободных места");
                break;
            case 1:
                System.out.println("На поле еще есть "+(6-countPlayers)+"свободных мест");
                break;
            default:
                System.out.println("На поле нет свободных мест");
                break;
        }
    }
}
