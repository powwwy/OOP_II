public class AgeStatus {
    public static void main(String[] args) {
        int age = 25; 
        
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else if (age >= 18 && age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
    }
}
