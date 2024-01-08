public interface EmployeeDao {
    public void create(String client, EmployeeDao obj);
    public void delete(String client, String employeeId);
    public EmployeeDao get(String client, String employeeId);
}
