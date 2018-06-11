package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String args[])
    {

        try{
            // create object mapper
            ObjectMapper mapper = new ObjectMapper();
            // read JSON file and map/convert to Java POJO :
            // data/sample-lite.json
            Student theStudent =
              mapper.readValue(new File("data/sample-full.json"), Student.class);



            // print first name and last name
            System.out.println("First Name = "  + theStudent.getFirstName());
            System.out.println("Last Name = "  + theStudent.getLastName());

            // print put address  : street and city
            Address tempAddress = theStudent.getAddress();
            System.out.println("Street = " + tempAddress.getStreet());
            System.out.println("city = " + tempAddress.getCity());

            // print out languages
            for(String tempLang : theStudent.getLanguages()) {
                System.out.println(tempLang);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
