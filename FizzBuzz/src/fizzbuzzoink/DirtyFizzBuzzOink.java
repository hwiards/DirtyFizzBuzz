package fizzbuzzoink;

public class DirtyFizzBuzzOink {
	public static void main(String[] args) {
		for (int i = 1, stringFlag = 0; i <= 100; System.out.printf(i % 3 == 0 ? "Fizz" : "", i % 3 == 0 ? stringFlag = 1 : ""), System.out.printf(i % 5 == 0 ? "Buzz" : "", i % 5 == 0 ? stringFlag = 1 : ""), System.out.printf(i % 7 == 0 ? "Oink" : "", i % 7 == 0 ? stringFlag = 1 : ""), System.out.print((stringFlag == 1) ? "" : i), System.out.println(), stringFlag = 0, i++);
	}
}
