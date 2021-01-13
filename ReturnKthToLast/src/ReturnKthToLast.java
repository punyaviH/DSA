class Node
{
	int value;
	Node next;
	public Node(int value, Node next)
	{
		this.value = value;
		this.next = next;
	}
}

public class ReturnKthToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n7 = new Node(6,null);
		Node n6 = new Node(1,n7);
		Node n5 = new Node(2,n6);
		Node n4 = new Node(5,n5);
		Node n3 = new Node(11,n4);
		Node n2 = new Node(10,n3);
		Node n1 = new Node(5,n2);
		
		returnKth(n1,3);
		returnKth(n1,5);
		returnKth(n1,7);
	}
	static void returnKth(Node n,int k)
	{
		int i = 1;
		Node x = n;
		Node y = n;
		while(i <= k)
		{
			y = y.next;
			i++;
		}	
		while(y != null)
		{
			//System.out.println(x.value + "  ");
			x = x.next;
			y = y.next;
		}
		System.out.println(k + " th Element: " + x.value);
	}

}
