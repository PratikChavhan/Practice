namespace Drawings;

public abstract class Shape{
    public abstract void Draw();

    public int Width{get;set;}
    public string Color{get;set;}
    public Shape() {
        this.Width=0;
        this.Color="black";
    }
    public Shape(int w, string c){
        this.Width=w;
        this.Color=c;
    }
    public override string ToString(){
        return "Width: " + this.Width +", Color: "+this.Color;
    }
} 