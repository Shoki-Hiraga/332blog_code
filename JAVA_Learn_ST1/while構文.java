public class while構文 {
	public static void main(String[] args) {
		System.out.println("1:【検査億】　2:【登録】　3:【削除】　4:【変更】");
		int selected = new java.util.Scanner(System.in) .nextInt();

	        while (selected > 4 || selected == 0){
    		    System.out.println("システムエラーです");
	    	    System.out.println("1~4の数字を入力してください");
		        selected = new java.util.Scanner(System.in) .nextInt();
	        }
	        
            switch (selected){
            case 1:
                System.out.println("検索します");
                break;
            case 2:
                System.out.println("登録します");
                break;
            case 3:
                System.out.println("削除します");
                break;
            case 4:
                System.out.println("変更します");
                break;

            }
		
	}
}
