
public class Main {

    public static void main(String[] args) throws Exception {
        // write some test code here
        // for testing purposes, project has files
        //    src/textfile.txt
        //    src/kalevala.txt
        Printer printer = new Printer("src/koe.txt");
        printer.printLinesWhichContain("word");
        printer.printLinesWhichContain("koe");
    }
}
