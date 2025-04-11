package object2;
class Example {
	
    private static int createdCount = 0; // Tracks the number of objects created
    private static int destroyedCount = 0; // Tracks the number of objects finalized

    private int x;

    Example() {
        x = 10;
        createdCount++; // Increment the creation count
        System.out.println("Ex constructor " + this);
    }

    @Override
    protected void finalize() {
        destroyedCount++; // Increment the destruction count
        System.out.println("In finalize: " + this);
    }

    // Static method to get the number of objects created
    public static int getCreatedCount() {
        return createdCount;
    }

    // Static method to get the number of objects finalized
    public static int getDestroyedCount() {
        return destroyedCount;
    }
}
