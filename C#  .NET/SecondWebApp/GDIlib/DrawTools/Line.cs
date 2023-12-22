using Drawing;
using Hardware;

public class Line:Shape, Iprinter{
    public Point startpoint{get;set;}
    public Point endpoint{get;set;}

    public Line():base(){
        this.startpoint= new Point(0,0);
        this.endpoint= new Point(0,0);
    }

    public Line(int x1, int y1, int x2, int y2, int w, String c):base(w,c){
        this.startpoint = new Point(x1,y1);
        this.endpoint = new Point(x2,y2);
    }

    public override void Draw(){
        Console.WriteLine("Drawing Line");
        Console.WriteLine(this);
    }

    public override string ToString(){
        return base.ToString() + ", StartPoint("+ this.startpoint +"), "+ "EndPoint("+ this.endpoint +")";
    }

    void Iprinter.Print(){
        Console.WriteLine("Printing Line");
        Console.WriteLine(this); // calls the ToString method 
    }

} 