class Person {
    String name;
    int age;
}
class MakingChanges{
    public static void changeIdentities(Person p1, Person p2){
          String tempName = p1.name;
          int tempAge = p1.age;
          p1.name = p2.name;
          p1.age = p2.age;
          p2.name = tempName;
          p2.age = tempAge;
          System.out.println("Identities have been swapped \nPerson 1 is: "+ p1.name+" Age - "+p1.age+" while Person 2 is now: "
                  + p2.name+" Age - "+p2.age);
        }

    public static void main (String[] args){
        Person p1= new Person();
        Person p2= new Person();
        p1.name="John";
        p1.age=20;
        p2.name="Mary";
        p2.age=39;
        MakingChanges.changeIdentities(p1,p2);

        Person p3= new Person();
        Person p4= new Person();
        p3.name="Sienna";
        p3.age=19;
        p4.name="Vaughn";
        p4.age=24;
        MakingChanges.changeIdentities(p3,p4);
    }
}
