import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Akharu on 3/7/2016.
 */
public class Drugs
{
    public static void main(String[] args) throws IOException
    {
        Set<String> drugs = new HashSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            String command = reader.readLine().trim();
            if (command.equals("EXIT"))
                break;
            else if (command.equals("LIST"))
            {
                for (String drug : drugs)
                    System.out.println(drug);
            }
            else
            {
                if(!command.isEmpty())
                {
                    command = capitalize(command);
                    drugs.add(command);
                }
            }
        }
    }

    //Функция, приводящая все названия к одному виду
    public static String capitalize (String s)
    {
        s = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
        return s;
    }
}
