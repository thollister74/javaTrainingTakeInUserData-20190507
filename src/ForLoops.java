import static java.lang.System.out;

public class ForLoops {
    public void myLoop (String[] args) {

        int[] randomNumbers = {98, 0, 41, 3, 5, 82, 978, 323, 38, 915};
        System.out.println(randomNumbers.length);
        for (int i : randomNumbers) {
            System.out.println(i);
        }
    }
}
