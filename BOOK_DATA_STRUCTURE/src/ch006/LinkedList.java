package ch006;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	
	Node head = null;
	public LinkedList() {
		head = new Node();
		System.out.println("Create Head");
	}
	
	public Node SearchNode(Address searchdata){
		Node tmp = head;
		while (tmp.getR_link() != null) {
			tmp = tmp.getR_link(); 			// Move to Next Link
			if(searchdata.equals(tmp.getData())){
//				System.out.println("Data Founded");
				return tmp;
			}
		}	
//		System.out.println("Data Not Founded");
//질문 :  data을 찾으면 해당 객체를 리턴하는데, 찾지못하면 객체를 리턴하지 않아도 될때, 에러값을 주던가, t/f값을 주어 제어해야 하는건지...
		return tmp;
	}
	
	public List<Node> SearchPreNode(Address searchdata){
		List<Node> list = new ArrayList<Node>();
		Node tmp = head;
		Node pre = tmp;
		while (tmp.getR_link() != null) {
			tmp = pre.getR_link(); 			// Move to Next Link
			if(searchdata.equals( tmp.getData())){
//				System.out.println("Data Founded");
				list.add(pre);
				list.add(tmp);
				return list;
			}
			pre = tmp;
		}	
//		System.out.println("Data Not Founded");
		return list;
	}
	
	public Node SearchEndofNode(){
		int count =0; 
		Node tmp = head;
		Node pre = tmp;
		while (tmp.getR_link() != null) {
			tmp = pre.getR_link(); 			// Move to Next Link
			if(tmp.getR_link()==null){
				return tmp;
			}
			pre = tmp;
		}
		return null;
	}
	
	public void InsertFirstNode(Address data) {

		Node node = new Node();
		node.setData(data);

		node.setR_link(head.getR_link());
		head.setR_link(node);

	}
	
	public void InsertMiddleNode(Address data, Address predata) {
		if (head.getR_link() == null) {
			System.out.println(" We need First Node! InsertFirstNode() ");
			return;
		}

		Node node = new Node();
		node.setData(data);
		Node pre = SearchNode(predata);
		node.setR_link(pre.getR_link());
		
		pre.setR_link(node);

	}

	public void InsertLastNode(Address data) {
		if (head.getR_link() == null) {
			System.out.println(" We need First Node! InsertFirstNode() ");
			return;
		}
		Node node = new Node();
		node.setData(data);
		node.setR_link(null);
		
		Node pre =SearchEndofNode();
		if(pre.getR_link() != null){
			System.out.println("We Can't Find Last Node! Error ");
		}
		pre.setR_link(node);
	}

	public void printNode() {
		Node tmp = head;
		System.out.println("================");
		while (tmp.getR_link() != null) {
			tmp = tmp.getR_link();
			System.out.println(tmp.getData()+"\t || \t"+tmp.getR_link());
		}
		System.out.println("================");
	}

	public void DeleteNode( Address data){
		if (head.getR_link() == null) {
			System.out.println(" No Data ");
			return;
		}
		List <Node> list =null;
		try{
		 list = SearchPreNode(data);
		}catch(NullPointerException e){
			System.out.println("No Data: 110");
		}
		Node pre = list.get(0);
		Node tmp =list.get(1);
		pre.setR_link(tmp.getR_link());
		
	}
}
