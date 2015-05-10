import stdlib.In;
public class Shell2 extends Sort{
	public static void sort(Comparable[] a){
		int N=a.length;
		int h=1;
		while(h<N/3)h=3*h+1;
		while(h>=1){
			insertSort(a,h);
			h=h/3;
		}
	}
	private static void insertSort(Comparable[] a,int h){
		for(int i=h;i<a.length;i++){
			for(int j=i;j>=h&&less(a[j],a[j-h]);j-=h){
				exch(a,j,j-h);
			}
		}
	}
	public static void main(String[] args){
		String[] a=In.readStrings();
		sort(a);
		assert isSorted(a);
		show(a);
	}
}
