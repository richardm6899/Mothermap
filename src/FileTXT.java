public class FileTXT extends File{

    public FileTXT(String name){
        super(name + ".txt");
    }


    @Override
    public void defineFile(String description){

        this.description = "TxT file: " + description;
    }

}
