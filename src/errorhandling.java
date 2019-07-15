public class errorhandling {
    public static void main(String[] args) {
        try {
            Integer x,y,jibu;
            x=10;
            y=0;
            jibu=x/y;
            System.out.println(jibu);
        }catch (Exception e){
            System.out.println("ERROR"+e);
        }
    }
}
