package com.tema;

import org.junit.Test;

import static org.junit.Assert.*;

public class FilmeTest {

    @Test
    public void vechime() {
        Filme f = new Filme("Room",2015,13000000);
        int vechime=2020-f.an;
        assertEquals(vechime,f.vechime());
    }
}