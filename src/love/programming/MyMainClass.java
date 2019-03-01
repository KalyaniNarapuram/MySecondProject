package love.programming;

public class MyMainClass {
    public static void main(String[] args) {
        Person personObject1 = new Person();
        Person personObject2 = new Person();
        Person personObject3 = new Person();
        Person personObject4 = new Person();
        personObject1.setFirstName("Pavan");
        personObject2.setFirstName("Kalyani");
        personObject3.setFirstName("Aashi");
        personObject4.setFirstName("Aanvi");
        System.out.println(personObject1.getFirstName() + personObject2.getFirstName() + personObject3.getFirstName() + personObject4.getFirstName());

        personObject1.setLastName("Narapuram");
        personObject2.setLastName("Narapuram");
        personObject3.setLastName("Narapuram");
        personObject4.setLastName("Narapuram");
        System.out.println(personObject1.getLastName() + personObject2.getLastName() + personObject3.getLastName() +
         personObject4.getLastName());

        personObject1.setAge(35);
        personObject2.setAge(30);
        personObject3.setAge(9);
        personObject4.setAge(4);
        System.out.println(personObject1.getAge() + personObject2.getAge() + personObject3.getAge() + personObject4.getAge());


    }
}
