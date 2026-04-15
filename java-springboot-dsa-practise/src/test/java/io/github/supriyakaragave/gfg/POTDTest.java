package io.github.supriyakaragave.gfg;

import io.github.supriyakaragave.HashMapHashSetProblems;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class POTDTest {

    POTD gfgPotdProblems = new POTD();

    @ParameterizedTest
    @ValueSource(strings = {" hello world ","i love programming","Mr Benedict Cumberbatch",
            "qxkpvo  f   w vdg t wqxy ln mbqmtwwbaegx   mskgtlenfnipsl bddjk znhksoewu zwh bd fqecoskmo",
            " ","abc","  ",""})
    void URLify(String s) {
        System.out.println(gfgPotdProblems.URLify(s));
    }
}