package home.temp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Sort3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int N = Integer.parseInt(br.readLine()); 
	 
	    Integer[][] arr = new Integer[N][2];
		
	    for(int i=0; i<N; i++) {
	    	Integer[] inner = new Integer[2];
        	String[] str = br.readLine().split(" ");
        	inner[0] = Integer.parseInt(str[0]);
        	inner[1] = Integer.parseInt(str[1]);
        	arr[i] = inner;
        }
	    
		Arrays.sort(arr, (o1, o2) -> {
			if(o1[1].equals(o2[1])) {
				return Integer.compare(o1[0], o2[0]);
			}else {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    for(int i=0, iLen = arr.length; i<iLen; i++) {
	    	for(int j=0, jLen = arr[i].length; j<jLen; j++) {
	    		bw.write(String.valueOf(arr[i][j]));
	    		if(j == 0) bw.write(" ");
	    	}
	    	if(i<iLen-1) bw.write("\n");
	    }

	    br.close();
	    bw.flush();
	    bw.close();
	}
}
