package org.example;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        TeamLead teamLead = new TeamLead("John", "Doe", "01/01/1980");
        TeamLead teamLead2 = new TeamLead("George", "Clooney", "01/01/1970");

        Department department = new Department(teamLead);

        System.out.println("TeamLead: " + department.getTeamLead().getFirstName() + " " + department.getTeamLead().getLastName());
        System.out.println("------------------------------------------------------------------------------");

        department.setTeamLead(teamLead2);

        System.out.println("TeamLead: " + department.getTeamLead().getFirstName() + " " + department.getTeamLead().getLastName());
        System.out.println("------------------------------------------------------------------------------");

        Male malePerson = new Male("Jack", "Smith", "05/12/2000");
        Female femalePerson = new Female("Jane", "Doe", "03/20/1985");

        department.addPersonnel(malePerson);
        department.addPersonnel(femalePerson);

        logPersonList(department);
        System.out.println("------------------------------------------------------------------------------");

        Male malePerson2 = new Male("Johnny", "Depp", "05/15/1990");
        department.changePersonnel(malePerson, malePerson2);

        logPersonList(department);
        System.out.println("------------------------------------------------------------------------------");

        department.removePersonnel(malePerson2);

        logPersonList(department);
        System.out.println("------------------------------------------------------------------------------");

        Task task1 = new Task("Task A");
        Task task2 = new Task("Task B");
        Task task3 = new Task("Task C");

        department.addTask(task1);
        department.addTask(task2);
        department.addTask(task3);

        logTaskList(department);
        System.out.println("------------------------------------------------------------------------------");

        department.markTaskAsCompleted(task1);

        logTaskList(department);
    }

    private static void logPersonList(Department department) {
        List<Person> personList = department.getPersonnelList();
        for (Person person : personList) {
            System.out.println("FirstName: " + person.getFirstName() + " - LastName: " + person.getLastName() + " - BirthDate: " + person.getBirthDate() + " - Emekliliğe son " + person.calculateRetirementAge() + " yıl.");
        }
    }

    private static void logTaskList(Department department) {
        List<Task> taskList = department.getAssignmentList();
        for (Task task : taskList) {
            System.out.println("Description: " + task.getDescription() + " - IsCompleted : " + task.isCompleted());
        }
    }


}