import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Akharu on 3/24/2016.
 */
public class lk
{
    public static void main(String[] args) throws IOException {
        ArrayList<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("4546");
        phoneNumbers.add("4");
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        String s = "hjk";
        phoneBook.put("Avo", phoneNumbers);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String str = reader.readLine();
            if (str.equals("LIST"))
            {
                for (String contact : phoneBook.keySet())
                    System.out.println(contact + " : " + phoneBook.get(contact));
            }
            else if (str.matches("[0-9()+]+"))
            {
                for (Map.Entry<String, ArrayList<String>> pair : phoneBook.entrySet())
                {
                    for (String string : pair.getValue())
                    {
                        if (string.equals(str))
                        {
                            System.out.println(pair.getKey() + " : " + string);
                        }

                        else
                        {
                            System.out.println("Type a contact name: ");
                            String contacName = reader.readLine();
                            if (phoneBook.containsKey(contacName))
                            {
                                System.out.println("Contact with this name already exists. Are you sure, you want to overwrite it? ");
                                String answer = reader.readLine().toLowerCase().trim();
                                if (answer.equals("yes"))
                                {
                                    ArrayList<String> list = new ArrayList<>();
                                    list.add(str);
                                    phoneBook.put(contacName, list);
                                    System.out.println("Contact saved");
                                }
                            }
                        }

                    }
                }
            }
            else
            {
                if (phoneBook.get(str) != null)
                    System.out.println(str + " : " + phoneBook.get(str).get(0));

                else
                {
                    System.out.println("Type a phone number: ");
                    String phoneNumber = reader.readLine();
                    ArrayList<String> list = new ArrayList<>();
                    list.add(phoneNumber);
                    phoneBook.put(str, list);
                    System.out.println("Contact saved");

                }
            }

        }
    }
}
