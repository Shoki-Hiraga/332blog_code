public class Main {
    public static void main(String[] args) {
    Matango2 m = new Matango2('A');
    PoisonMatango pm = new PoisonMatango('P');
    
    Hero h = new Hero();
/*

    SuperHero sh = new SuperHero();
    Matango m = new Matango(50, 'A');
    
    Weapon w1 = new Weapon();   

    System.out.println(w1.name);//Item.javaのコンストラクタを継承している
    System.out.println(w1.price);//Item.javaのコンストラクタを継承している
    System.out.println("Matang " + m.suffix);
    h.run();
    sh.fly();
    System.out.println("------------親メソッドと子メソッドでオーバライド------------");
    sh.run();
    System.out.println("------------ここまで------------");
    h.slip();

    sh.slip();
 */
 
    System.out.println(m.suffix);
    m.attack(h);
    pm.attack(h);
    

//    System.out.println(pm.suffixP);    
    }
}