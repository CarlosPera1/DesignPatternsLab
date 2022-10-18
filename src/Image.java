public class Image {
    public String imageName;

    public Image(String imageName) {
        super();
        this.imageName = imageName;
    }

    public void print() {
        System.out.println("Imagine: " + this.imageName);
    }

}