package function_and_Array_3;
import java.util.*;
import java.io.*;

public class PrefixSum_Problem {
	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length 
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}
			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}

	static Reader sc = new Reader();
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	/*You have an array filled with zeros and n queries (L, R) where every time arr[L] and arr[R] increment by 1; 
	 * input arr.size() = 4
	 * no. of queries = 2
	 * (1, 2), (2, 3)
	 * Output: 0 1 2 1
	 * */

	public static void main(String args[]) throws IOException {
		double start = System.currentTimeMillis();
		// Start Coding Here............
		int n = inputInt();
		int[] arr = new int[n];
		
		int q = inputInt();
		while(q > 0) {
			int l = inputInt();
			int r = inputInt();
			arr[l]++;
			
			if((r + 1) < arr.length) {
				arr[r + 1]--;
			}
			
			q--;
		}
		
		for(int i = 1; i<arr.length; i++) {
			arr[i] += arr[i - 1];
		}
		
		print(arr);
		

		//end
		double end = System.currentTimeMillis();
		double duration = end - start;
		duration /= 1000;
		System.out.println("\nExecution end in : " + duration + " second.");
		bw.flush();
		bw.close();
	}

	public static int inputInt() throws IOException {
		return sc.nextInt();
	}

	public static long inputLong() throws IOException {
		return sc.nextLong();
	}

	public static double inputDouble() throws IOException {
		return sc.nextDouble();
	}

	public static String inputString() throws IOException {
		return sc.readLine();
	}

	public static void print(String a) throws IOException {
		bw.write(a);
	}
	public static void print(int[] a) throws IOException {
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void printSp(String a) throws IOException {
		bw.write(a + " ");
	}

	public static void println(String a) throws IOException {
		bw.write(a + "\n");
	}

}
