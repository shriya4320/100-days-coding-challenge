class Animal{
    public String color;

    public void eat(){
        System.out.println("Animal can eat:");
        System.out.println("color"+color);
    }
    public void run(){
        System.out.println("Animal can run:");

    }
}
    class MyAnimal{
    public static void main(String args[]){

            Animal dog= new Animal();
            dog.color="white";
            dog.eat();
            dog.run();

            Animal cat= new Animal();
            cat.color="black";
            cat.eat();
            cat.run();
                }
    }