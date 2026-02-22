public class String {
    public static void main(String[] args) {
        // String Basics
        String name = "Java Programming";
        String city = "India";
        
        // String Length
        System.out.println("String: " + name);
        System.out.println("Length: " + name.length());
        
        // String Concatenation
        String message = name + " in " + city;
        System.out.println("Concatenation: " + message);
        
        // String Methods
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Contains 'Java': " + name.contains("Java"));
        System.out.println("Starts with 'Java': " + name.startsWith("Java"));
        System.out.println("Character at index 0: " + name.charAt(0));
        System.out.println("Substring (0,4): " + name.substring(0, 4));
        System.out.println("Index of 'P': " + name.indexOf('P'));
        System.out.println("Replace 'Java' with 'Python': " + name.replace("Java", "Python"));
    }
}
