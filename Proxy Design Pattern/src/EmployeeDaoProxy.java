public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDaoImpl employeeDao;

    public EmployeeDaoProxy() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDao obj) {
        if(client=="Admin"){
            employeeDao.create(client,obj);
            return;
        }
        throw new RuntimeException("Exception while creating");
    }

    @Override
    public void delete(String client, String employeeId) {
    }

    @Override
    public EmployeeDao get(String client, String employeeId) {
        return null;
    }
}
