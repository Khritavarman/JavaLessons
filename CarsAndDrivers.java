import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Akharu on 3/7/2016.
 */
public class CarsAndDrivers
{
    public static void main(String[] args) throws IOException {
        Map<String, String> carsAndDrivers = new HashMap<String, String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            System.out.println("Type a car number you want to find: ");
            String command = reader.readLine().trim();
            String carOwner = carsAndDrivers.get(command);

            if (carOwner != null)
                System.out.println(command + " : " + carsAndDrivers.get(command));
            else
            {
                System.out.println("There is no such number in the list. Type \"yes\" if you want to add it: ");
                String answer = reader.readLine().toLowerCase().trim();
                if (answer.equals("yes"))
                {
                    System.out.println("Please, type name of an owner of a car: ");
                    String newCarOwner = reader.readLine();
                    if (!newCarOwner.isEmpty())
                        carsAndDrivers.put(command, newCarOwner);
                    else
                        System.out.println("Unfortunately, you've made a mistake");
                }
            }
        }
    }
}
