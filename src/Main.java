import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean bla = true;
        while(bla) {
            System.out.println("Name your folder!");
            Scanner sc = new Scanner(System.in);
            String folderName = sc.nextLine();
            Folder mainFolder = new Folder(folderName);

            System.out.println("What type of file do you want?");
            System.out.println("1. FilePNG");
            System.out.println("2. FileDoc");
            System.out.println("3. FileTXT");
            int choice = sc.nextInt();
            sc.nextLine();
            boolean answer;
            switch (choice) {
                case 1:
                    ArrayList<FilePNG> pnglist = new ArrayList<>();
                    do {
                        System.out.println("Name your file: ");
                        String filename = sc.nextLine();
                        FilePNG filepng = new FilePNG(filename);
                        System.out.println("Function of the file: ");
                        String description = sc.nextLine();
                        filepng.defineFile(description);
                        pnglist.add(filepng);
                        System.out.println("Would you like to create more files?");
                        answer = sc.nextBoolean();
                        sc.nextLine();

                    } while (answer);
                    mainFolder.setFiles(pnglist);
                    break;
                case 2:
                    ArrayList<FileDoc> doclist = new ArrayList<>();
                    do {
                        System.out.println("Name your file: ");
                        String filename = sc.nextLine();
                        FileDoc filedoc = new FileDoc(filename);
                        System.out.println("Function of the file: ");
                        String description = sc.nextLine();
                        filedoc.defineFile(description);
                        doclist.add(filedoc);
                        System.out.println("Would you like to create more files?");
                        answer = sc.nextBoolean();
                        sc.nextLine();

                    } while (answer);
                    mainFolder.setFiles(doclist);
                    break;
                case 3:
                    ArrayList<FileTXT> txtlist = new ArrayList<>();
                    do {
                        System.out.println("Name your file: ");
                        String filename = sc.nextLine();
                        FileTXT filetxt = new FileTXT(filename);
                        System.out.println("Function of the file: ");
                        String description = sc.nextLine();
                        filetxt.defineFile(description);
                        txtlist.add(filetxt);
                        System.out.println("Would you like to create more files?");
                        answer = sc.nextBoolean();
                        sc.nextLine();

                    } while (answer);
                    mainFolder.setFiles(txtlist);
                    break;

            }
            System.out.println("This is your folder: ");
            System.out.println(mainFolder.getName());
            System.out.println("With the files: ");
            int index = 0;
            for(File
 a : mainFolder.getFiles()){
                System.out.println(index + ". " + a.getName() + " //" + a.getDescription());
                index++;
            }
            System.out.println("Would you like to make another folder?");
            bla = sc.nextBoolean();
            sc.nextLine();
        }

        System.out.println("Thank you for your service!");
        System.out.println("Bye Bye!");
    }

}
