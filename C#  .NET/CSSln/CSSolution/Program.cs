using System.Reflection.Metadata;
using Library;
using Utility;
using Mathematics;

Books shelf = new Books();
// Console.WriteLine(shelf.titles[0]);
// shelf.titles[0] = "Title Changed";
// Console.WriteLine(shelf.titles[0]);

// Console.WriteLine(shelf.getTitle(0));

//Indexer
Console.WriteLine(shelf[0]);
shelf[0] = "Title Changed";
Console.WriteLine(shelf[0]);


// Nullable
int marks = 0;

int? count = null;

Nullable<int> amount = null;

Console.WriteLine("marks: " + marks);
Console.WriteLine("count: " + count);
Console.WriteLine("amount: " + amount);


// Avoid Uplifitng
// helps in returning more than one value from member function
float area, circumference;
UtilityManager.Calculate(15,out area, out circumference);

Console.WriteLine("area: " + area);
Console.WriteLine("circumference: " + circumference);


// params 
// string array
string[] Names = ["Pratik", "Somesh", "Ankit"];
UtilityManager.ShowNames(Names);


// mixed array
UtilityManager.ShowObjs(35, "Pratik", true, 55.23, area);



// Extension Method
MathEngine engine=new MathEngine();
int result1=engine.Addition(56,56);
Console.WriteLine("Addition: " + result1);
int result2=engine.Subtraction(56,56);
Console.WriteLine("Subtraction: " + result2);

int result3=engine.Multiplication(25,4);
Console.WriteLine("Multiplication: " + result3);
int result4=engine.Division(12,6);
Console.WriteLine("Division: " + result4);

