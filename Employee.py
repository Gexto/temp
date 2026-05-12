class Employee:
    def __init__(self, name, emp_id, salary):
        self.name = name
        self.emp_id = emp_id
        self.salary = salary

    def get_name(self):
        return self.name
    def get_emp_id(self):
        return self.emp_id
    def get_salary(self):
        return self.salary

class Department:
    def __init__(self, name, dept_id):
        self.name = name
        self.dept_id = dept_id

    def get_name(self):
        return self.name
    def get_dept_id(self):
        return self.dept_id
    
def print_employees(employees):
    for emp in employees:
        print("--------------------------")
        print(
            f"Name: {emp.get_name()}, "
            f"ID: {emp.get_emp_id()},"
            f"Salary: ${emp.get_salary()},"
        )
#main program
employees = []

employees.append(Employee("Alice", 1, 50000))
employees.append(Employee("Alx", 101, 55000))
employees.append(Employee("Zeus", 103, 71000))

dept = Department("HR", 101)

print_employees(employees)

