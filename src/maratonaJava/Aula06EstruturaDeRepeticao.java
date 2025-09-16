package maratonaJava;

public class Aula06EstruturaDeRepeticao {
    public static void main(String[] args) {
        // while, do while,  for
        // int count = 0;
        
        // System.out.print("==================WHILE=================\n");
        // while (count < 10) { 
        //     try {
        //         Thread.sleep(500);
        //         count++;
        //         System.out.println(count);
        //         if (count == 10) {
        //             break;
        //         }  
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }           
        // }
        
        // System.out.print("==================DO WHILE=================\n");
        // count = 0;
        // do {
        //     try {
        //         Thread.sleep(500);
        //         count++;
        //         System.out.println(count);
        //         if (count == 20) {
        //             break;
        //         }  
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // } while (count < 10);  
        
        System.out.print("==================FOR=================\n");
        for (int i = 0; i < 11; i++) {
            try {
                Thread.sleep(500);
                System.out.println(String.format("%d", i));
                if (i == 10) {
                    break;
                }  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    
    }

}
