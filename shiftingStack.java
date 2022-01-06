import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class ShiftStack
{

	static class FastReader
	{

		BufferedReader br;
		StringTokenizer st;

		public FastReader(){

			br = new BufferedReader(new InputStreamReader(System.in));
				}

		String next(){
			while (st == null || !st.hasMoreElements()) {

				try
				{
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
				return st.nextToken();

		}

		 int nextInt(){

			return Integer.parseInt(next());

		}

		long nextLong(){

			return Long.parseLong(next());

		}

		String nextLine(){

			String str = "";

			try
			{
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

			return str;
			}

	}

	public static void main(String args) {

		try {

		FastReader in = new FastReader();
		
		int t = in.nextInt();
		
		while (t -- > 0) {

			int n = in.nextInt();
			int i = n;
			int[] arr = new int[n];
			long sum = 0;
			while (i -- > 0) {
				int  stack = in.nextInt(); 
				sum += stack;
			}

			while(i < n) {
				
				if (i == (n-1)) {
					arr[i] = (int) sum;
					continue;
				}
				arr[i] = i;
				sum -= i;
			}

			if (arr[i -1] >= i -1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

		} catch (Exception e) {}
	}


}

