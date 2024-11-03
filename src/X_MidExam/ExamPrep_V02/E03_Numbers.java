package X_MidExam.ExamPrep_V02;

import java.util.*;
import java.util.stream.Collectors;

public class E03_Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listOfTopElements = new ArrayList<>();
        double sumofElements = getSumofElements(list);
        double averageElementValue = sumofElements / list.size();
        findTopNumbers(list, listOfTopElements, averageElementValue);
        if (listOfTopElements.isEmpty()) {
            System.out.println("No");
        }
    }

    private static void findTopNumbers(List<Integer> list, List<Integer> listOfTopElements, double averageElementValue) {
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index) > averageElementValue) {
                listOfTopElements.add(list.get(index));
            }
        }
        Collections.sort(listOfTopElements, Collections.reverseOrder());
        if (listOfTopElements.size() > 5) {
            listOfTopElements = listOfTopElements.subList(0, 5);
        }
        System.out.println(listOfTopElements.toString().replaceAll("[\\[\\],]", ""));
    }

    private static int getSumofElements(List<Integer> list) {
        int sumOfElements = 0;
        for (int index = 0; index < list.size(); index++) {
            sumOfElements += list.get(index);
        }
        return sumOfElements;
    }
}
