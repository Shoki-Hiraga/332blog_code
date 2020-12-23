public class SuperHero extends Hero {
boolean flying;

/*    
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた！");
            if (this.flying) {
                System.out.println(this.name + "の攻撃！");
                m.hp -= 5;
                System.out.println("5ポイントのダメージを与えた！");
            }
    }
*/    
     public void attack(Matango m) {
        super.attack(m);
        if (this.flying) {
            super.attack(m);
        }
    }    
    
    public void fly() {
    this.flying = true;
    System.out.println(this.name + "は飛んだ");   
    }
    
    public void land() {
    this.flying = false;        
    System.out.println(this.name + "は着地した");
    }

//@Override
    public void run() {
    System.out.println(this.name + "は撤退した");//親メソッドからオーバーライド
    super.run();//親メソッドを参照
    }
}