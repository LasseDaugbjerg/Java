public class opgave6 {
    public static void main(String[] args) {

    }
    public static class Employee {
        private String firstName;
        private String lastName;
        private double monthlySalary;

        public Employee(String first, String last, double salary) {
            firstName = first;
            lastName = last;
            monthlySalary = salary;
            if (monthlySalary <= 0.0) {
                monthlySalary = 0.0;
            }
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getMonthlySalary() {
            return monthlySalary;
        }

        public void setMonthlySalary(double newSalary) {
            if (newSalary > 0.0) {
                monthlySalary = newSalary;
            }
        }
    }

}
