import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[]args){
        try {
            FileReader reader=new FileReader("src/customers-100.csv");
            Persona danishCustomer=new Persona();
            int next;
            String record="";
            while((next= reader.read())!=-1){
                if(next!=10)
                    record=record+((char)next);
                else{
                    String [] campiRecord=record.split(",");
                    if(campiRecord[6].equalsIgnoreCase("Denmark")){
                        danishCustomer.add(new Persona(Integer.parseInt(campiRecord[0]),campiRecord[1],campiRecord[2],campiRecord[3],campiRecord[4],campiRecord[5],campiRecord[6],campiRecord[7],campiRecord[8],campiRecord[9],campiRecord[10]));
                        System.out.println("Aggiunto utente con id: "+Integer.parseInt(campiRecord[0]));
                    }
                    record="";
                }
            }
            System.out.println(danishCustomer);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}