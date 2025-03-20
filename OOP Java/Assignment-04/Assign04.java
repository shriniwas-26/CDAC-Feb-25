/*
Q4. Complex Number Operations 
Create a class to represent complex numbers. Include the following constructors: 
1.  A default constructor that sets both real and imaginary parts to 0 
2.  A constructor that initializes the real part only 
3.  A constructor that initializes both real and imaginary parts 
Also, write member functions to: 
●  Add two complex numbers 
●  Multiply two complex numbers 
In the main() method: 
●  Create two complex numbers: 3 + 2i and 4 - 2i 
●  Display their sum and product
*/
class ComplexNumber {
    private double real; 
    private double imaginary; 

    
    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    
    public ComplexNumber(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

   
    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }

   
    @Override
    public String toString(){
        return (real + " + " + imaginary + "i");
    }
}
class Assign04{

        public static void main(String[] args){
            ComplexNumber num1 = new ComplexNumber(3, 2);
            ComplexNumber num2 = new ComplexNumber(4, -2);

            
            ComplexNumber sum = num1.add(num2);
            System.out.println(sum);

            
            ComplexNumber product = num1.multiply(num2);
            System.out.println(product);
        }
        
}