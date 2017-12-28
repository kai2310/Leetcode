package leetcode;

public class Hamming_Distance {
	public int hammingDistance(int x, int y) {
		int xbits[] = new int[32];
		int ybits[] = new int[32];
		
		for(int i=0;i<xbits.length;i++) {
			xbits[i] = 0;
			ybits[i] = 0;
		}
		
		int start = 0;
		while (x > 0) {
			xbits[start] = x%2;
			x = x/2;
			start = start + 1;
		}
		
		start = 0;
		while(y > 0) {
			ybits[start] = y%2;
			y = y/2;
			start = start + 1;
		}
		
		int differentBits = 0;
		for(int i=0;i<xbits.length;i++) {
			if (xbits[i] != ybits[i]) differentBits = differentBits + 1;
		}
		
		return differentBits;
	}

}
