import java.text.CharacterIterator;

public class last_class {
    public static void main(String[] args){
        // int long string float double char boolean
        // int - 4 byte - 0000.....32bits --> -2^31 to 2^31  -- 1 is reserved for positive or negative
        // short - 2 byte
        // long - 8 byte
        // float - 4 byte
        // double - 8 byte
        // char - 2 byte
        // boolean - 1 bit -> true/false -> 1/0

        // 1 byte - 8 bit

        // String "Hello" - 10bytes
        //         "Hello World" - 22 bytes

        // 1MB -  MegaBytes
        // 1Mb -  MegaBits

        // 100Mbps -> 100/8 -> 12.5 
        
        // 1Gbps -> 1000/8 MBps


        // variable - it can store value;


        // 128 charecters -> integer value -> ASCII code of CharacterIterator 
        // A - 65, a - 97;

        for(int i=0; i<10; i++){
            for(int j=0; j<i; j++ ){
                System.out.println(j);
            }
            // System.out.println(i);
        }


    }
    
}
