public interface Persistence {
    void save(String name, String content);
    int countLines(String name);
}
