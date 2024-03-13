package ACTIVITY1;

public class MAIN {
  
    public static void main(String[] args) {
        PERSON person1 = new PERSON("Ean Craig", 11);
        PERSON person2 = new PERSON("Evan Ross", 12);
        
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old. ");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old. \n");
        
    }
    
}
