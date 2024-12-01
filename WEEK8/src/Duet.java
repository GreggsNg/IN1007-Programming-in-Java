public class Duet {
    private int singer1;
    private int singer2;

    Duet(int singer1, int singer2){
        this.singer1 = singer1;
        this.singer2 = singer2;
    }

    public void setSinger1 (int singer1){
        this.singer1 = singer1;
    }
    public int getSinger1(){
        return singer1;
    }
    public void setSinger2 (int singer2){
        this.singer2 = singer2;
    }
    public int getSinger2(){
        return singer2;
    }


    public boolean bothProfessional(){
        return singer1.isProfessional()&& singer2.isProfessional();

    }
}
