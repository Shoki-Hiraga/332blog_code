public class Main {
    public static void main(String[] args) {

        //フィールド定義
        Cleric A = new Cleric();
        A.name = "聖職者";
        A.HP = 50;
        A.MP = 10;
        //メソッド
        A.selfAid();
        System.out.println("祈りを発動！");
        System.out.println("何秒祈るか入力する...");
        A.pray(new java.util.Scanner(System.in) .nextInt());
    }
}