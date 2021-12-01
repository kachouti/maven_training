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
    
    @Test
    void  op_add_2_1_equal_3() {
         int var2=2 ;
        int var1=1;
        Sample s=new Sample();
      Operation op1=Operation.ADD;
        int op_add=s.op(op1,var1,var2);

        Assertions.assertThat(op_add).as("2 add 1 equal 3")
            .isEqualTo(3); 

    }
    
@Test
    void  op_mult_2_1_equal_2() {
         int var2=2 ;
        int var1=1;
        Sample s=new Sample();
      Operation op1=Operation.MULT;
        int op_mult=s.op(op1,var1,var2);

        Assertions.assertThat(op_mult).as("2 mult 1 equal 2")
            .isEqualTo(2); 

    }
    
}
