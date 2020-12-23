public class Main {
    public static void main(String[] args){
    Sword s = new Sword();//Swordインスタンスを生成
    s.name = "炎の剣";//Swordフィールドに代入
    s.damage = 10;//Swordフィールドに代入

    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    h.sword = s;
    
    Hero h2 = new Hero();
    h2.name = "アサカ";
    h2.hp = 100;


    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;
   
    Matango m1 = new Matango();
    m1.hp = 100;
    m1.suffix = 'A';
    
    Matango m2 = new Matango();
    m2.hp =80;
    m2.suffix = 'B';
    
    
    h.slip();
    h.sit(5);
    m1.run();
    m2.attack(10);
    h.sit(20);
    h.run();
    h.attack();
    h.sword = s;//Heroインスタンスhのswordはs 。    
    System.out.println("ミナトの剣は" + h.sword.name);//Heroインスタンスhのswordの名前
    w.heal(h);
    w.heal(h2);

    }
}
/*P321のコード
    //1.勇者を生成
    Hero h = new Hero();
    //2.フィールド(情報保持)に初期値をセット
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました！");
    
    //h.sit(new java.util.Scanner(System.in) .nextInt());
    h.sit(5);
    h.slip();//転べ
    h.sit(25);//25秒座れ
    h.run();//逃げろ
*/
