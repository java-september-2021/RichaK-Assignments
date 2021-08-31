public class BasicJava{
    public void printNum( int number){
        for(int i = 1 ; i <= number; i++){
            System.out.println("The number is :" + i);  
        }
    }

    public void oddNum(int number){
        for(int i = 1 ; i <= number; i++){
            if(i % 2 == 1){
                System.out.println("The odd number is :" + i);  
            }      
        }

    }

    public int sum(int number){
        int sum = 0;

        for(int i = 1 ; i <= number ; i++){
            sum += i;
        }
        return sum;

    }

    public void iterateThruArray(int [] number){
        for(int i = 0 ; i < number.length; i++){
            System.out.println("The integer on position " + i + " is :  " + number[i]);
        }
    }


    public int findMax(int [] num){

        int maxNum = num[0];
        for(int i = 1; i < num.length; i++){
            if(maxNum < num[i]){
                maxNum = num[i];
            }
        }return maxNum;

    }

    public void oddNumbers(int num){
        int [] newArr = new int[num];
        for(int i = 0 ; i < newArr.length; i++){
            if(i % 2 != 0 ){
                newArr[i] = 2 * i + 1;
                System.out.println(newArr[i]);
            }
        }
    }

    public int getAverage(int [] numArr){
        int sum = 0;
        for(int i = 0; i < numArr.length; i++){
            sum += numArr[i];
        }
        int average = sum/numArr.length;
        return average;
    }

    public int greaterThanY(int [] numArray, int num){
        int count = 0;
        for(int i = 0 ; i < numArray.length; i++){
            if(numArray[i] > num){
                count++;
            }
        }
        return count;

    }

    public void squareValues(int [] numArr){
        for (int i = 0; i < numArr.length; i++){
            //numArr[i] = numArr[i] * numArr[i];
            //numArr[i] = (int)Math.pow(numArr[i], 2);
            System.out.println(numArr[i] + "\t" + (int)Math.pow(numArr[i], 2) );
        }
    }

}