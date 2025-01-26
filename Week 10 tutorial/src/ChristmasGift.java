public class ChristmasGift {
    private String name;
    private String recipient;
    private int age;


    public ChristmasGift(String name, String recipient, int age) {
        this.name = name;
        this.recipient = recipient;
        this.age = age;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
