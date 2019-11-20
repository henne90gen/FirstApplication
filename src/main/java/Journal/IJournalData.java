package Journal;

import java.util.List;

public interface IJournalData {

	List<Entry> getAllEntries();

	List<Entry> findByString(String text);

	List<Entry> findByDate(int day, int month, int year);

	void save(Entry entry);

	void delete(Entry entry);
}
