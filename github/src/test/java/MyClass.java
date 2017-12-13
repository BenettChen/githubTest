import java.util.HashSet;

/**
 * Author:chenpeng09@meituan.com
 * Date: 2017/12/13.
 * Time: 上午10:13.
 **/
public class MyClass {
    public static void main(String[] args) {
        HashSet<Phone> pSet = new HashSet<>();
        for (int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                pSet.add(new Phone(i,j));
            }
        }
        System.out.println(pSet.size());
    }


}

class Phone{
    private int prxNum;
    private int numLine;

    public Phone(int prxNum, int numLine) {
        this.prxNum = prxNum;
        this.numLine = numLine;
    }


//    @Override
    public boolean equals(Phone o) {

        Phone phone = (Phone) o;

        return numLine == phone.numLine && prxNum != phone.prxNum;
    }

    @Override
    public int hashCode() {
        int result = prxNum;
        result = 31 * result + numLine;
        return result;
    }
}