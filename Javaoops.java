package Javaoops;
class Point {
	
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//Method to obtain distance of a point w.r.t origin
	public double distance(){
	    //code here
			 double org=(Math.sqrt(x*x+y*y));
			 return org;
		
	}
	
	//Method to obtain distance of a point w.r.t another point
	public double distance(Point point){
		double sample=x ,y;
		return sample;
		
	}

}
class Tester {
	public static void main(String[] args) {
	    //code here
		Point P1=new Point(2,3);
		Point P2=new Point(5,6);
		P1.distance();
		System.out.println(P1.distance());
		System.out.println("");	
	}
}
