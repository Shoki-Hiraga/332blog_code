public class Matango {
    //フィールド値をセット
    int hp;
    final int level = 10;
    char suffix;

    
    public Matango(int hp, char suffix) {
    this.hp = hp;
    this.suffix = suffix;
        }
    
    //メソッドを宣言    
    public void run() {
    System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
    public void attack(int atk) {
    this.hp -= atk;
    System.out.println("お化けキノコ" + this.suffix + "の攻撃");
    System.out.println("お化けキノコ" + this.suffix + "は" + atk + "のダメージを与えた");
    }
    
}