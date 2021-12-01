package fr.lernejo;

import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {



   
    @Test
    void fact3_vaut_6() {

        int var2=3;
        Sample s=new Sample();

        int facto1=s.fact(var2);

        Assertions.assertThat(facto1).as("fact 0")
            .isEqualTo(6); // (3)

}
    
}
