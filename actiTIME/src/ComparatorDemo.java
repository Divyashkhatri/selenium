import java.util.Arrays;
import java.util.Comparator;
class WaterBottle implements Comparable<WaterBottle>
{
	int height,volume,weight;
	WaterBottle(int height, int volume,int weight)
	{
		this.height=height;
		this.volume=volume;
		this.weight=weight;
	}
	@Override
	public String toString()
	{
		return volume+" "+height+" "+weight;
	}
	@Override
	public int compareTo(WaterBottle o) 
	{
		return this.height-o.height;
	}
}

class sortByVolume implements Comparator<WaterBottle>
{	
	@Override
	public int compare(WaterBottle o1, WaterBottle o2) 
	{
		return o1.volume-o2.volume;
	}
}

class SortByWeight implements Comparator<WaterBottle>
{

	@Override
	public int compare(WaterBottle o1, WaterBottle o2) {
		// TODO Auto-generated method stub
		return o1.weight-o2.weight;
	}
	
}
public class ComparatorDemo
{
	public static void main(String[] args) 
	{
		WaterBottle wb1=new WaterBottle(2,10,23);
		WaterBottle wb2=new WaterBottle(3,15,32);
		WaterBottle wb3=new WaterBottle(4,100,443);
		WaterBottle wb4=new WaterBottle(6,32,4);
		WaterBottle wb5=new WaterBottle(1,1,5);
		WaterBottle waterbottle[]=new WaterBottle[]{wb2,wb1,wb4,wb3,wb5};
		System.out.println(Arrays.toString(waterbottle));
		Arrays.sort(waterbottle);
		System.out.println(Arrays.toString(waterbottle));
		Arrays.sort(waterbottle, new SortByWeight());
		System.out.println(Arrays.toString(waterbottle));
	}
}