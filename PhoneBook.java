import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by Akharu on 3/8/2016.
/*
 *//*

public class PhoneBook
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> phoneNumbers = new ArrayList<>();
        HashMap<String, ArrayList> phoneBook = new HashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        while (true)
        {
            String str = reader.readLine();
            if (str.matches("[0-9()+]"))
            {
                searchByNumber(phoneBook, reader);
            }
            else
            {
                searchByName(phoneBook, reader);
            }


*/



            /*System.out.println("Choose what to do: \n1. Type \"1\" to search by contact number \n2. Type \"2\" to search by contact name" +
                                                    "\n3. Type \"LIST\" to see phone book");
            String command = reader.readLine();

            if (command.equals("1")) {
                searchByNumber(phoneBook);
            } else if (command.equals("2")) {
                searchByName(phoneBook);
            } else if (command.equals("LIST")) {
                for (String phoneNumber : phoneBook.keySet())
                    System.out.println(phoneBook.get(phoneNumber) + " : " + phoneNumber);
            } else {
                System.out.println("Incorrect command");
            }*/
        //}
    //}

/*    public static HashMap<String, String> searchByNumber (HashMap<String, ArrayList> map, BufferedReader reader) throws IOException
    {
        String contactNumber = reader.readLine().trim();
        if (map.get(contactNumber) != null)
            System.out.println(map.get(contactNumber) + " : " + contactNumber);
        else
        {
            System.out.println("There is no such contact in you phoneBook. Please, type a contact's name");
            String contactName = reader.readLine().trim();
            map.put(contactNumber, contactName);
            System.out.println("Contact \"" + contactName + "\" with phone number " + contactNumber + " was added to yor phone book");
        }
        return map;
    }

    public static HashMap<String, String> searchByName(HashMap<String, ArrayList> map, BufferedReader reader) throws IOException
    {
        String contactName = reader.readLine().trim();
        if (map.containsValue(contactName))
        {
            for (String contactNumber : map.keySet())
            {
                if (map.get(contactNumber).equals(contactName))
                {
                    System.out.println(map.get(contactNumber) + " : " + contactNumber);
                }
            }
        }
        else
        {
            System.out.println("There is no such contact in you phoneBook. Please, type a phone number of these contact");
            String contactNumber = reader.readLine().trim();
            map.put(contactNumber, contactName);
            System.out.println("Contact \"" + contactName + "\" with phone number " + contactNumber + " was added to yor phone book");
        }
        return map;
    }*/
//}
