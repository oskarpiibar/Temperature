package nl.utwente.di.temperature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class testTemperaturer {
    @Test
    public void testBook1() throws Exception {
        Temperaturer quoter = new Temperaturer();
        double price = quoter.getFarenheitTemp(-20);
        Assertions.assertEquals(-4, price, 0.0, "Temperature in Farenheit");

    }
}
