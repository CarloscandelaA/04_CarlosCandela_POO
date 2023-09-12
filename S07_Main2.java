package S07_calculadora2;

public class S07_Main2 {

    public static void main(String[] args) {
        S07_calculadora2 calculadora = new S07_calculadora2();

        //suma
        int n1 = 10;
        int n2 = 20;
        int resultadoSuma = calculadora.sumar(n1, n2);
        System.out.println("10 + 20 = " + resultadoSuma);

        //resta
        int resultadoResta = calculadora.restar(n1, n2);
        System.out.println("10 - 20 = " + resultadoResta);

        //multiplicación
        int resultadoMultiplicacion = calculadora.multiplicar(n1, n2);
        System.out.println("10 * 20 = " + resultadoMultiplicacion);

        //división
        int resultadoDivision = calculadora.dividir(n1, n2);
        System.out.println("10 / 20 = " + resultadoDivision);
    }
}