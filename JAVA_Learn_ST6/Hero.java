public class Hero {
private int hp;
// public int hp;
// public String name;
private String name;

    public Hero(String name, int hp) {
    this.name = name;
    this.hp = hp;
    }


    public void bye() {
        System.out.println("勇者は別れを告げた");
    }
    
    private void die() {
        System.out.println(this.name + "は死んでしまった！");
        System.out.println("GameOver");
    }
    
    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した！");
    }
    
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("敵に5ポイントのダメージを与えた！");
        
        System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
        this.hp -= 2;
        
            if (this.hp <= 0) {
                this.die();
            }
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setHp(int setHp) {
        this.hp = setHp;
    }
    
    public int getHp() {
        return this.hp;        
    }
    
}