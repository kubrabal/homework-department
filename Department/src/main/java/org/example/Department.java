package org.example;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private TeamLead teamLead;
    private List<Person> personnelList;
    private List<Task> assignmentList;

    public Department(TeamLead teamLead) {
        this.teamLead = teamLead;
        this.personnelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    public TeamLead getTeamLead() {
        return teamLead;
    }

    public List<Person> getPersonnelList() {
        return personnelList;
    }

    public List<Task> getAssignmentList() {
        return assignmentList;
    }

    public void setTeamLead(TeamLead teamLead) {
        this.teamLead = teamLead;
    }

    public void addPersonnel(Person person) {
        personnelList.add(person);
    }

    public void removePersonnel(Person person) {
        personnelList.remove(person);
    }
    public void changePersonnel(Person oldPerson, Person newPerson) {
        int index = personnelList.indexOf(oldPerson);
        if (index != -1) {
            personnelList.set(index, newPerson);
        }
    }

    public void addTask(Task task) {
        assignmentList.add(task);
    }

    public void markTaskAsCompleted(Task task) {
        task.markAsCompleted();
    }
}
