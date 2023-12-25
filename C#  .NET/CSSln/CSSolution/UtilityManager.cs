using Mathematics;

namespace Utility;

public static class UtilityManager{
    //avoid uplifting
    public static void Calculate(int radius, out float area, out float circumference){
        area = (float)((3.14) * radius * radius);
        circumference = (float)(2 * (3.14) * radius); 
    }


    // params
    public static void ShowNames(params string[] names){
        foreach(string str in names) {
            Console.WriteLine(str);
        }
    }

    public static void ShowObjs(params object[] objs){
        foreach(object ele in objs) {
            Console.WriteLine(ele);
        }
    }


    // Extension Methods
    public static int Multiplication( this MathEngine e, int x, int y){
        return x * y;
    }

    public static int Division( this MathEngine e, int x, int y){
        return x / y;
    }
}