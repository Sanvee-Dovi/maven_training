package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;



class SampleTest {

    @Test
    void op_Addition() {
        var Sample = new Sample();
        int result = Sample.op(fr.lernejo.Sample.Operation.ADD, 1,2);
        Assertions.assertThat(result)
            .isEqualTo(3);
    }

    @Test
    void op_Multiplication() {
        var Sample = new Sample();
        int result = Sample.op(fr.lernejo.Sample.Operation.MULT, 2,2);
        Assertions.assertThat(result)
            .isEqualTo(4);
    }

    @Test
    void fact_n_negative() {
        var Sample = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(()->Sample.fact(-1))
            .withMessage("N should be positive");
    }

    @Test
    void  fact_n_zero(){
        var Sample = new Sample();
        int result = Sample.fact(0);
        Assertions.assertThat(result)
            .isEqualTo(1);
    }

    @Test
    void  fact_n_superior_to_zero(){
        var Sample = new Sample();
        int result = Sample.fact(3);
        Assertions.assertThat(result)
            .isEqualTo(6);
    }


}
