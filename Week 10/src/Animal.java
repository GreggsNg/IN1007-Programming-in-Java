abstract class Animal {
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zez");

    }
    class pig extends Animal {
        public void animalSound(){
            System.out.println("the Pig says: wee wee");
        }
    }
}

