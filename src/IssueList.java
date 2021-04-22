/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isak.ahlberg
 */
import java.util.ArrayList;
import java.util.Objects;
public class IssueList {
    private ArrayList<Issue> issues = new ArrayList();
    public IssueList(){
        
    }
    public void addIssue(Issue issue){
        this.issues.add(issue);
    }
    public ArrayList getIssues(){
        return this.issues;
    }
    public int getTotalIssues(){
        return this.issues.size();
    }
    public void sortByPriority(){
        quickSort(this.issues);
    }
    public int search(String name){
        return searchName(issues, name);
    }
    
    
    private ArrayList<Issue> quickSort(ArrayList<Issue> input){
       if(input.size() <= 1){
           return input;
       }
       int middle = (int) Math.ceil((double)input.size() / 2);
       Issue pivot = input.get(middle);
       
       ArrayList<Issue> less = new ArrayList<>();
       ArrayList<Issue> greater = new ArrayList<>();
       
        for (int i = 0; i < input.size(); i++) {
            if(input.get(i).getPriorityLevel() <= pivot.getPriorityLevel()){
                if(i == middle){
                    continue;
                }
                less.add(input.get(i));
            }
            else{
                greater.add(input.get(i));
            }
        }
        return concatenate(quickSort(less), pivot, quickSort(greater));
    }
    private int searchName(ArrayList<Issue> list, String value){
        for (int i = 0; i < list.size(); i++) {
            if(Objects.equals(Integer.valueOf(value), Integer.valueOf(list.get(i).getName()))){
                return i;
            }
        }
        return -1;
    }
    private ArrayList<Issue> concatenate(ArrayList<Issue> less, Issue pivot, ArrayList<Issue> greater){
        ArrayList<Issue> list = new ArrayList<>();
        
        for (int i = 0; i < less.size(); i++) {
            list.add(less.get(i));
        }
        list.add(pivot);
        for (int i = 0; i < greater.size(); i++) {
            list.add(greater.get(i));
        }
        return list;
    }
}
