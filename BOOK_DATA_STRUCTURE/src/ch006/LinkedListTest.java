package ch006;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.InsertFirstNode(new Address("강동원", "강동원전화", "강동원이메일"));

		
		list.InsertLastNode(new Address("공유", "공유전화", "공유이메일"));
		list.InsertLastNode(new Address("이필모", "이필모전화", "이필모이메일"));

		list.printNode();

		list.InsertMiddleNode(new Address("조정석", "조정석전화", "조정석이메일"),
								  new Address("공유", "공유전화", "공유이메일")); // 강동원 - 공유 - 조정석 - 이필모
		
		list.printNode();
		

		list.DeleteNode(new Address("공유", "공유전화", "공유이메일"));
		
		list.printNode();
	}

}
