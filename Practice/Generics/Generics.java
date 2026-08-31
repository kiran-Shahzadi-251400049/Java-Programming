import java.util.ArrayList;
public class Generics{
	public static void main(String[] args) {
		Data<Integer> b1=new Data<>(500);
		Data<String> b2=new Data<>("Java");
		Data<Double> b3=new Data<>(500.45);
		Data<Character> b4=new Data<>('$');

		System.out.println("Before Updation: ");
		System.out.println("Integer: "+b1.getValue());
		System.out.println("String: "+b2.getValue());
		System.out.println("Double: "+b3.getValue());
		System.out.println("Character: "+b4.getValue());

		System.out.println("\nUpdating integer Value...");
		b1.setValue(1000);
		b2.setValue("OOP");
		b3.setValue(1500.23);
		b4.setValue('#');


		System.out.println("\nAfter Updation: ");
		System.out.println("Integer: "+b1.getValue());
		System.out.println("String: "+b2.getValue());
		System.out.println("Double: "+b3.getValue());
		System.out.println("Character: "+b4.getValue());

		//As we have already created Student Class in practiceArrayList file which is accessible here
		Student s=new Student("Komal", 5463);
		System.out.println(s);

		System.out.println("\n Object: ....");
		Data<Student> b5=new Data<>(s);//or Data<Student> b5=new Data<>(new Student("Komal", 5463));
		System.out.println("Student: "+b5.getValue());

		System.out.println("\nPracticing ArrayList in Generic Method:...");
		ArrayList<Student> list=new ArrayList<>();
		list.add(s);
		list.add(new Student("Kainat", 8987));

		genericMethod(list);



	}
	public static <T> void genericMethod(ArrayList<T> list){
		for(T temp:list){
			System.out.println(temp);
		}
	}
}

class Data<T>{
	private T value;
    public Data(T value){
     	this.value=value;
    }
    public void setValue(T value){
    	this.value=value;
    }
    public T getValue(){
    	return value;
    }

}

