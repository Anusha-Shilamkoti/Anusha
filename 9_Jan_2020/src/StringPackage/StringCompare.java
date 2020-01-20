package StringPackage;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = { 'A', 'n', 'u', 's', 'h', 'a' };
		char[] p = { 'A', 'n', 'u', 's', 'h' };
		int r = 0;
		if (a.length == p.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == p[i]) {
					r++;
				}
			}
			System.out.println(r);
			if (r == a.length) {
				System.out.println("Strings are equal");
			} else {
				System.out.println("Strings are not equal");
			}

		} 
		else
			System.out.println("Strings are not equal");

	}

}
