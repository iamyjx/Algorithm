import stdlib.In;
public class Selection extends Sort {
	public static  void sort(Comparable[] a){
		//System.out.println("SelectSort#sort");
		for(int i=0,l=a.length;i<l;i++){
			int min=i;
			for(int j=i+1;j<l;j++){
				if(less(a[j],a[min]))
					min=j;
			}
			exch(a,i,min);
		}
	}
	public static void main(String[] args){
		String[] a=In.readStrings();
		sort(a);
		assert isSorted(a);
		show(a);
	}
}
