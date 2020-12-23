public class Wizard {
public String name;
public int hp;
    public Wizard(String name, int hp) {
    this.name = name;
    this.hp = hp;    
    }
    public void heal(Hero h) {
    System.out.println(this.name + "は魔法を発動した");
    h.hp += 10;
    System.out.println(h.name + "は" + 10 + "回復した");
    }
    
}

