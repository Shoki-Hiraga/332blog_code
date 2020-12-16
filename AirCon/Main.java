import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    
    Scanner scan = new Scanner(System.in);

    //コンストラクタで初動させる
    Control c = new Control("エアコンシステム起動", "【電源をONにする場合は1】", "【電源をOFFにする場合は2】", "【設定温度を確認する場合は3】", "を入力してください");
    Temp t = new Temp();

    int operationC = 0;
    int operate = c.choice(operationC);
        
        switch (operate) {
            case 1:
                c.PowerOn();
                t.defaultTemp();
                c.Temocontrol();
                break;
            case 2:
                c.PowerOff();    
                break;
            case 3:
                t.defaultTemp();   
                break;
        }
        
        

    }
}