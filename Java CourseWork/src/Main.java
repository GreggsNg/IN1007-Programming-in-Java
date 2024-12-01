import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[] allNames = {"Ali", "Timothy", "Dominic", "Olivia", "Sophia"};
        String[] allStudentIDs = {"EM2629", "EM4756", "EM7215", "EM5847", "EM5063"};


        Random random = new Random();
        int numMembers = random.nextInt(3) + 4;


        ArrayList<ExpeditionMember> memberList = new ArrayList<>();
        ArrayList<Integer> usedIndices = new ArrayList<>();


        while (memberList.size() < numMembers) {
            int randomIndex = random.nextInt(allNames.length);
            if (!usedIndices.contains(randomIndex)) {
                usedIndices.add(randomIndex);


                int studentID = Integer.parseInt(allStudentIDs[randomIndex].substring(2));


                ExpeditionMember member = new ExpeditionMember(allNames[randomIndex], studentID);
                memberList.add(member);
            }
        }

        ExpeditionMember[] members = memberList.toArray(new ExpeditionMember[0]);


        if (members.length >= 3) {
            ResearchExpedition pyramidExpedition = new ResearchExpedition(members[0], members[1], members[2]);

            ResearchExpedition nileExpedition = new ResearchExpedition(
                    members[members.length - 3],
                    members[members.length - 2],
                    members[members.length - 1]
            );


            System.out.println("Pyramid Expedition Team:");
            System.out.println("Leader: " + pyramidExpedition.getExpeditionLeader().getExpMember());
            System.out.println("Archivist: " + pyramidExpedition.getArchivist().getExpMember());
            System.out.println("Researcher: " + pyramidExpedition.getFieldResearcher().getExpMember());

            System.out.println("\nNile Expedition Team:");
            System.out.println("Leader: " + nileExpedition.getExpeditionLeader().getExpMember());
            System.out.println("Archivist: " + nileExpedition.getArchivist().getExpMember());
            System.out.println("Researcher: " + nileExpedition.getFieldResearcher().getExpMember());
        }


        System.out.println("\nChecking Member Count...");
        if (ExpeditionMember.member_counter == members.length) {
            System.out.println("Everything is good! The counter matches the number of members.");
        } else {
            System.out.println("Oops! Something is wrong. The counter doesn't match the number of members.");
        }
    }
}












