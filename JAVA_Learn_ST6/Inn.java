public class Inn {
public String name;
private int hp;

/*
    public Inn(Hero h) {
        this.name = name;
        this.hp = hp;
    }
*/

public void talkIn(Hero h) {
        System.out.println(h.getName() + "今日はここに泊まることにした");
    }

public void checkIn(Hero h) {
        // h.setHp(100) 
        setHp(100);// InnフィールドのsetHpに100をセット
        h.setHp(h.getHp() + getHp());// Innのフィールhpにセットしたhpを、getメソッドでHeroのsetHpメソッドにセット
        
        System.out.println(h.getName() + "は宿に泊まって100回復した：現在のHP" + h.getHp());
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public int getHp() {
    return this.hp;
    }
        
}