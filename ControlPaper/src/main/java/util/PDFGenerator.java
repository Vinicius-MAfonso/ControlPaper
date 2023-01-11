package util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import model.Worker;

public class PDFGenerator {
    Worker worker = null;
    Path path = null;
//    Document document = null;
    public PDFGenerator(Worker worker){
        this.worker = worker;
    }
    public void build(){
//        document =  new Document();
    }
    public boolean save(){
        return true;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }
    
}
