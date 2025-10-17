package com.example;
//package com.example.Person;

public class shay {
    
    public static void main(String[] args) {
       
        Person person1 = new Person("Ali", 25);
        Person person2 = new Person("Babol", 16);
        
       
        System.out.println(" moshkhsat shakhs");
        person1.displayDetails();
        person2.displayDetails();
        
       
        System.out.println("\n Status");
        System.out.println(person1.getName() + " is : " + person1.isAdult());
        System.out.println(person2.getName() + " is : " + person2.isAdult());
        
        
        System.out.println("\n Status Messages");
        person1.printAdultStatus();
        person2.printAdultStatus();
        
        //sen bayad balaye 18 bashe vagrne dobare set mishe
        System.out.println("\n moshakas kardan sen ");
        person2.setAge(20);
        person2.displayDetails();
        person2.printAdultStatus();
        
        
       
        System.out.println("Person1 Name: " + person1.getName());
        System.out.println("Person1 Age: " + person1.getAge());
    }
}