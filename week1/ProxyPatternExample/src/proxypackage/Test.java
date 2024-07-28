package proxypackage;

public class Test {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("test_image_1.jpg");
        Image image2 = new ProxyImage("test_image_2.jpg");

        // Image will be loaded from disk
        image1.display();
        System.out.println("");

        // Image will not be loaded from disk, as it's already cached
        image1.display();
        System.out.println("");

        // Image will be loaded from disk
        image2.display();
        System.out.println("");

        // Image will not be loaded from disk, as it's already cached
        image2.display();
    }
}

