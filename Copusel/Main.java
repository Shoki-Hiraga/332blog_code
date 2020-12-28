public class Main {
    public static void main(String[] args) {

        GetSet gs = new GetSet("鬼滅の刃", "2020年12月27日", 1100);
        gs.field();                
        System.out.println("");

        gs.checkmovie();
        System.out.println("");
        
        
        gs.setMovie("バックトゥザフューチャー");
        gs.getMovie();
        System.out.println("見る映画をこっちに変更 =>  " + gs.getMovie());
        System.out.println("");


        gs.checkmovie();
        System.out.println("");
        System.out.println("");

        gs.field();
     }
}