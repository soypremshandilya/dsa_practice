public class lessThanPaitees {
  public static void main(String[] args) {
    int[] marks = {11,23,45,33,56,14};
    int target = 35;
    for (int i= 0; i<marks.length; i++){
      if(marks[i] < target)
        System.out.println(i);
   }
  }
}
