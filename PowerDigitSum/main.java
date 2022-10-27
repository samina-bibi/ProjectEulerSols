import java.math.BigInteger;

public class main {
    public static void main(String[] args) {
        int power = 1000;
        int sum = 0;

        // Getting the result of raising the power
        BigInteger r = new BigInteger("2").pow(power);

        // Converting to string, so that the digits can be split more easily
        String result = String.valueOf(r);
        String[] digits = result.split("");
        for (String digit : digits) {
            sum = sum + Integer.parseInt(digit);
        }
        System.out.println(r);
        System.out.println(sum);
    }
}