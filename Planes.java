import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Akharu on 3/7/2016.
 */
public class Planes
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> planesList = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            String command = reader.readLine();

            if (command.equals("exitAll"))
                exitAll(planesList);

            else if (command.equals("exitLast"))
                exitLast(planesList);

            else if (planesList.size() < 5)
            {
                if (!command.isEmpty())
                    planesList.add(command);
            }
            else
                System.out.println("There is no place");
        }
    }
    //Функция выводит названия самолетов в обратном порядке и очищает список, если он не пустой
    public static ArrayList<String> exitAll (ArrayList<String> list)
    {
        if (!list.isEmpty())
        {
            for (int i = list.size()-1; i >= 0; i--)
            {
                System.out.println("Plane " + list.get(i) + " took off");
                list.remove(i);
            }
        }
        else
        {
            System.out.println("There is no planes to take off");
        }
        return list;
    }

    //Функция выводит на экран и удаляет последний самолет в списке
    public static ArrayList<String> exitLast (ArrayList<String> list)
    {
        if (!list.isEmpty())
        {
            int i = list.size() - 1;
            System.out.println("Plane " + list.get(i) + " took off");
            list.remove(i);
        }
        else
        {
            System.out.println("There is no planes to take off");
        }
        return list;
    }
}
