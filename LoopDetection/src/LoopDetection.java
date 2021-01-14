class Node
{
	int value;
	Node next;
	public Node()
	{
		
	}
	public void setV(int value, Node next)
	{
		this.value = value;
		this.next = next;
	}
}

public class LoopDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		Node n5 = new Node();
		Node n6 = new Node();
		
		n1.setV(1, n2);
		n2.setV(2, n3);
		n3.setV(3, n4);
		n4.setV(4, n5);
		n5.setV(5, n6);
		n6.setV(6, n2);
		
		
		loopDetection(n1);
	}
	static void loopDetection(Node n)
	{
		Node slow = n;
		Node temp = n;
		Node fast = n.next;
		
		int cnt = 0;
		while(fast != slow)
		{
			fast = fast.next.next;
			slow = slow.next;
		}
		//slow = n;
		fast = fast.next;
		while(fast != temp)
		{
			fast = fast.next;
			temp = temp.next;
			cnt++;
			
		}
		/*slow = n;
		for(int i = 1; i <= cnt; i++)
		{
			slow = slow.next;
		}*/
		System.out.println(fast.value);
		
	}

}
