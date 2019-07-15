public class userdefinedmethodstwo {
    public static void main(String[] args) {
        avg(12.0,23.8,453.45);
        interest(1000.00,5.00,7.0);
    }
    public static void avg( Double x,Double y,Double z) {
        Double jibu = (x + y + z)/3.0;
        System.out.println("your averange is"+jibu);

    }

    public static void interest(Double p,Double r, Double t ) {
        Double interest =p * r * t /100.0;
        System.out.println("your interest is is " +interest);
    }

}
