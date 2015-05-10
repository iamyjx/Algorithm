import stdlib.*;
public class Bubble extends Sort{
	public static void sort(Comparable[] a){
		int N=a.length;
		for(int i=N-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(less(a[j+1],a[j])){
					exch(a,j,j+1);
				}
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
