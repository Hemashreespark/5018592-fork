package builderpatternpackage;

public class Test {
    public static void main(String[] args) {
        // Create a Computer with all attributes
        Computer highEndComputer = new Computer.Builder("Intel i9", "32GB", "1TB SSD")
            .setGPU("NVIDIA RTX 3080")
            .build();

        // Create a Computer with only required attributes
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB", "256GB SSD")
            .build();

        // Create a Computer with some optional attributes
        Computer midRangeComputer = new Computer.Builder("AMD Ryzen 5", "16GB", "512GB SSD")
            .setGPU("NVIDIA GTX 1660")
            .build();

        // Print the computer configurations
        System.out.println(highEndComputer);
        System.out.println(basicComputer);
        System.out.println(midRangeComputer);
    }
}
