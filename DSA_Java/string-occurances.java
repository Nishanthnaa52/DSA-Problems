import java.util.*;

class Occurances {

	static void addWord(Map<String, Integer> fre, StringBuilder word) {
		if (word.length() == 0) return;

		String w = word.toString();

		if (w.charAt(w.length() - 1) == '-') {
			w = w.substring(0, w.length() - 1);
		}

		if (!w.isEmpty()) {
			fre.put(w, fre.getOrDefault(w, 0) + 1);
		}

		word.setLength(0);
	}

    public static void main(String args[]) {

        String[] chunks = {"hello wor", "ld hello"};
        String[] queries = {"hello", "world", "wor"};

        // Join the string.
        String s = String.join("",chunks);

        System.out.println(s);

        Map<String, Integer> fre = new HashMap<>();
        StringBuilder word = new StringBuilder();

        int n = s.length();

        for (int i = 0; i < n; i++) {

        	char c = s.charAt(i);

        	if (Character.isLowerCase(c)) {
        		word.append(c);
        	}

        	else if (c == '-') {
        		if (word.length() > 0 && i + 1 < n && Character.isLowerCase(s.charAt(i + 1))) {
        			word.append(c);
        		}
        		else {
        			addWord(fre, word);
        		}
        	}
        	else {
        		addWord(fre, word);
        	}

        }

        addWord(fre, word);

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
        	ans[i] = fre.getOrDefault(queries[i], 0);
        } 

        System.out.println(Arrays.toString(ans));
    }
}