public class Matango2 {
int hp = 50;
char suffix;
    public Matango2(char suffix) {
        this.suffix = suffix;
    }
    
    public void attack(Hero h) {
        System.out.println("キノコ" + this.suffix + "の攻撃");
        System.out.println("10のダメージ");
        h.hp -= 10;
//        System.out.println(h.name + "は" + 10 + "のダメージを受けた！");
//        System.out.println(h.name + "のHPは" + h.hp + "残っている");

    }
}