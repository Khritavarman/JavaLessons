import java.util.Random;

/**
 * Created by Akharu on 3/4/2016.
 */
public class Passport {
    public static void main(String[] args)
    {
        Integer passports[] = new Integer[30];

        for (int i = 0; i < passports.length; i++)
            passports[i] = (int) (1000 + 8999 * Math.random());

        for (int pass : passports)
            System.out.println("Passport: " + pass);
    }
}
