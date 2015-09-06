import java.io.*;
 
public class PRGIFTXSOLXPAN {
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
 
    static int nextInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }
 
    public static void main(String[] args) throws Exception {
        int T = nextInt();
        while (--T >=0) {
            int n = nextInt();
            int k = nextInt();
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                int now = nextInt();
                if (now % 2 == 0) cnt++;
            }
            if (k == 0 && cnt == n) pw.println("NO");
            else pw.println(cnt>=k?"YES":"NO");
        }
        pw.flush();
    }
}
 