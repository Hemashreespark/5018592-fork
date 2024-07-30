package builderpatternpackage;

public class Test {
    public static void main(String[] args) {
        Computer highEndComputer = new Computer.Builder("Intel i9", "32GB", "1TB SSD")
            .setGPU("NVIDIA RTX 3080")
            .build();

        Computer basicComputer = new Computer.Builder("Intel i5", "8GB", "256GB SSD")
            .build();

        Computer midRangeComputer = new Computer.Builder("AMD", "16GB", "512GB SSD")
            .setGPU("NVIDIA GTX 1660")
            .build();

        //computer configurations
        System.out.println(highEndComputer);
        System.out.println(basicComputer);
        System.out.println(midRangeComputer);
    }
}
