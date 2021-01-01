public class Wizard {
private int hp;
private int mp;
private String name;
private Wand wand;
// Wand w = new Wand();



    void heal(Hero h) {
    int basePoint = 10;
    this.getWand().setPower(50.0);
    int recovPoint = (int)(basePoint * this.getWand().getPower());
    // int recovPoint = (int)(basePoint * this.wand.power);
        
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }


/*    
    void setHp(int hp) {
        this.hp = hp;
    }
    
    int getHp() {
        return this.hp;
    }
*/    

}