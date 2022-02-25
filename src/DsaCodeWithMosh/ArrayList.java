package DsaCodeWithMosh;

public class ArrayList {
    private int[] array;
   private int length = 0;
   private int DEFAULT_SIZE = 16;

    public ArrayList (int size){
     array = new int[size];
    }
    public ArrayList (){
        array = new int[DEFAULT_SIZE];
    }

    public void add(int value){
        resizeIfNeeded();
        array[length++] = value;
    }
    public void add(int index,int value){
        if(!checkValidIndexForAdd(index))
            throw new IllegalStateException();
        resizeIfNeeded();
        if(length == index)
            array[length++] = value;
        else {
            for (int i = length; i > index; i--)
                array[i] = array[i - 1];
            array[index] = value;
            length++;
        }
    }
    public void removeAt(int index){
        if(!checkValidIndexForRemove(index))
            throw new IllegalStateException();

            for (int i = index; i < length-1; i++)
                array[i] = array[i +1];
            array[length-- -1] = 0;
    }
    public void removeValue(int value){
        int index = findIndex(value);
        if(!checkValidIndexForRemove(index))
            return;
        removeAt(index);
    }
    public void removeLast(){
        length--;
        array[length] = 0;
    }
    public int findIndex(int value){
        int index = -1;
        for (int i = 0; i < length; i++)
            if(array[i] == value) index = i;
        return index;
    }
    public int length(){
        return length;
    }
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int i = 0; i < length; i++){
            if(i ==0) {
                str.append(array[i]+",");
                continue;
            }
            else if(i == length-1) {
                str.append(" "+array[i]);
                continue;
            }
            else
                str.append(" "+array[i]+",");

        }
        str.append("]");
        return str.toString();
    }
    public void reverse(){
        if(length ==0) return;
        int s= 0, e = length-1;
        while(s<e){
           int temp = array[s];
           array[s++] = array[e];
           array[e--] = temp;
        }
    }
    public int max(){
        int res= Integer.MIN_VALUE;
        if(length ==0) return res;
        for(int i: array)
            if(i > res) res = i;
       return res;
    }
    public ArrayList getIntersection(int[] arr){
        ArrayList ar = new ArrayList(arr.length);
        int counter = 0;
        for(int i = 0; i< length && counter < arr.length; i++)
            if(arr[counter] == array[i])
                ar.add(arr[counter++]);
        return ar;
    }
    private void resize(){
        int[] temp = new int[length*2];
        for(int i=0; i< length; i++)
            temp[i] = array[i];
        array = temp;
    }
    private void resizeIfNeeded(){
        if (array.length == length)
            resize();
    }
    private boolean checkValidIndexForAdd(int index){
        if(index <= length && index >= 0)
            return true;
        else return false;
    }
    private boolean checkValidIndexForRemove(int index){
        if(index < length && index >= 0)
            return true;
        else return false;
    }
}
