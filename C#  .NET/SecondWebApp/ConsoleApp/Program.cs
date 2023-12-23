using Hardware;
using Drawings;

HpPrinter newDevice = new HpPrinter();
Line newLine = new Line();
Console.WriteLine(newLine);

Line newLine1 = new Line(2, 4, 7, 9, 2, "blue");
Console.WriteLine(newLine1);

// newDevice.Print();
// newDevice.Scanner();