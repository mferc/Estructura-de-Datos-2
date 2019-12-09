
public class Principal {

    public static void main(String[] args) {
        System.out.println(mCD(180, 48));
    }

    public static int mCD(int dividendo, int divisor) {
        if (divisor == 0) {
            return dividendo;

        } else {
            int iResiduo = dividendo % divisor; //
            return mCD(divisor, iResiduo);
        }
    }

}
