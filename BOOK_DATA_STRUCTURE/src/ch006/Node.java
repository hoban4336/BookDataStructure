package ch006;


public class Node {
	// private r_node l_link;
	 private Address data ;
	 private Node r_link;
	
	public Node() {
		data =null;
		r_link = null;
	}
	
	public Node(Node r_link){
		this.r_link = r_link;
	}
	
	public Node(Address data, Node r_link ){
		this.data = data;
		this.r_link = r_link;
	}

	// getter-setter 
	public Address getData() {
		return data;
	}

	public void setData(Address data) {
		this.data = data;
	}

	public Node getR_link() {
		return r_link;
	}

	public void setR_link(Node r_link) {
		this.r_link = r_link;
	}

	
	
	
}
