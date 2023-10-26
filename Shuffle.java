import java.util.Random;
public class Shuffle
{
	public static void main(String [] args)
	{
		int a[]={0,1,2,3,4,5,6,7,8,9,10};
		Random random=new Random();
		for (int i=0;i<=a.length ;i++ )
		{
			int rvalue= random.nextInt(a.length);
			int temp=a[i];
			a[i]=a[rvalue];
			a[rvalue]=temp;

		}
		for (int i=0;i<a.length ;i++ )
		{
			System.out.println(a[i]+" ");
		}
	}
}