import java.util.*;

public class Ex1101 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("나누고싶은 숫자를 입력하세요 : ");
		int num = s.nextInt();
		int arr[] = new int [5];
		
		//try블록
		try {
			arr[num] = 10 / num;
			System.out.println("10/n = " + arr[num]);
		}
		catch(ArithmeticException e) {
			System.out.println("0이 아닌 값을 입력하세요!");
			System.out.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("올바른 인덱스를 입력하세요 [0,5).");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("올바를 숫자를 입력하세요.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("예외 발생 여부와 상관없이 항상 실행됩니다.");
		}
		System.out.println("try-catch 블록의 외부 문장입니다.");
	}

}
