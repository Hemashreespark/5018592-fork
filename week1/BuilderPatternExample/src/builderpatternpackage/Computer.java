package builderpatternpackage;


public class Computer {
    // Attributes of the Computer
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    
    
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
       
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage 
            + ", GPU=" + GPU + "]";
    }

    // Static nested Builder class
    public static class Builder {
        // Required attributes
        private String CPU;
        private String RAM;
        private String storage;

        // Optional attributes
        private String GPU;

        // Constructor for required attributes
        public Builder(String CPU, String RAM, String storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        // Methods for setting optional attributes
        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }


        // Method to build the Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}
