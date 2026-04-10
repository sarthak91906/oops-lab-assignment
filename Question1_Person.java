public class Question1_Person {
    String name;
    int age;
    
    public Question1_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public static void main(String[] args) {
        Question1_Person person1 = new Question1_Person("John Doe", 25);
        Question1_Person person2 = new Question1_Person("Jane Smith", 30);
        
        person1.display();
        person2.display();
    }
}
