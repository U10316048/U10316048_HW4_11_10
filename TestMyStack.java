/*U10316048 劉信佑*/
import java.util.*;//import java.util

public class TestMyStack{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);//Create a Scanner
		NewMyStack ob = new NewMyStack();//Create a object
		for(int i = 1;i<=5;i++){
			System.out.print("Please input a string: ");
			String s = input.next();
			ob.push(s);
		}//for loop to input five strings to Arraysuper
		while(!ob.isEmpty()){
			System.out.print(ob.pop()+" ");
		}//print out all strings which stored in Arraysuper
	}//Main method
}

class NewMyStack extends ArrayList<Object>{
  //Extends ArrayList and modify it
  public boolean isEmpty() {
    return super.isEmpty();
  }

  public int getSize() {
    return super.size();
  }

  public Object peek() {
    return super.get(getSize() - 1);
  }

  public Object pop() {
    Object o = super.get(getSize() - 1);
    super.remove(getSize() - 1);
    return o;
  }//sort the string 's method

  public Object push(Object o) {
    return super.add(o);
  }//add string to arraylist 's method


  @Override /** Override the toString in the Object class */
  public String toString() {
    return "stack: " + super.toString();
  }
}
