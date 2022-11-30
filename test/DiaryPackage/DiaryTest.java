package DiaryPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;

    @BeforeEach
    void setUp() {
         diary = new Diary("Adewunmi", "correctPassword");
    }

    @Test
    void diaryExistTest() {
        assertNotNull(diary);
    }

    @Test
    void newDiaryIsLocked() {
       assertTrue(diary.isLocked());
    }

    @Test
    void lockedDiaryCanBeUnlockedTest() {
        assertTrue(diary.isLocked());
        diary.unlockWith("correctPassword");
        assertFalse(diary.isLocked());
    }

    @Test
    public void wrongPasswordCannotUnlockDiaryTest() {
        assertTrue(diary.isLocked());
        diary.unlockWith("wrongPassword");
        assertTrue(diary.isLocked());
    }

    @Test
    void diaryCanBeLockedTest(){
        diary.unlockWith("correctPassword");
        diary.lock();
        assertTrue(diary.isLocked());
    }

    @Test
    void happeningsCanBeAddedToTheDiaryTest() {
        diary.unlockWith("correctPassword");

        diary.write("Jesus loves me, this I know.",
                "For the Bible tells me so. Little ones to him belong");

        assertEquals(1,diary.numberOfEntries());
    }

    @Test
    void entriesCannotBeAddedWhenDiaryIsLockedTest() {
        diary.isLocked();
        diary.write("Jesus loves me, this I know.",
                "For the Bible tells me so. Little ones to him belong");

        assertEquals(0,diary.numberOfEntries());
    }

    @Test
    void canFindEntriesUsingIdTest() {
        diary.unlockWith("correctPassword");
       assertFalse(diary.isLocked());
        diary.write("Jesus loves me, this I know.",
                "For the Bible tells me so. Little ones to him belong");
        assertEquals(1,diary.numberOfEntries());

        Entry foundEntry = diary.findEntryWithId(1);

        assertEquals(1,diary.numberOfEntries());
        assertEquals("Jesus loves me, this I know.", foundEntry.getTitle());
        assertEquals("For the Bible tells me so. Little ones to him belong", foundEntry.getMessage());

    }
}
