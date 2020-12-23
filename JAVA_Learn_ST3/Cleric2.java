import java.util.Random;
import java.util.Scanner;

public class Cleric2 {
    public String name;
    public int HP = 50;
    public int MP = 10;
    public final int MaxHP = 50;
    public final int MaxMP = 10;
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    
    public void selfAid() {
    this.HP = this.MaxHP; //回答
    this.MP -= 5;
    System.out.println(this.name + "はセルフエイドを発動！");  
    System.out.println("MPを" + this.MP + "消費することで、" + MaxHP + "になった！");
    }
    
    public int pray(int praySec) {
        System.out.println(this.name + "は祈りを発動！" + praySec + "秒間祈った。");
        int recover = random.nextInt(2) + praySec;
        int recoverActual = Math.min(this.MaxMP - this.MP, recover);

        this.MP += recoverActual;
        if (this.MP < MaxMP) {
            System.out.println(this.name + "は" + prayRandom + praySec + "のMPを回復した！");
    
            } else if (this.MP == MaxMP) {
            System.out.println(this.name + "はのMPが満タンだ！");
            return prayRandom + praySec;
        }
    }
}    
    