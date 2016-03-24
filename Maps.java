import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * Created by Akharu on 3/8/2016.
 */
public class Maps
{
    public static void main(String[] args) throws IOException {
        TreeMap<String, String> ph = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ph.put("gh", "12");
        String number = reader.readLine();
        for (String names : ph.keySet())
        {
            if (ph.get(names).equals(number))
                System.out.println(names + " : " + number);
        }

    }
}
