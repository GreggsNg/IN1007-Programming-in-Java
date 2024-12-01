public class W7_Student {

    String StudName;
    int Studid;

    public W7_Student() {
        this.StudName = " ";
        this.Studid = 0;
    }
    public int getStudentID(){
        return Studid;
    }
    public void setStudid(int Studid){
        this.Studid = Studid;
    }
    public String getStudentName(){
        return StudName;
    }
    public void setStudentName(String StudName){
        this.StudName = StudName;
    }
}
