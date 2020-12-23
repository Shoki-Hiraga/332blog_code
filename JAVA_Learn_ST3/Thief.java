public class Thief {
    String name;
    int hp;
    int mp;


    public Thief(String name) {
    this.name = name;
    this.hp = 40;
    this.mp = 5;
    }
    
    public Thief(String name, int hp) {
    this(name);
    this.hp = hp;
    this.mp = 5;
    }
    
    public Thief(String name, int hp, int mp) {
        this(name);
        this.hp = hp;
        this.mp = mp;
    }
 
 
    public void TEST() {
        System.out.println(this.name);
        System.out.println(this.hp);
        System.out.println(this.mp);
    }
    
}

