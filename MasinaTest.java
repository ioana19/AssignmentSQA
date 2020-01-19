package com.tema;

import org.junit.Test;

import static org.junit.Assert.*;

public class MasinaTest {

    @Test
    public void constructorTest() {
        String firma="BMW";
        int an=2002;
        String culoare="Negru";

        Masina a = new Masina(firma,an,culoare);
        assertEquals(firma,a.getFirma());
        assertEquals(an,a.getAn());
        assertEquals(culoare,a.getCuloare());
    }

}