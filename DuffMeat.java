import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class DuffMeat {

    public static void main(String[] args) {
        FastReader in = new FastReader();
        int n = in.nextInt();
	int cost = 0;
	int price = 101;
        
	while (n -- > 0) {
		int m = in.nextInt();
		int p = in.nextInt();
		if (price > p)
			price = p;
		cost += m * price;
	}

	System.out.println(cost);	
 }


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

    }
}
