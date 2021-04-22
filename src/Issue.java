/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isak.ahlberg
 */
public class Issue {
    private String name;
    private String description;
    private String type;
    private int priorityLevel;
    private boolean fixed;
    public Issue(String name, String description, String type){
        this.name = name;
        this.description = description;
        this.type = type;
    }
    public void setFixed(boolean fixed){
        this.fixed = fixed;
    }
    public boolean getFixed(){
        return this.fixed;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setPriorityLever(int priorityLevel){
        this.priorityLevel = priorityLevel;
    }
    public int getPriorityLevel(){
        return this.priorityLevel;
    }
    @Override
    public String toString(){
        String returnString = "Name: " + this.name +"\nDescription: "+ this.description + "\n Type: " + this.type + "\n Fixed: " + this.fixed + "\nPriority: " + this.priorityLevel;
        return returnString;
    }
}
