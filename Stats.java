import java.util.Arrays;
public class Stats {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
		int max = Integer.MIN_VALUE;
	for (String arg : args) {
		int value = Integer.parseInt(arg);
    if (value > max) {
        max = value;
    }
	}
	int count = args.length;
	int sum = 0; 
	int min = Integer.parseInt(args[0]);
	for (int i = 0; i < args.length; i++) {
		sum = sum + Integer.parseInt(args[i]);
	}
	for (int i = 1; i < args.length; i++) {
	if (Integer.parseInt(args[i]) < min) {
		min = Integer.parseInt(args[i]);
	}
}
	
	double avg = (double) sum / count;
System.out.println("Count: " + count);
System.out.println("Sum: " + sum);
System.out.println("Min: " + min);
System.out.println("Max: " + max);
System.out.println("Average: " + avg);
}
}

