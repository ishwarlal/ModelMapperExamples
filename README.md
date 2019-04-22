# ModelMapperExamples
ModelMapper Examples

Output Of ModelMapper Startegies Example

(Run ModelMapper.strategies.StartegiesMainExample.java)

################## Loose Startegy ##################

-----Actual Employee---

Employee [employeeId=1, name=ABC, email=test@yahoo.com, phone=12342134, addresses=[EmployeeAddress [employeeId=1, address=STREET 1, country=HOME Country, city=HOME City, addressType=Home], EmployeeAddress [employeeId=1, address=STREET 2, country=OFFICE Country, city=OFFICE City, addressType=OFFICE]], department=Department [departmentId=1, name=Software Development, description=Software Development]]

-----Mapped Employee---

EmployeeDTO [employeeId=1, employeeName=ABC, email=test@yahoo.com, mobilePhone=12342134, cellPhone=12342134, nickName=ABC, age=null, addresses=[EmployeeAddress [employeeId=1, employeeAddress=STREET 1, country=HOME Country, city=HOME City, addressType=Home], EmployeeAddress [employeeId=1, employeeAddress=STREET 2, country=OFFICE Country, city=OFFICE City, addressType=OFFICE]], department=Department [departmentId=1, departmentName=Software Development, description=Software Development]]




################## Standard Startegy ##################

-----Actual Employee---

Employee [employeeId=1, name=ABC, email=test@yahoo.com, phone=12342134, addresses=[EmployeeAddress [employeeId=1, address=STREET 2, country=OFFICE Country, city=OFFICE City, addressType=OFFICE], EmployeeAddress [employeeId=1, address=STREET 1, country=HOME Country, city=HOME City, addressType=Home]], department=Department [departmentId=1, name=Software Development, description=Software Development]]

-----Mapped Employee---

EmployeeDTO [employeeId=1, employeeName=ABC, email=test@yahoo.com, mobilePhone=null, cellPhone=null, nickName=null, age=null, addresses=[EmployeeAddress [employeeId=1, employeeAddress=STREET 2, country=OFFICE Country, city=OFFICE City, addressType=OFFICE], EmployeeAddress [employeeId=1, employeeAddress=STREET 1, country=HOME Country, city=HOME City, addressType=Home]], department=Department [departmentId=1, departmentName=Software Development, description=Software Development]]




################## Strict Startegy ##################

-----Actual Employee---

Employee [employeeId=1, name=ABC, email=test@yahoo.com, phone=12342134, addresses=[EmployeeAddress [employeeId=1, address=STREET 1, country=HOME Country, city=HOME City, addressType=Home], EmployeeAddress [employeeId=1, address=STREET 2, country=OFFICE Country, city=OFFICE City, addressType=OFFICE]], department=Department [departmentId=1, name=Software Development, description=Software Development]]

-----Mapped Employee---

EmployeeDTO [employeeId=1, employeeName=null, email=test@yahoo.com, mobilePhone=null, cellPhone=null, nickName=null, age=null, addresses=[EmployeeAddress [employeeId=1, employeeAddress=null, country=OFFICE Country, city=OFFICE City, addressType=OFFICE], EmployeeAddress [employeeId=1, employeeAddress=null, country=HOME Country, city=HOME City, addressType=Home]], department=Department [departmentId=1, departmentName=null, description=Software Development]]


