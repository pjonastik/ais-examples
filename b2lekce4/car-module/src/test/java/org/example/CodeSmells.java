package org.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CodeSmells {
    @Test
    void happyTest() {
        assertThat(true, is(true));
    }

    /* testing multiple things in one test */

    /* looong and unreadable setup */

    /* error handling -> no fail method */


    /* negative tests (error handling) */
    /* readable error messages */
    /* use assertions matchers */




}
