public class Main2 {
    public static void main(String[] args) {
        GetSet gs = new GetSet("もののけ姫", "2020年12月28日", 1500);
        gs.field();                
        System.out.println("");

        gs.checkmovie();
        System.out.println("");
        
        
        gs.setMovie("千と千尋の神隠し");
        gs.getMovie();
        System.out.println("見る映画をこっちに変更 =>  " + gs.getMovie());
        System.out.println("");


        gs.checkmovie();
        System.out.println("");
        System.out.println("");

        gs.field();
    }
}