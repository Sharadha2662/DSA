
public class Printing {
	public static void main(String[] args) {
	// Printing a string
    System.out.println("Hello, World!");

    // Printing an integer
    int number = 42;
    System.out.println("The answer is: " + number);

    // Printing a floating-point number
    double pi = 3.14159;
    System.out.println("Value of Pi: " + pi);

    // Printing multiple values
    String name = "Alice";
    int age = 30;
    System.out.println(name + " is " + age + " years old.");
    // Printing a boolean value
    boolean isJavaFun = true;
    System.out.println("Is Java fun? " + isJavaFun);
    // Printing a character
    char initial = 'A';
    System.out.println("Initial: " + initial);
    // Printing a formatted string
    System.out.printf("Name: %s, Age: %d, Height: %.2f\n", name, age, 5.9);
    // Printing with escape sequences
    System.out.println("This is a line break:\nAnd this is a tab:\tTabbed text.");
    // Printing a special character
    System.out.println("Special character: \u2602"); // Unicode for umbrella
    // Printing an array
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.print("Array elements: ");
    for (int num : numbers) {
        System.out.print(num + " ");
    }
    System.out.println(); // New line after printing array
    // Printing a list
    java.util.List<String> fruits = java.util.Arrays.asList("Apple", "Banana", "Cherry");
    System.out.println("Fruits: " + fruits);
    // Printing a map
    java.util.Map<String, Integer> scores = new java.util.HashMap<>();
    scores.put("Alice", 90);    
    scores.put("Bob", 85);
    System.out.println("Scores: " + scores);
    // Printing a custom object
    class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    Person person = new Person("Charlie", 25);

    //to print in the same line
    System.out.print("this is sharadha.");
    System.out.print("working as a developer");
    // to print in a new line
    System.out.println("this is sharadha.");
	}
}


