import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomGroups {
  public static void main(String[] args) {
    System.out.println("Main works");
    ArrayList<String> arr = studentReader();
    System.out.println(arr);
  }
  
  public static ArrayList<String> studentReader(){
    ArrayList<String> studenArrayList = new ArrayList<String>();
    System.out.println("2nd dev was here");
    try {
      File stufile = new File("Student List.txt");
      Scanner sc = new Scanner(stufile);

      while(sc.hasNextLine()){
        studenArrayList.add(sc.nextLine());
      }
      sc.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return studenArrayList;
  }
}
