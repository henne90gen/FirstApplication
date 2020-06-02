package journal.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JournalEntry {

	public enum Mood {
		Awesome, Great, Good, Undecided, Bad, Poor, Waste
	}

	public int id;
	public LocalDateTime date;
	public String comment;
	public Mood mood;

	public JournalEntry() {
		this.id = -1;
		this.date = LocalDateTime.now();
		this.comment = "";
		this.mood = Mood.Undecided;
	}

	public JournalEntry(LocalDateTime date, Mood mood, String comment) {
		this.id = -1;
		this.date = date;
		this.comment = comment;
		this.mood = mood;
	}

	@Override
	public String toString() {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		return id + " - " + date.format(f);
	}
}