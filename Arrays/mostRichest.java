public class mostRichest {
  public static void main(String[] args) {
    int rich[][] = {{1,2,3}, {2,3,4},{3,6,7}};

    int maxWealth = 0;
    for(int i = 0; i<rich.length; i++){
      int sum = 0;
      for(int j= 0; j<rich[i].length; j++){
          sum += rich[i][j];
      }
      maxWealth = Math.max(maxWealth, sum);

    }
    System.out.println(maxWealth+"");
  }
}
