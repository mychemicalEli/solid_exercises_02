package project.management;

public class Main {
    public static void main(String[] args) {
        TeamMember programmer = new Programmer();
        TeamMember qaTester = new QATester();
        ProjectManagement projectManagement = new ProjectManagement();
        try {
            System.out.println(projectManagement.process(programmer));
            System.out.println(projectManagement.process(qaTester));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}