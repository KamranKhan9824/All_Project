package Assistepractise;

class methodcheck
{
	public int me1(int a)
	{
		return a;
	}
	public String me2(String str)
	{
		return str;
	}
	public float me3(float fl)
	{
		return fl;
	}
	public double me4(double b)
	{
		return b;
	}
	public void me5(){
		System.out.println("Due to void Returns nothing");
	}
}

public class MethodDiff {

	public static void main(String[] args) {
		methodcheck mc=new methodcheck();
		System.out.println(mc.me1(10));
		System.out.println(mc.me2("Khan"));
		System.out.println(mc.me3(5.2f));
		System.out.println(mc.me4(414D));
		mc.me5();
	}

}
