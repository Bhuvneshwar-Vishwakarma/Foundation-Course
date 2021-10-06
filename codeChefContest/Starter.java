package codeChefContest;
import java.util.*;
import java.io.*;

public class Starter {
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

	public static void main(String args[]) throws IOException {
		double start = System.currentTimeMillis();
		// Start Coding Here............
		int t = inputInt();
		while(t > 0) {
			int n = inputInt(); int m = inputInt();
			
			int x = inputInt(); int y = inputInt();
			
			String[][] arr = new String[n][m];
			
			for(int i = 0; i<n; i++) {
				for(int j = 0; j<m; j++) {
					arr[i][j] = inputString();
				}
				
			}
			int cpass = 0; // complete pass
			int p = 0;// partialy pass
			int u = 0;// fail
			
			for(int i = 0; i<n; i++) {
				for(int j = 0; j<m; j++) {
					if(arr[i][j] == "P") {//partial
						p++;
						if(p >= y) {
							System.out.print(1);
							return;
						}
						
					}else if(arr[i][j] == "F") {// complete
						cpass++;
						if(cpass >= (x - 1)) {
							System.out.print(1);
							return;
						}
					}else {// Unsolved
						u++;
						if(u >= arr[0].length - 1) {
							System.out.print(0);
							return;
						}
						
					}
				}
				
			}
				
			t--;
		}
		

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

	public static void printSp(String a) throws IOException {
		bw.write(a + " ");
	}

	public static void println(String a) throws IOException {
		bw.write(a + "\n");
	}

}
