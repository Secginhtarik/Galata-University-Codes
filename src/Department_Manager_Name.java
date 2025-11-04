public class Department_Manager_Name {

    private Integer Finance_Department;
    private Integer Accounting_Department;
    private Integer Human_Resources;

    private Department_features department_features;

public Department_Manager_Name(Integer Finance_Department, Integer Accounting_Department, Integer Human_Resources, Department_features department_features) {
    this.Finance_Department = Finance_Department;
    this.Accounting_Department = Accounting_Department;
    this.Human_Resources = Human_Resources;
    this.department_features = department_features;

}

    public Integer getFinance_Department() {
        return Finance_Department;
    }

    public void setFinance_Department(Integer finance_Department) {
        Finance_Department = finance_Department;
    }

    public Integer getAccounting_Department() {
        return Accounting_Department;
    }

    public void setAccounting_Department(Integer accounting_Department) {
        Accounting_Department = accounting_Department;
    }

    public Integer getHuman_Resources() {
        return Human_Resources;
    }

    public void setHuman_Resources(Integer human_Resources) {
        Human_Resources = human_Resources;
    }

    public Department_features getDepartment_features() {
        return department_features;
    }

    public void setDepartment_features(Department_features department_features) {
        this.department_features = department_features;
    }
}
