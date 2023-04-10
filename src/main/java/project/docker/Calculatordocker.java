package project.docker;

public class Calculatordocker {
	public int add(int a,int b) {
		return a+b;
	}
	public int diff(int a,int b) {
		return a-b;
	}
	public int multi(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	
 public static void main(String[] args) {
		
				Calculatordocker obj = new Calculatordocker();
				int sum = obj.add(67,34);
				int diff= obj.diff(78,45);
				int multi = obj.multi(67, 5);
				int div = obj.div(14, 7);
				System.out.println(sum);
				System.out.println(diff);	
		        System.out.println(multi);
		        System.out.println(div);
			}
		}

	


