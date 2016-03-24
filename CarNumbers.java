/*import java.util.ArrayList;

*/

import java.util.ArrayList;

/**
 * Created by Akharu on 3/7/2016.
 */
public class CarNumbers
{
    public static void main(String[] args)
    {
        ArrayList<String> list = getMumbersList();
        for (int i = 0; i < list.size(); i++)
            System.out.println(i + " + " + list.get(i));


    }

    public static ArrayList<String> getMumbersList()
    {
        ArrayList<String> specialCarNumbers = new ArrayList<String>();
        char[] letters = {'a', 'b', 'c', 'e', 'h', 'k', 'm', 'o', 'p', 't', 'y', 'x'};
        String[] digits = {"000", "111", "222", "333", "444", "555", "666", "777", "888", "999"};

        for (int i = 0; i < digits.length; i++)
        {
            for (int a = 0; a < letters.length; a++)
            {
                for (int b = 0; b < letters.length; b++)
                {
                    for (int j = 0; j < letters.length; j++)
                    {
                        for (int k = 1; k <= 99; k++)
                        {
                            String number = letters[j] + digits[i] + letters[a] + letters[b];
                            number = k < 10 ? number + ("0" + k) : number + k;
                            specialCarNumbers.add(number);
                        }
                    }
                }
            }
        }
        return specialCarNumbers;
    }
}