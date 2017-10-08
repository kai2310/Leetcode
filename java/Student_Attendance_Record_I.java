package leetcode;

public class Student_Attendance_Record_I {
	public boolean checkRecord(String s) {
		if (s.length() <= 1) return true;
		int absent = 0;
		boolean lateLastTime = false;
		int late = 0;
		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i) == 'A') {
				absent += 1;
				if (absent > 1) return false;
				lateLastTime = false;
			} else if (s.charAt(i) == 'L') {
				if (lateLastTime) {
					late += 1;
					if (late > 2) return false;
				} else {
					late = 1;
					lateLastTime = true;
				}
			} else {
				lateLastTime = false;
			}
		}
		return true;
	}
}
