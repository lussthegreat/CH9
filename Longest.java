public class Longest {

	public static void main(String[] args) {
		String longest = args[0];
        String firstAlphabetically = args[0];

        for (int i = 1; i < args.length; i++) {
            String current = args[i];
            if (current.length() > longest.length()) {
                longest = current;
            }

           
            if (current.compareTo(firstAlphabetically) < 0) {
                firstAlphabetically = current;
            }
        }
        System.out.println("Longest: " + longest + " (" + longest.length() + " letters)");
        System.out.println("First alphabetically: " + firstAlphabetically);
    }
}
