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

    public IssueList() {

    }

    public void addIssue(Issue issue) {
        this.issues.add(issue);
    }

    public ArrayList getIssues() {
        return this.issues;
    }

    public Issue get(int i) {
        return this.issues.get(i);
    }
    public void remove(int i){
        this.issues.remove(i);
    }
    public int getTotalIssues() {
        return this.issues.size();
    }

    public void sortByPriorityHighLow() {
        int n = this.issues.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (this.issues.get(j).getPriorityLevel() < this.issues.get(j + 1).getPriorityLevel()) {
                    Issue temp = this.issues.get(j);
                    this.issues.set(j, this.issues.get(j + 1));
                    this.issues.set(j + 1, temp);
                }
            }
        }
    }

    public void sortByPriorityLowHigh() {
        int n = this.issues.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (this.issues.get(j).getPriorityLevel() > this.issues.get(j + 1).getPriorityLevel()) {
                    Issue temp = this.issues.get(j);
                    this.issues.set(j, this.issues.get(j + 1));
                    this.issues.set(j + 1, temp);
                }
            }
        }
    }

    public void sortByNameHighLow() {
        int n = this.issues.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (this.issues.get(j).getID().compareToIgnoreCase(this.issues.get(j + 1).getID()) < 0) {
                    Issue temp = this.issues.get(j);
                    this.issues.set(j, this.issues.get(j + 1));
                    this.issues.set(j + 1, temp);
                }
            }
        }
    }
    
    public void sortByNameLowHigh() {
        int n = this.issues.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (this.issues.get(j).getID().compareToIgnoreCase(this.issues.get(j + 1).getID()) > 0) {
                    Issue temp = this.issues.get(j);
                    this.issues.set(j, this.issues.get(j + 1));
                    this.issues.set(j + 1, temp);
                }
            }
        }
    }

    public int search(String name) {
        return searchName(issues, name);
    }

    public int size() {
        return this.issues.size();
    }

    private int searchName(ArrayList<Issue> list, String value) {
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(Integer.valueOf(value), Integer.valueOf(list.get(i).getID()))) {
                return i;
            }
        }
        return -1;
    }
}
