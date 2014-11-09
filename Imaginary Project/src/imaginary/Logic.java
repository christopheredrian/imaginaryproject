

package imaginary;

import java.text.NumberFormat;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.complex.ComplexFormat;

public class Logic {
    
    
    public static String solve(int a, int b, int n){
        Complex complex = new Complex(a, b);
        complex = complex.pow(n);
        System.out.println(complex);
        return removeZeroValues(complex);
    }
    private static String removeZeroValues(Complex com){
        ComplexFormat cf = new ComplexFormat(NumberFormat.getIntegerInstance(),
                NumberFormat.getIntegerInstance());
        String toReturn = cf.format(com);
        int real = (int)Math.round(com.getReal());
        int imag = (int)Math.round(com.getImaginary()) ;
        if(real == 0 && imag ==0){
            System.out.println("TRUE FIRST");
            return "0";
        }
        System.out.println("Real: " + real);
        System.out.println("Imag: " + imag);
        if(real == 0){
            if(imag == 1)
                return "i";
            if(imag == -1)
                return "-i";
            System.out.println("TRUE SECOND");
           toReturn = Integer.toString(imag) + 'i';
        }
        if(imag == 0){
            System.out.println("TRUE Third");
           toReturn = Integer.toString(real);
        }
        return toReturn;
    }
}
