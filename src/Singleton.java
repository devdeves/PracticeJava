public class Singleton {
    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
        // Code for any initialization or setup can be placed here
    }

    // Public static method to obtain the singleton instance
    public static Singleton getInstance() {
        // Check if the instance is null (not created yet)
        if (instance == null) {
            // Synchronize to ensure thread safety
            synchronized (Singleton.class) {
                // Double-check if another thread has created the instance while waiting for the lock
                if (instance == null) {
                    // Create the singleton instance
                    instance = new Singleton();
                }
            }
        }
        // Return the singleton instance
        return instance;
    }
}
