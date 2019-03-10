package pl.sda.readAirportJson;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.airlines.Airlines;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author nieckarz
 */
public class readAirportJson {
    static ObjectMapper mapper = new ObjectMapper();
    static List<Airlines> airLinesList = new ArrayList<>();
    static final String file = "airlines.json";


    public static void readAirlinesList(){

        try {

            Airlines[] personArray = mapper.readValue(new File(file), Airlines[].class);
            airLinesList = Arrays.asList(personArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(airLinesList.toString());
    }


    public static void main(String[] args) {
        readAirlinesList();
    }
}
