  class employee {
        String firstname;
        String lastname;
        double salary;
        double yearlysalary;
        employee(String a , String b , double c) {
            firstname = a;
            lastname = b;
            if(salary < 0) {
              salary = 0.0;
            }
            salary = c;
        }
        public void display()  {
          System.out.println("Firstname : " + firstname  + "\n" + "Lastname : " + lastname + "\n" +"Salary : " + salary);
        }
        public void yearlysalary() {
          yearlysalary =  salary * 12;
          System.out.println("Yearly salary  : " + yearlysalary);
        }
        public void displaysalary() {
          System.out.println("Yearly salary : " + yearlysalary);
        }
        public void raisesalary() {
          yearlysalary = yearlysalary + (yearlysalary * 10)/100;
        }
      }
    public class P13 {
    public static void main(String[] args) {
      employee e1 = new employee("Krish","Patel",50000);
      e1.display();
      e1.yearlysalary();
      e1.raisesalary();
      e1.displaysalary();
      employee e2 = new employee("Ram","Patel",70000);
      e2.display();
      e2.yearlysalary();
      e2.raisesalary(); 
      e2.displaysalary();
      System.out.println("ID : 23DCS078_KRISH PATEL");
    }
}
