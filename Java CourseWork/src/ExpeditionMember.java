public class ExpeditionMember {
    private String memName;
    private int studentID;


    public static int member_counter = 0;

    public ExpeditionMember(String MemName, int studentID) {
        setMemName(MemName);
        setStudentID(studentID);
        member_counter++;
    }

    public String getExpMember() {
        return memName;
    }

    public void setMemName(String name) {
        this.memName = name;
    }

    public int getStudentID(){
        return studentID;
    }

    public void setStudentID(int studentID) {
        if (studentID < 0) {
            System.out.println("Invalid Student ID: It cannot be less than 0.");
            return;
        }
        this.studentID = studentID;
    }
}
