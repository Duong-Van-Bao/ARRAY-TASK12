import java.util.Scanner;

public class XuLy {
	final static int MIN = -100;
	final static int MAX = 100;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = taoMang(n);
        xuatMang(a);
        printMaxRun(a);
	}

	public static int[] nhapMang(Scanner scan, int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập n > 1");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}

	public static void printMaxRun(int a[]) {
		int head = 0;
		int maxHead = 0;
		int maxLen = 0;
		do {
			int i;
			int len = 1;
			for (i = head; i < a.length - 1 && a[i] < a[i + 1]; i++) {
				len++;
			}
			if (len > maxLen) {
				maxLen = len;
				maxHead = head;
			}
			head = i + 1;
		} while (head < a.length);
		System.out.println("Run dài nhất là");
		for (int i = 0; i < maxLen; i++) {
			System.out.println(a[maxHead + i] + "\t");
		}
	}
}
