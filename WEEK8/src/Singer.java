public class Singer {
    private String name;
    private int age;
    private boolean professional;


    Singer (String name, int age) {
        this.name = name;
        this.age = age;
        this.professional = true;
    }


    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean isProfessional() {
        return professional;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int newAge) {
        if (newAge >= age ) {
            this.age = newAge;
        }
    }
    public void reverseProfessional(){
        this.professional = !professional;
        //this.professional = false;
    }
    public boolean isAdult(){
        return this.age >= 18;
    }
}
