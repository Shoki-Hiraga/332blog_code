public class Hero {
    String name = "ミナト";
    int hp = 100;
    //Hero hero;
    
    
   
    public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 10;
    System.out.println("5ポイントのダメージを与えた！");
    }
    
    
    public void run() {
    System.out.println(this.name + "は逃げ出した！");
    }
    
    public final void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は転んだ");
        System.out.println("5のダメージ");
    }
    
}