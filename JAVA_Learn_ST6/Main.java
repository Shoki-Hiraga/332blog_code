public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("ミナト", 100);
        Matango m = new Matango(50, 'A');
        King k = new King();
        Inn in = new Inn();
        Wizard wi = new Wizard();
        
//===================重要========================
        Wand wa = new Wand();
        // wi.wand = wa; //プライベートアクセスのため、アクセス不可能
// ここが未解決
//===================重要========================
        wa.setPower(10.0);
        

        h.sleep();
        in.talkIn(h);
        in.checkIn(h);
        System.out.println("");
/*
        k.talk(h);
        h.attack(m);
        System.out.println("");
*/


        wi.heal(h);

    }
}