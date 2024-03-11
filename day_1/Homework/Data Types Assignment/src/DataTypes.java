import javax.xml.crypto.Data;

public class DataTypes {
    boolean bool1;
    byte byte1;
    char x1;
    short shortKing;
    int num;
    long num2;
    float weAllFloatHere;
    double orNothing;

    public static void main(String[] args) {
        DataTypes useableDataTypes = new DataTypes();

        useableDataTypes.bool1 = true;
        useableDataTypes.byte1 = 1;
        useableDataTypes.x1 = 'x';
        useableDataTypes.shortKing = 12;
        useableDataTypes.num = 312312313;
        useableDataTypes.num2 = 231231312;
        useableDataTypes.weAllFloatHere = 1.1112312313F;
        useableDataTypes.orNothing = 2.1123131331323123;

        System.out.println(useableDataTypes.bool1);
        System.out.println(useableDataTypes.byte1);
        System.out.println(useableDataTypes.x1);
        System.out.println(useableDataTypes.shortKing);
        System.out.println(useableDataTypes.num);
        System.out.println(useableDataTypes.num2);
        System.out.println(useableDataTypes.weAllFloatHere);
        System.out.println(useableDataTypes.orNothing);
    }
}
