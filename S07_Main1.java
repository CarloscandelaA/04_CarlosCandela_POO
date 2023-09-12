package s07_calculadora1;

public class S07_Main1 {

    public static void main(String[] args) {
        S07_calculadora1 calculadora = new S07_calculadora1();

        //suma
        double n1 = 10.0;
        double n2 = 20.0;
        double resultadoSuma = calculadora.sumar(n1, n2);
        System.out.println("10 + 20 = " + resultadoSuma);

        //resta
        double resultadoResta = calculadora.restar(n1, n2);
        System.out.println("10 - 20 = " + resultadoResta);

        //multiplicacion
        double resultadoMultiplicacion = calculadora.multiplicar(n1, n2);
        System.out.println("10 * 20 = " + resultadoMultiplicacion);

        //division
        double resultadoDivision = calculadora.dividir(n1, n2);
        System.out.println("10 / 20 = " + resultadoDivision);
    }
}