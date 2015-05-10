import stdlib.*;
public class Bubble3 extends Sort{
	public static void sort(Comparable[] a){

		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(less(a[j+1],a[j])){
					exch(a,j+1,j);
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
