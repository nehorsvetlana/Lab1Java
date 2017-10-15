package ru.spbstu.telematics.java;
import ru.spbstu.*;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class LabJavaTest extends TestCase {
      @Test
        public void Test1(){
            int lenghtC = LabJava.count();
            String resulting = LabJava.generate();
            if(resulting.length()!=lenghtC) System.out.println("\nTest OK");;
        }

    }
