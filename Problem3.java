public class Problem3 {
    public static int pencarianBinary(int[] list, int key) {
        int bawah = 0; 
        int atas = list.length - 1; 

        while (atas >= bawah) { 
            int tengah = (bawah + atas) / 2; 
       
            if (key < list[tengah]){
                atas = tengah - 1;
            }
            else if (key == list[tengah]){
                return tengah;
            }
            else{ 
                bawah = tengah + 1; 
            }
        } 
       return -1; // tidak ditemukan 
    }
    
    public static void main(String args[]) {
        int myArray[] = {5, 8, 12, 15, 17, 23, 26, 30, 34, 38, 42, 54, 64, 78, 81};
        
        int key1 = 30; 
        int key2 = 54; 
        int key3 = 8; 
        int key4 = 12; 
        
        int i = Problem3.pencarianBinary(myArray, key1); 
        int j = Problem3.pencarianBinary(myArray, key2); 
        int k = Problem3.pencarianBinary(myArray, key3);
        int l = Problem3.pencarianBinary(myArray, key4);
        
        System.out.println("Key " + key1 + " Index " + i ); 
        System.out.println("Key " + key2 + " Index " + j );
        System.out.println("Key " + key3 + " Index " + k ); 
        System.out.println("Key " + key4 + " Index " + l ); 
    }
}
