public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, EmployeeDao obj) {
        System.out.println("employee created");
    }

    @Override
    public void delete(String client, String employeeId) {
    }

    @Override
    public EmployeeDao get(String client, String employeeId) {
        return new EmployeeDaoImpl();
    }
}
