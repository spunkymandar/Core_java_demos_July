package pack1;

public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] data=new int[5];//size of array as 5 integers
		int[] data= {10,34,12,42,53,23};
		data[0]=10;
		data[1]=20;
//		for(int i=0;i<data.length;i++)
//			System.out.println(data[i]);
		
		//enhanced for loop
		for(int v : data) {
			System.out.println(v);
		}
		
		//System.out.println(data);
	}

}
