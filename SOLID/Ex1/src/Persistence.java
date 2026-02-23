import java.util.List;

public interface Persistence {
    public void save(StudentRecord r);
    public int count();
    public List<StudentRecord> all();
}