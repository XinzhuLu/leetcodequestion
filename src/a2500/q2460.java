package a2500;

/**
 * @description: ???
 * Created by 馨竹 on 2023/03/21
 * --------------------------------------------
 * Update for ??? on ???? / ?? / ?? by ???
 **/
public class q2460 {

    public static void main(String[] args) {

        //TODO 2460




        //TODO 2461




        //TODO 2462




        //TODO 2463




        //TODO 2464




        //TODO 2465




        //TODO 2466




        //TODO 2467




        //TODO 2468




        //TODO 2469
/* You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].Return the array ans. Answers within 10-5 of the actual answer will be accepted.*/




    }

    public static double[] convertTemperature(double celsius) {

        double kelvin = 0;
        double fahrenheit = 0;

        kelvin = celsius + 273.15;
        fahrenheit = celsius * 1.80 +32.00;

        double[] ans = {kelvin , fahrenheit};

        return ans;
    }
}
