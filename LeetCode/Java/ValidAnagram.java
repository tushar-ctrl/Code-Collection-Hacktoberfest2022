
// simple java solution for valid anagram problem

int[] c = new int[256];
    for (int i = 0; i < s.length(); i++) {
        c[s.charAt(i)]++;
    }
    for (int i = 0; i < t.length(); i++) {
        c[t.charAt(i)]--;
    }
    return Arrays.stream(c).reduce(0, (a, b) -> Math.abs(a) + Math.abs(b)) == 0;
