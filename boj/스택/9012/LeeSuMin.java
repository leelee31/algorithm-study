import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Stack<Character> stack;
		boolean isVPS;
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			isVPS = true;
			stack = new Stack<>();
			String line = br.readLine();

			for (int j = 0, len = line.length(); j < len; j++) {
				if (line.charAt(j) == '(')
					stack.push('(');
				else {
					if (stack.isEmpty())
						isVPS = false;
					else
						stack.pop();
				}

				if (!isVPS) break;
			}

			if (!stack.isEmpty()) isVPS = false;

			sb.append(isVPS ? "YES\n" : "NO\n");
		}

		System.out.print(sb);
	}
}