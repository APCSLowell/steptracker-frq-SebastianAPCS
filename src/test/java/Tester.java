

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class Tester {

   @Test
   public void partA () {
      StepTracker tr = new StepTracker(10000);
      assertEquals(0,tr.activeDays());
      assertEquals(0,tr.averageSteps(),0.01);
      tr.addDailySteps(9000);
      tr.addDailySteps(5000);
      assertEquals(0,tr.activeDays());
      assertEquals(7000,tr.averageSteps(),0.01);
      tr.addDailySteps(13000);
      assertEquals(1,tr.activeDays());
      assertEquals(9000,tr.averageSteps(),0.01);
      tr.addDailySteps(23000);
      tr.addDailySteps(1111);
      assertEquals(2,tr.activeDays());
      assertEquals(10222.2,tr.averageSteps(),0.01);
   }




}
