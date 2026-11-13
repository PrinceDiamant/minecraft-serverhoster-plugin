package dev.aichele.serverhoster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RefactorCycle4Test {
    /** Same output as the two inline copies in 2.4.4 backupDownload/fsDownload. */
    @Test void downloadHeaderKeepsNamesAndNeutralisesHeaderBreakouts() {
        assertEquals("attachment; filename=\"backup-lobby-20261113-010000-abc.zip\"",
                Dashboard.contentDisposition("backup-lobby-20261113-010000-abc.zip"));
        assertEquals("attachment; filename=\"a_b_c_d_e\"", Dashboard.contentDisposition("a\"b\\c\rd\ne"));
        assertEquals("attachment; filename=\"Ünïcode welt.dat\"", Dashboard.contentDisposition("Ünïcode welt.dat"));
    }
}
