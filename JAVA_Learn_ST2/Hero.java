public class Hero {
//インスタンスフィールドを宣言
public String name;
public int hp;
public Sword sword;//SwordクラスをHeroフィールドに宣言した


    //コンストラクタを宣言
    public Hero(String name, int hp) {
    this.name = name;
    this.hp = hp;
    this.sword = sword;
    //または引数無しで、
    this.hp = 100;
    //と宣言して、hpを固定する方法もある。
    }
    


    //インスタンスメソッドを宣言
    public void attack() {
        System.out.println(this.name + "は" + sword.name + "で攻撃した");
        System.out.println("敵に5ポイントのダメージを与えた！");
        
    }
    
    public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した");
    }
    
    public void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
    System.out.println("HPが" + sec + "ポイント回復した");
    }
    
    public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージ");
    }
    
    public void run() {
    System.out.println(this.name + "は、逃げ出した”");
    System.out.println("ゲームオーバー");
    System.out.println("最終HPは" + this.hp + "でした");
    }

}

/*
    //フィールド
    String name;
    int hp;
    
    public void attack() {}

//sleepメソッド
    public void sleep () {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
    }
//sitメソッド
    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }
//slipメソッド
    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ");
        System.out.println("5のダメージ！");
    }

//runメソッド
    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GameOver");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}
*/
