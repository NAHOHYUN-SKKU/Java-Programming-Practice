package test;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.print("Input decimal number : ");
		Scanner scn = new Scanner(System.in);
		int a, copy, i = 0;
		int ori = scn.nextInt();
		int[] array = {2, 8, 16};
		int[] array1 = new int[100];
		for(int number : array)
		{
			if(number == 2)
				System.out.print("Binary number : ");
			else if (number == 8)
				System.out.print("Octal number : ");
			else if (number == 16)
				System.out.print("Hexadecimal number : ");
			
			copy = ori;
			while(copy != 0)
			{
				a = copy % number;
				array1[i] = a;
				copy = copy / number;
				i++;
			}
			i--;
			while(i != -1)
			{
				switch(array1[i]){
				case 10:
					System.out.print('a');
					break;
				case 11:
					System.out.print('b');
					break;
				case 12:
					System.out.print('c');
					break;
				case 13:
					System.out.print('d');
					break;
				case 14:
					System.out.print('e');
					break;
				case 15:
					System.out.print('f');
					break;
				default:
					System.out.print(array1[i]);
					break;
				}
				i--;
			}
			i = 0;
			System.out.println("");
		}
	}

}
