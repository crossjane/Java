package _15_lambda;

public class _02_middle02 {

	public static void main(String[] args) {
	
			// TODO Auto-generated method stub
			
			Printcombine((s1, s2) -> {
				StringBuilder strb = new StringBuilder();
				strb.append(s1).append(s2);
				System.out.println(strb.reverse());
				
			return strb;
				
			});
			
			
				
		
			
	}
		
		
		public static StringBuilder Printcombine(StringBuilderUtils stringBuilderUtils) {
			
			
			StringBuilder strb1 = new StringBuilder();
			strb1.append("안녕");
			
			StringBuilder strb2 = new StringBuilder();
			strb2.append("바보야");
			
			
			
			StringBuilder result = stringBuilderUtils.combineStrBuilder(strb1,  strb2);
			
			s1.append(s2);
			sb.reverse();
			
			return
			}
			
			public static StringBuilder appendSb(StringBuilder s1, StringBuilder s2) {
				s1.append(s2);
				return s1;
			}
			
			public static StringBuilder reverseSb(StringBuilder sb) {
				sb.reverse();
				return sb;
			}
			
		
	}
