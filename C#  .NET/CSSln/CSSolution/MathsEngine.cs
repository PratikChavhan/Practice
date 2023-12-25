namespace Mathematics;

public sealed class MathEngine{
    public int Addition(int a, int b){
        return a + b;
    }
    public int Subtraction(int x, int y){
        return x - y;
    }

    // class sealed so cant extended but, we can use extension method.
    // extension method dosen't require inheritance
    // Division and Multiplication are extended using extension method
}

