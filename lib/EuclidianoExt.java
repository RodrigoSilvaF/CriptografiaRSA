import java.math.BigInteger;
public class EuclidianoExt {
    public static BigInteger x1,y1,x,y,aux,aux2,aux3,baux,aaux;
    public static int cont=0;

    static BigInteger EExt(BigInteger a, BigInteger b){
        x = new BigInteger("1");
        y = new BigInteger("0");
        x1 = new BigInteger("0");
        y1 = new BigInteger("1");
        baux=b;
        aaux=a;
        do{
            aux=a.remainder(b);
          
            System.out.println(y+"-"+a.divide(b)+"*"+x+"="+y.subtract(x.multiply(a.divide(b)))+" | "+y1+"-"+a.divide(b)+"*"+x1+"="+y1.subtract(x1.multiply(a.divide(b))));

            aux2=x;
            x = y.subtract(x.multiply(a.divide(b)));
            y=aux2;

            aux3=x1;
            x1 = y1.subtract(x1.multiply(a.divide(b)));
            y1=aux3;

            a=b;
            b=aux;

        }while(b.compareTo(BigInteger.ZERO)==1);

        if(y1.compareTo(BigInteger.ZERO)==-1){
            y1=y1.add(baux);
            y=y.subtract(aaux);
        }

        System.out.println("GDC = "+a+"| x = "+y1+" | y = "+y);
        return b;
    }
    
}
