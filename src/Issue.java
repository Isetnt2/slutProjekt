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
    public Issue(String name, String description, String type, int priorityLevel){
        this.name = name;
        this.description = description;
        this.type = type;
        this.priorityLevel = priorityLevel;
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
        String returnString = "Name: " + this.name +" Description: "+ this.description + " Type: " + this.type + " Fixed: " + this.fixed + "Priority: " + this.priorityLevel;
        return returnString;
    }
}
