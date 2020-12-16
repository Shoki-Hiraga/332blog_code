import java.util.Scanner;

public class Control {
String cont;
String systemOn;
String on;
String off;
String check;
String sud;
Temp temp;
int temputure;
int operation;
Scanner scan = new Scanner(System.in);

    public Control(String systemOn, String on, String off, String check, String sud) {
    System.out.println(systemOn);

//・・・・を出力
        for (int i = 0; i < 5; i++) {

            try { 
                Thread.sleep(100);
                System.out.print("・");            
            } catch (InterruptedException e) {
            }

        }

            System.out.println("");
//選択肢を出力    
        try {
            Thread.sleep(500);
                System.out.println(on);
            Thread.sleep(500);
                System.out.println(off);
            Thread.sleep(500);
                System.out.println(check);
            Thread.sleep(600);
                System.out.println(sud);
        } catch (InterruptedException e) {
        }
        
    }


    public int choice(int opc) {
    operation = scan.nextInt();
    opc = operation;
            while (operation > 3 || operation == 0) {
            System.out.println("1か2か3で入力してください");
            System.out.println("【電源をONにする場合は1】");
            System.out.println("【電源をOFFにする場合は2】");
            System.out.println("【既存の設定温度を確認する場合は3】");
            System.out.println("を入力してください");
            operation = scan.nextInt();
        }
        return opc;
    }

    public void PowerOn() {
        System.out.println("エアコンを起動します。");
            for (int i = 0; i < 3; i++) {
                try {
                Thread.sleep(300);
                    System.out.print("・");
                } catch (InterruptedException e) {
                }                
            }
    
        System.out.println("");
    }
    
    public void PowerOff() {
        System.out.println("エアコンを切ります");
    }
    
    public void Temocontrol() {

        System.out.println("温度設定をする場合は1を入力");
        System.out.println("デフォルト設定値、28度のままの場合は0を入力");
        int temp = scan.nextInt();

        while (temp > 1) {
        System.out.println("入力エラーです");
        System.out.println("温度設定をする場合は1を入力");
        System.out.println("デフォルト設定値、28度のままの場合は0を入力");        
        temp = scan.nextInt();
                }
                
        if (temp == 1) {
        System.out.println("設定温度を変更します。");
        System.out.println("温度を1～30度で設定してください。");
            Temp t = new Temp();
//            int ct = scan.nextInt();
            t.ControlTemp(scan.nextInt());
            
        } else if (temp == 0) {
        System.out.println("設定温度を28度に設定しました");            
        }
        
    }
}
