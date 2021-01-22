package com.example.demo.controller;
import com.example.demo.domain.Student;
import com.example.demo.exeption.ApiExeptionHandler;
import com.example.demo.exeption.ApiRequesExeption;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController extends RuntimeException{
  private final StudentService studentService;

  @GetMapping(value = "/{id}")
  public Student findById (@PathVariable  Long id){
    return studentService.findByd(id);
  }
  @PostMapping(value = "/save")
    public Student save (Student student){
      student.setAge(5);
      student.setClassRoom("525");

      if (student.getName().length()<3){
         throw  new ApiRequesExeption("Siz burda stduente name stlememsiz");
      } else{
          return studentService.save(student);
      }
  }
  @GetMapping (value = "/fidAll")
  public List<Student> findAll(){
      return  studentService.findAll();
  }

  @GetMapping (value="/deleteById")
    public void deleteById(Long deleteByid)
  {
       studentService.deleteById(deleteByid);
  }

}
