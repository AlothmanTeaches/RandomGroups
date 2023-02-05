import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomGroups {
  public static void main(String[] args) {
    System.out.println("Main works");
    ArrayList arr = studentReader();
    System.out.println(arr);
  }
  
  public static ArrayList<String> studentReader(){
    ArrayList studenArrayList = new ArrayList<>();

    try {
      File stufile = new File("Student List.txt");
      Scanner sc = new Scanner(stufile);

      while(sc.hasNextLine()){
        studenArrayList.add(sc.nextLine());
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return studenArrayList;
  }
}
