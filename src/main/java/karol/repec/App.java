package karol.repec;

import com.google.gson.Gson;

import com.google.gson.GsonBuilder;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException, ParseException {

        //read json file
        String filePath = "./src/main/java/jsonfile.json";
        InputStream inputStream = new FileInputStream(filePath);

        //json String to JSONobject
        Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");
        String jsonString = scanner.hasNext() ? scanner.next() : "";
//        System.out.println(jsonString);

        Gson gson = new Gson();
        User user = gson.fromJson(jsonString, User.class);
//        Address address = gson.fromJson(jsonString, Address.class);
//        PhoneNumber phoneNumber = gson.fromJson(jsonString, PhoneNumber.class);

        System.out.println(user.getFirstName()+ " " + user.getLastName() + " " + user.getAge() + " " + user.getAddress() + " " + user.getPhoneNumbers());

        String userJson = gson.toJson(user);
        System.out.println(userJson);


    }
}




