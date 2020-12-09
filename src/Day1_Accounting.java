import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1_Accounting {
    public static void main(String[] args) throws FileNotFoundException {
        String workingDir = System.getProperty("user.dir");
        Scanner s = new Scanner(new File(workingDir+File.separator+"input//day1.txt"));
        System.out.println("Reading file...");

        ArrayList<java.lang.Integer> input = new ArrayList<>();


            while (s.hasNext()) {
                input.add(Integer.parseInt(s.nextLine()));
            }
        System.out.println(input.size());
        for (int i = 0; i < input.size(); i++) {
            for (int j=i+1; j < input.size(); j++ ) {
               for (int k=j+1; k < input.size(); k++ ) {
                if (input.get(i) + input.get(j) + input.get(k) == 2020) {
                    System.out.println(input.get(i));
                    System.out.println(input.get(j));
                    System.out.println(input.get(k));
                    System.out.println(input.get(i) * input.get(j) * input.get(k));
                }
                }
                }
            }
    }

}
