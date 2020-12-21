public class GameCenter_5coin_6coins {
    public static void main(String[] args) {
    System.out.println("お金を入れてください(1を入力)");
    int sum = 0;

        for (int i = 1; i < 5; i++){
        int coinin = new java.util.Scanner(System.in).nextInt();
        sum += coinin;

            if (coinin == 1){
            System.out.println("クレジット" + sum);
            } else {
            System.out.println("100円を入れてください(1を入力)");
            }
        }

    int coinin = new java.util.Scanner(System.in).nextInt();
    System.out.println("クレジット" + (sum + 2));    

    }
}
