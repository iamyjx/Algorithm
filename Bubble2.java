import stdlib.*;
public class Bubble2 extends Sort{
	public static void sort(Comparable[] a){
		boolean isChanged=false;
		do{
//			System.out.println("in");
			isChanged=false;
			for(int i=1;i<a.length;i++){
//				System.out.println("in i="+i);
				if(less(a[i],a[i-1])){
//					System.out.println("in2");
					exch(a,i,i-1);
					isChanged=true;
      				}


			}
 		}while(isChanged);
	}
	public static void main(String[] args){
		String[] a=In.readStrings();
		sort(a);
		assert isSorted(a);
		show(a);
	}
}
