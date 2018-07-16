package cn.mm;

public class Question {

	/*public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOptA() {
		return optA;
	}

	public void setOptA(String optA) {
		this.optA = optA;
	}
	
	public String getOptB() {
		return optB;
	}

	public void setOptB(String optB) {
		this.optA = optB;
	}

	public String getOptC() {
		return optC;
	}

	public void setOptC(String optC) {
		this.optA = optC;
	}

	public String getOptD() {
		return optD;
	}

	public void setOptD(String optD) {
		this.optD = optD;
	}
	
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}*/
	
	public String id;
	public String name;
	public String optA;
	public String optB;
	public String optC;
	public String optD;
	public String answer;

	
	public Question() {
		
	}
	public Question(String id, 
			String name,String optA, String optB,String optC,String optD,String answer) {
		this.id = id;
		this.name = name;
		this.optA = optA;
		this.optB = optB;
		this.optC = optC;
		this.optD = optD;
		this.answer = answer;
	}
	public static void main(String[] args) {
		

	}

}
