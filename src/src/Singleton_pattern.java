public class Singleton_pattern {
    private static volatile Singleton_pattern instance;

    // 2. Private constructor prevents instantiation from outside
    private Singleton_pattern() {}

    public static Singleton_pattern getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (Singleton_pattern.class) {
                if (instance == null) { 
                    instance = new Singleton_pattern();
                }
            }
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("Hello from Singleton Pattern!");
    }
    public static void main(String[] args) {
        // Accessing the singleton instance
        Singleton_pattern singleton = Singleton_pattern.getInstance();
        singleton.displayMessage();
        
        Singleton_pattern obj = new Singleton_pattern(); // Compile-time error
        obj.displayMessage();
        
    }
}