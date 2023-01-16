package util;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.TextAlignment;
import controller.PointController;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import model.Point;
import model.Worker;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;


public class PDFGenerator {
    Worker worker = null;
    List <Point> points = null;
    File file = null;
    String pathFolder = null;
    String pathFile = null;
    
    public PDFGenerator(Worker worker, File file){
        this.worker = worker;
        points = new PointController().getAll(worker.getId());
        this.file = file;
        this.pathFolder = file.getPath();
        this.pathFile = String.format("%s.pdf", worker.getName());
        file.setWritable(true);
        file.setReadable(true);  
        if(!file.exists()){
            file.mkdir(); 
        }
    }
    public void build(){
        try{
            PDDocument document = new PDDocument();
            document.addPage(new PDPage());
            document.save(pathFolder+pathFile);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        try{
            create(pathFolder+"/"+pathFile, worker);
        }catch(IOException ioe){
            System.err.println(ioe);
        }
        
    }
    private void create(String dest, Worker worker) throws IOException{
        //Inicializa o PDF writer
        FileOutputStream fos = new FileOutputStream(dest);
        PdfWriter writer = new PdfWriter(fos);
        //Inicializa PDF document
        PdfDocument pdf = new PdfDocument(writer);
        //Construção
        try ( //Inicializa o documento
                Document document = new Document(pdf)) {
            //Construção
            document.add(new Paragraph("Logo Exemplo").setFontSize(20).setTextAlignment(TextAlignment.CENTER));
            document.add(new Paragraph(String.format("Nome: %S", worker.getName())));
            document.add(new Paragraph(String.format("Função: %S", worker.getRole())));
            document.add(new Paragraph(String.format("Turno: %S", worker.getShift())));
            document.add(new Paragraph("Pontos").setTextAlignment(TextAlignment.CENTER));
            //Fecha o documento
        }
    }
}
