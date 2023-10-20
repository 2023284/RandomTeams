/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomteams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author user
 */
public class RandomTeams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<People> person = new ArrayList<>();
        Set<People> usedPerson = new HashSet<>();
      try (BufferedReader br = new BufferedReader(new FileReader("MOCK_DATA.csv"))) {
             String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                 int id = Integer.parseInt(parts[0]);
                String firstName = parts[1].trim();
                String lastName = parts[2].trim();
                String email = parts[3].trim();
                People people = new People(id, firstName, lastName, email);

                if (!usedPerson.contains(people)) {
                    person.add(people);
                    usedPerson.add(people);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.shuffle(person);}
    
}
