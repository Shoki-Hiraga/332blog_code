public class Temp {
int up;
int down;
final int defaultTempeture = 28;
Temp temp;
    
    public void defaultTemp() {
        System.out.println("ただいまの設定温度は" + defaultTempeture + "度です");        
    }
    
    public void ControlTemp(int airTemp) {
        System.out.println("設定温度を" + airTemp + "度に変更しました");
        
    }
    
}