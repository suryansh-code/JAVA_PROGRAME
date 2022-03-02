class Pets 
{
    int age;
    String color;

    public void run()
    {
        System.out.println("i am running");
    }

    public void speak()
    {
        System.out.println("i am speaking");
    }

    public static void main(String[] args) {
        Pets cat=new Pets();
        cat.age=2;
        cat.color="white";
        cat.run();
        cat.speak();

        System.out.println("the color of the cat is" + cat.color + "and the age of cat is" + cat.age);

    }



}