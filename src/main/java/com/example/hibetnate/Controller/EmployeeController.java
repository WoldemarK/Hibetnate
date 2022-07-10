package com.example.hibetnate.Controller;

import com.example.hibetnate.Service.DetailService;
import com.example.hibetnate.Service.EmployeeService;
import com.example.hibetnate.model.Detail;
import com.example.hibetnate.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService service;
    //private final DetailService detailService;

    /**
     * получение списка сотрудников
     *
     * @return
     */
    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> employees = service.getAllEmployee();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    /**
     * получение сотрудника по его ID
     *
     * @param employeeId
     * @return
     */
    @GetMapping("/get/{employeeId}")
    public ResponseEntity<Optional<Employee>> getByIdEntity(@PathVariable Long employeeId ) {
//        Optional<Employee> employee = service.getByIdEmp(employeeId);
//        Optional<Detail> detail = detailService.getByIdDet(detailId);
//        Map<Optional<Employee>, Optional<Detail>> res = new HashMap<>();
//        res.put(employee,detail);
//        return new ResponseEntity<>(res,HttpStatus.CREATED);
//        Detail detail = detailService.getByIdDet(employeeId);
//        detail.getEmployee().setEmpDetail(null);
    return new ResponseEntity<>(service.getByIdEmp(employeeId), HttpStatus.OK);
    }

    /**
     * Добавление сотрудника в БД
     *
     * @param employee
     * @return
     */
    @PostMapping("/add")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee emp = service.addEmployee(employee);
        return employee != null
                ? new ResponseEntity<>(emp, HttpStatus.CREATED)
                : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
