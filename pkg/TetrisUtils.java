package pkg;

public class TetrisUtils {
    public static int[] generateBlock(){
		return new int[10];
    }

	public static String[][] generateGrid(){
		String[][] arr = new String[20][30];
		for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
				if(i == 0 || i == arr.length-1 || j == 0 || j == arr[0].length-1){
					arr[i][j] = "#";
				}
				else{
					arr[i][j] = " ";
				}
            }
        }
		return arr;
	}

	public static void step(String[][] arr){
		
	}
}
