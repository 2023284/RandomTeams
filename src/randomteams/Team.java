/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package randomteams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Team {
    private String name;
    private List<People> members = new ArrayList<>();
     
    @Override
    public String toString() {
        return "Team: " + name + ", Members: " + members;
    }
    
    public Team(String name) {
        this.name = name;
    }

    public void addMember(People people) {
        members.add(people);
    }

   
}
