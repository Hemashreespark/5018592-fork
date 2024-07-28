package proxypackage;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading " + fileName);
        // Simulate loading from a remote server
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}

