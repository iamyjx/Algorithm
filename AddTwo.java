class AddTwo{
	public class LinkNode{
		int val;
		LinkNode next;
		public LinkNode(int x){
			val=x;
		}
	}
	public static void main(String args[]){
		LinkNode n1=new LinkNode(2);
		n1.next=new LinkNode(4);
		n1.next.next=new LinkNode(3);
		n
	}
	private LinkNode generate( int  digit){
		String s=String.valueOf(digit);
		for(int i=0,l=s.length;i<l;i++){

		}


	}
	public LinkNode add (LinkNode n1 ,LinkNode n2){
		LinkNode r;
		int p;
		do{
			int sum=n1.val+n2.val+p;
			p=sum%10;
			if(r==null)r=new LinkNode(p);
			else r.next=new LinkNode(p);
			n1=n1.next;
			n2=n2.next;
		}while(n1!=null&n2!=null)
		r.next=new LinkNode((n1!=null?n1.val:0)+(n2!=null?n2.val:0)+p);
		reeturn r;
	}
}
