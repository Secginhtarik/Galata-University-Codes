public class Main {
    public static void main(String[] args) {

                Department_features financeFeatures = new Department_features();
                financeFeatures.setDepartmentManagerName("Ahmet Yılmaz");
                financeFeatures.setSpecializedFunction("Financial Analysis");
                financeFeatures.setDepartmentGoal("Optimize company spending");
                financeFeatures.setBudgetaryPlanning(500000);
                financeFeatures.setHeadcount(12);


                Rabbit_Company rabbitCompany = new Rabbit_Company(
                        "Rabbit Company",
                        "Istanbul",
                        120,
                        3,
                        2,
                        1,
                        financeFeatures
                );

                System.out.println("Company: " + rabbitCompany.getCompanyName());
                System.out.println("Location: " + rabbitCompany.getCompanyLocation());
                System.out.println("----- Department Details -----");
                rabbitCompany.getDepartment_features().printDepartmentFeatures();
            }
        }










