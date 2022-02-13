package binary;

import java.util.Scanner;

/**
 *
 * @author LG
 */
public class Binary {
    
    public static void main(String[] args) {
        
    	// 10진수를 2진수로 바꾸기
    	
        System.out.println("정수를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        int i = 0;
        int temp[] = new int[256]; // 2진수를 저장할 배열
        
        // 다음에서 역순으로 비트가 저장됨
        do {
        	temp[i++] = input % 2;
            input /= 2;
        } while(input != 0);
        
        // 다음에서 배열을 역순으로 출력
        while (i > 0) {
        	System.out.print(temp[--i]);
        	if (i % 8 == 0) {
        		System.out.print(" ");
        	}
        }
        System.out.println();
        
    }
    
}
