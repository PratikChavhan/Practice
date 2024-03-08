namespace Hardware;

public class HpPrinter:Iprinter, Iscanner{
    public void Print() {
        Console.WriteLine("Printer is started...");
    }

    public void Scanner(){
        Console.WriteLine("Scanner is started....");
    }
    
} 