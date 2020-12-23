public class MainThief {
    public static void main(String[] args) {
        int baseHp = 25;
        
        Thief t = new Thief("アサカ", baseHp);
        System.out.println(baseHp + " : " + t.hp);//25 : 25
        heal(baseHp);
        heal(t);
        System.out.println(baseHp + " : " + t.hp);
    }
    

    public static void heal(int hp) {
        hp += 10;
    }
    
    public static void heal(Thief thief) {
        thief.hp += 10;
    }

/*
        Thief thief1 = new Thief("アサカ", 40, 5);
        Thief thief2 = new Thief("アサカ", 35);
        Thief thief3 = new Thief("アサカ");
        
        //System.out.println(this.hp);
        
        thief1.TEST();
        thief2.TEST();
        thief3.TEST();
*/

}