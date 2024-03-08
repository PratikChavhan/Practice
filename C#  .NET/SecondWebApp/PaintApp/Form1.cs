using Drawings;
using System.Drawing;

namespace PaintApp;

public partial class Form1 : Form
{
    Drawings.Point startpoint;
    Drawings.Point endpoint;
    public Form1()
    {
        InitializeComponent();
        Paint += new System.Windows.Forms.PaintEventHandler(onPaint);
        MouseDown += new System.Windows.Forms.MouseEventHandler(onMouseDown);
        MouseUp += new System.Windows.Forms.MouseEventHandler(onMouseUp);
    }
    public void onPaint(object sender, PaintEventArgs e) {

    }

    public void onMouseDown(object sender, MouseEventArgs e) {
        startpoint = new Drawings.Point(e.X, e.Y);
    }

    public void onMouseUp(object sender, MouseEventArgs e) {
        endpoint = new Drawings.Point(e.X, e.Y);
        Line l = new Line(startpoint, endpoint, 3, "red");
        Pen pen = new Pen(Color.FromArgb(255, 255, 0, 0));
        Graphics g = this.CreateGraphics();
        g.DrawLine(pen, l.startpoint.X, l.startpoint.Y, l.endpoint.X, l.endpoint.Y);
    }
    
}
