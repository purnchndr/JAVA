 /*
  * @Author: Purnachandra Pratap Nishad
  * @Email : purnchndr7@gmail.com
  * */
package Use;

class PolynomialsElement{
    int number = 0;
    int coefficient = 0;
    public PolynomialsElement(int coefficient, int number){
        this.coefficient = coefficient;
        this.number = number;
    }
}

public class AddTwoPolynomials {
    PolynomialsElement[] result;
    int size = 0;

    /*
     * @Description: To Calculate the input arrays
     * @param : PolynomialsElement Arrays
     * @Return : Void
     * */
    public void addPolynomials(PolynomialsElement[] inputA, PolynomialsElement[] inputB){
        int lengthOfA = inputA.length;
        int lengthOfB = inputB.length;
        int maxLength = Math.max(lengthOfA,lengthOfB);
        this.result = new PolynomialsElement[maxLength];
        if(lengthOfA < lengthOfB){
            this.fillResultArray(inputA, inputB);
        }
        else {
            this.fillResultArray(inputB, inputA);
        }
    }

    /*
     * @Description: To fill the result array
     * @param : PolynomialsElement Arrays
     * @Return : void
     * */
    public void fillResultArray(PolynomialsElement[] inputA, PolynomialsElement[] inputB){
        int lengthOfA = inputA.length;
        int lengthOfB = inputB.length;
        for( int i = 0; i < lengthOfA; i++){
            int coefficient = inputA[i].coefficient + inputB[i].coefficient;
            int number = inputA[i].number + inputB[i].number;
            result[size++] = new PolynomialsElement(coefficient,number);
        }
        for(int j = size; j < lengthOfB; j++)
            result[size++] = new PolynomialsElement(inputB[j].coefficient,inputB[j].number);
    }

    /*
     * @Description: To Print the Result array
     * @Return : Array data in String format
     * */
    @Override
    public String toString(){
        StringBuilder resultString = new StringBuilder();
        resultString.append("[ ");
        for(int i = 0; i< result.length; i++)
            resultString.append("[").append(result[i].coefficient).append(":").append(result[i].number).append(" ]").append(", ");

        resultString.append("]");
        return resultString.toString();
    }


    /*
    * @Description: To Print the input array
    * @param : PolynomialsElement Array
    * @Return : Array data in String format
    * */
    public static String print(PolynomialsElement[] input){
        StringBuilder resultString = new StringBuilder();
        resultString.append("[ ");
        for(int i  =0; i < input.length; i++)
            resultString.append("[").append(input[i].coefficient).append(":").append(input[i].number).append(" ]").append(", ");
        resultString.append("]");
        System.out.println(resultString);
        return resultString.toString();
    }


    /*
     * @Description: Main Method
     * @param : None
     * @Return : Void
     * */
    public static void main(String[] args) {
        //Change to input A according to taste-cases
        PolynomialsElement[] inputA = { new PolynomialsElement(0,5),
                                        new PolynomialsElement(0,0),
                                        new PolynomialsElement(0,10),
                                        new PolynomialsElement(0,6),
                                        new PolynomialsElement(0,12),};

        //Change to input B according to taste-cases
        PolynomialsElement[] inputB = { new PolynomialsElement(0,1),
                                        new PolynomialsElement(0,2),
                                        new PolynomialsElement(0,4),};

        //This Method prints the Input A
        System.out.println("Input A is : ");
        print(inputA);
        System.out.println();

        //This Method prints the Input B
        System.out.println("Input B is : ");
        print(inputB);
        System.out.println();

        //AddTwoPolynomials Object creation
        AddTwoPolynomials polynomialObject = new AddTwoPolynomials();

        //This Methode calculate the result and store in result Array
        polynomialObject.addPolynomials(inputA, inputB);

        //Printing the result Array
        System.out.println("Result is:");
        System.out.println(polynomialObject);

    }

}
