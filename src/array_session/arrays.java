package array_session;

public class arrays {
	public static void main(String[] args) {
		int  a[]= {1,2,4,5,6};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);

		int[] n=new int[3];
		for(int i=0;i<n.length;i++) {
			System.out.println(1);
		}
	}
}
// why array index start from 0:
//to avoid extra computation  in memory address
// for eg: if arr[]={1,2,3,4}
// so here index[0]=1,1=2,2=3,3=4. where it store in memory with address = 1 stored in adrress of 200 2 in 204, 3 in 206, 5 in 208
// formula is for this calculation 200+[2x2],,
// if index start from 1, then we have to do 200+[2x3]-2