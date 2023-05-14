public class FilePNG extends File{

    public FilePNG(String name){
        super(name + ".png");
    }

    @Override
    public void defineFile(String description) {
        this.description = "PNG file: " + description + ".";
    }
}
