class Calculator{
	public static void add(int a, int b){
		int c=a+b;
		System.out.println("add"+c);
	         }
	public static void sub(int d, int e){
		int f=d+e;
		System.out.println("sub"+f);
	         }
	}
	
class Cal{
	public static void main(String args[]){
	
	Calculator obj=new Calculator();
	obj.add(10,50);
	obj.sub(100,40);

}
	public void display(){
	System.out.println("add");
	System.out.println("sub");
}
}

	