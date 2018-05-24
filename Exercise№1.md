# Java-Elementary-Lesson1-
public class Test1 {
	public static void main (String [] args) {
		
		for (int i=100; i>=0; i--) { 
		/* с помощью цикла
		for делаем перебор чисел от 100 до 0.
		*/
			if (i%3==0){ // выводим числа кратные 3
			System.out.println(i);
			} else if (i%5==0){ // если число кратное 5
			// то вместо него выводим слово test
				System.out.println("test");
			}
		} 	
	}
}
