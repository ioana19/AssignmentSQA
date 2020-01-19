package com.tema;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProfesorTest {

    @Test
    public void getMaterie() {
        assertEquals(7, new Profesor("matematica","popescu cristi",7).getExperienta_ani());
    }
}