public class StudentRecordMaker {
    public static StudentRecord makeRecord(FakeDb db, String name, String email, String phone, String program) {
        String id = IdUtil.nextStudentId(db.count());
        StudentRecord rec = new StudentRecord(id, name, email, phone, program);
        db.save(rec);
        return rec;
    }
}
