public class TestClass5026211174 {
    public static void main(String[] args){
    ComputeMethods5026211174 input = new ComputeMethods5026211174();

    double celsius = input.fToC(100);
		System.out.println("Temp in celsius is "+celsius);

    double hypot = input.hypotenuse(6,8);
		System.out.println("The hypotenuse is "+hypot);

    int dice = input.roll();
		System.out.println("The sum of the dice values is "+dice);
    }
}
