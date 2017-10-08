package leetcode;

public class Judge_Route_Circle {
	public boolean judgeCircle(String moves) {
		if (moves.length() == 0) return true;
		if (moves.length() == 1) return false;
		
		int position[] = new int[]{0,0};
		
		for(int i=0;i<moves.length();i++) {
			if(moves.charAt(i) == 'L') {
				position[0] = position[0] -1;
			} else if (moves.charAt(i) == 'R') {
				position[0] = position[0] + 1;
			} else if (moves.charAt(i) == 'U') {
				position[1] = position[1] + 1;
			} else {
				position[1] = position[1] - 1;
			}
		}
		
		return position[0] == 0 && position[1] == 0;
	}
}
