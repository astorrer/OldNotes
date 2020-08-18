package net.storrer.oldnotes.utilities;

import net.storrer.oldnotes.model.NoteEntity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class SampleData {

    private static final String Sample_1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Facilisis gravida neque convallis a cras semper auctor neque.";
    private static final String Sample_2 = "String with a \n new line.";
    private static final String Sample_3 = "Normal note";

    private static Date getDate(int offset){
        GregorianCalendar cal = new GregorianCalendar();
        cal.add(Calendar.DAY_OF_WEEK, offset);
        return cal.getTime();
    }

    public static List<NoteEntity> getNotes() {
        List<NoteEntity> notes = new ArrayList<>();
        notes.add(new NoteEntity(1, getDate(0), Sample_1));
        notes.add(new NoteEntity(2, getDate(-1), Sample_2));
        notes.add(new NoteEntity(3, getDate(-2), Sample_3));
        return notes;
    }
}
