public class PoisonMatango extends Matango2 {
int poison = 5;
//char suffixP;

//    public PoisonMatango(char suffixP) {
//        super(Matango2);
    public PoisonMatango(char suffix) {
        super(suffix);
    }
    

    public void attack(Hero h) {
        super.attack(h);
        
            if (poison > 0 && poison <= 5) {
                System.out.println("さらに毒の胞子をばらまいた");
//                poison -= 1;
                poison --;
                int poisonDamage = h.hp / 5;
                h.hp -= poisonDamage;
                System.out.println(poisonDamage + "ポイントのダメージ");
                System.out.println(h.name + "のHPは" + h.hp + "残っている");                
            }
    }
//*/

}