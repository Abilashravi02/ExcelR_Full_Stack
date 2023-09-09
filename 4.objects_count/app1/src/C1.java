class C1 
{
	int count;
	C1()
	{
		count++;
	}
	public static void main(String[] args) 
	{
		C1 obj1 = new C1();
		System.out.println("a: " + obj1.count);
		C1 obj2 = new C1();
		System.out.println("b: " + obj2.count);
		C1 obj3 = new C1();
		System.out.println("c: " + obj3.count);
		C1 obj4 = new C1();
		System.out.println("d: " + obj4.count);
		C1 obj5 = new C1();
		System.out.println("e: " + obj5.count);
	}
}
