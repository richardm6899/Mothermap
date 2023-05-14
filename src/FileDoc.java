public class FileDoc extends File{


    public FileDoc(String name){
        super(name + ".doc");
    }


    @Override
    public void defineFile(String description){
        this.description = "Doc File: " + description + ".";
    }
}
