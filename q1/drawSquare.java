package week1.hw1.git.q1;

import java.util.Scanner;

public class drawSquare {
    //ask for prompt and it will be N and its the length of border
    // the border must be '*' and shape of square
    //inside of square there will be a '+' symbol
    //DONE all
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 0 ; i < n; i++)
        {

            {
                for (int j = 0; j < n; j++) {
                    if(i == 0 || i == n-1 || j == 0 || j == n-1)
                        System.out.print('*');
                    else if((i+j)%2 == 0 )
                    {
                        System.out.print('+');
                    }
                    else
                    {
                        System.out.print(' ');
                    }
                }
            }

            System.out.println();
        }


    }

}
