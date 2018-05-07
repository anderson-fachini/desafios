package euler.problems.here;

import java.util.List;

import euler.problems.Problem;

public class P003 implements Problem {

	@Override
	public String solve(List<String> input) {
		StringBuilder ret = new StringBuilder();
		input.forEach(i -> {
			String[] splitted = i.split("\\|");
			ret.append(replace(splitted[0], splitted.length > 1 ? splitted[1] : "")).append("\r\n");
		});
		return ret.toString();
	}

	private static String replace(String base, String rep) {
		if (rep.equals(""))
			return base;

		StringBuilder ret = new StringBuilder(base.length());
		StringBuilder copy = new StringBuilder(rep.length());
		int baseLength = base.length();
		int repLength = rep.length();

		for (int i = 0; i < baseLength; i++) {
			copy.append(base.charAt(i));

			boolean isEquals = true;
			for (int j = 0; j < copy.length(); j++) {
				if (copy.charAt(j) != rep.charAt(j)) {
					isEquals = false;
				}
			}

			boolean isSameLength = copy.length() == repLength;
			
			if (!isSameLength && !isEquals) {
				ret.append(copy.toString());
				copy.setLength(0);
			}
			if (isSameLength) {
				if (isEquals) {
					copy.setLength(0);
				} else {
					ret.append(copy.charAt(0));
					if (repLength > 1) {
						copy = copy.deleteCharAt(0);
					} else {
						copy.setLength(0);
					}
				}
			}
		}

		ret.append(copy.toString());

		return ret.toString();
	}

}
