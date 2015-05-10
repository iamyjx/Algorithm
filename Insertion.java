import stdlib.In;
public class Insertion extends Sort{ 
	public static void sort(Comparable[] a){
		//up sort
		for(int i=1,l=a.length;i<l;i++){
			for(int j=i;j>0;j--){
				if(less(a[j],a[j-1]))
					exch(a,j,j-1);
			}
		}
	}
	public static void main(String[] args){
		String[] a=In.readStrings();
		sort(a);
		assert isSorted(a);
		//System.out.println("isSorted?"+isSorted(a));
		show(a);
	}

}
