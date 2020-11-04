package part20;


import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class Task74 {
    public static void main(String[] args) throws IOException, XMLStreamException {
String file="D:\\Sacuta\\src\\part20\\NOOD.xml";
boolean is_x=false;
boolean is_y=false;

        XMLInputFactory factory=XMLInputFactory.newFactory();
        XMLStreamReader reader=factory.createXMLStreamReader(new FileInputStream(file));
        while (reader.hasNext()){
            int res= reader.next();
            if(res==reader.START_ELEMENT){
            if(reader.getLocalName().equals("x")){
                is_x=true;
            }
            if (reader.getLocalName().equals("y")){
                is_y=true;
            }
        }else if(res==reader.CHARACTERS){
            if (is_x){
                System.out.print(reader.getText() + " px ,");
                is_x=false;
            }
            if (is_y){
                System.out.println(reader.getText() + " px ");
                is_y=false;
            }
            }
        }

    }
}