package binary;

import java.util.Scanner;

/**
 *
 * @author LG
 */
public class Binary {
    
    public static void main(String[] args) {
        
    	// 10������ 2������ �ٲٱ�
    	
        System.out.println("������ �Է��ϼ���.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        int i = 0;
        int temp[] = new int[256]; // 2������ ������ �迭
        
        // �������� �������� ��Ʈ�� �����
        do {
        	temp[i++] = input % 2;
            input /= 2;
        } while(input != 0);
        
        // �������� �迭�� �������� ���
        while (i > 0) {
        	System.out.print(temp[--i]);
        	if (i % 8 == 0) {
        		System.out.print(" ");
        	}
        }
        System.out.println();
        
    }
    
}
