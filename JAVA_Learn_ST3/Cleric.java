public class Cleric {

    //フィールド値をセット
    String name;
    int HP;
    int MP;
    final int MaxHP = 50;
    final int MaxMP = 10;
    
    public void selfAid() {
        System.out.println("セルフエイド発動！");
        this.MP = -5;
        this.HP = HP;
        System.out.println("MP" + this.MP + "を消費して、HP" + this.HP + "を回復した");
        System.out.println("MPは" + (MP + MaxMP) + "で" + "HPは" + MaxHP + "になった");
    }
    
    public int pray(int hope) {

        int MPrecover = new java.util.Random() .nextInt(2);
        System.out.println(this.name + "は" + hope + "秒" + "祈った");

        int totalMPrecover = MPrecover + hope;
        System.out.println(this.name + "は、" + totalMPrecover + "のMPを回復した");
        return totalMPrecover;
    }
    
}