//Project and Team Members

package OOPs;

class TeamMember {
    private String name;
    private String role;

    public TeamMember(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void displayInfo() {
        System.out.println("Team Member Name: "+name);
        System.out.println("Role: "+role);
    }
}

class Project {
    private String title;
    private TeamMember member1; //Project has-a TeamMember (Aggregation)
    private TeamMember member2; //Project has-a TeamMember (Aggregation)

    public Project(String title, TeamMember member1, TeamMember member2) {
        this.title = title;
        this.member1 = member1;
        this.member2 = member2;
    }

    public void projectInfo() {
        System.out.println("Project: "+title);
        System.out.println();
        System.out.println("Team Members in Project:");
        
        if(member1 != null) {
            member1.displayInfo();
            System.out.println();
        }

        if(member2 != null) {
            member2.displayInfo();
            System.out.println();
        }
    }
}

public class AggregationExampleTwo {
    public static void main(String[] args) {
        TeamMember m1 = new TeamMember("Ritik Raj", "Developer");
        TeamMember m2 = new TeamMember("Bunty Singh", "Designer");

        Project project = new Project("Website Redesign", m1, m2);
        
        project.projectInfo();
    }
}
