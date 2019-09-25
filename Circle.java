
public class Circle {
	public static void main(String[] args){
		System.out.println("Diameter:"+diameter(5.0));
		System.out.println("Circumference:"+circumference(5.0));
		System.out.println("Area:"+area(5.0));

	}
	public static double diameter(double radius){
		return 2*radius;
	}

	public static double circumference(double radius){
		return 2*Math.PI*radius;
	}
	public static double area(double radius){
		return Math.PI*Math.pow(radius,2);
	}
}
