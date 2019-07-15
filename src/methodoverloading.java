public class methodoverloading {
    public static void main(String[] args) {
        noma("champion","boy","dj");
        noma(12.0,34.4,34.5);
        noma(12,13,34);

    }
    public static String noma(String x,String y,String z){
        String jibu=x+y+z;
        System.out.println(jibu);
        return jibu;
    }
    public static Integer noma(Integer x,Integer z,Integer y){
        Integer jibu=x+y+z;
        System.out.println(jibu);
        return jibu;
    }
    public static double noma(double x,double y,double z){
        double jibu=x+y+z;
        System.out.println(jibu);
        return jibu;
    }
}