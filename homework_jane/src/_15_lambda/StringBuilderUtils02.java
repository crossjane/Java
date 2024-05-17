package _15_lambda;

public interface StringBuilderUtils02 {
	StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2);

;}

	public static StringBuilder appendSb(StringBuilder s1, StringBuilder s2) {
	//	return new StringBuilder().append(s1).append(s2);
		s1.append(s2);
		return s1;
	}
	
	public static StringBuilder reverseSb(StringBuilder sb) {
		sb.reverse();
		return sb;
	}
