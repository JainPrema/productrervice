package com.ecommerce.productservice.service;

import com.ecommerce.productservice.dtos.GetInstructorDto;
import com.ecommerce.productservice.models.Batch;
import com.ecommerce.productservice.models.Instructor;
import com.ecommerce.productservice.models.User;
import com.ecommerce.productservice.repository.InstructorRepository;
import com.ecommerce.productservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class UserService {
    private final UserRepository userRepository;
    private final InstructorRepository instructorRepository;

    public UserService(UserRepository userRepository, InstructorRepository instructorRepository) {
        this.userRepository = userRepository;
        this.instructorRepository = instructorRepository;
    }

    public User createUser(String name,String email){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return user;

    }

    public Instructor createInstructor(String name,String email){
        Instructor instructor = new Instructor();
        instructor.setName(name);
        instructor.setEmail(email);
        instructor.setSalary(20000.0);
        instructor.setSkill("Backend");

        instructorRepository.save(instructor);
        return instructor;

    }

   public List<User> getUserByName(String Name){
       return userRepository.findByName(Name);
   }

    public List<GetInstructorDto> getInstructorByIds(List<UUID> uuid){
        List<Instructor> instructors = instructorRepository.findAllById(uuid);

        List<GetInstructorDto> instructorDtos = new ArrayList<>();
        for(Instructor instructor:instructors){
            GetInstructorDto getInstructorDto = new GetInstructorDto();
            getInstructorDto.setId(instructor.getId());
            getInstructorDto.setName(instructor.getName());
            getInstructorDto.setEmail(instructor.getEmail());

            instructorDtos.add(getInstructorDto);

        }
        return instructorDtos;
    }



    public List<GetInstructorDto> getInstructorByName(String Name){
        List<Instructor> instructors = instructorRepository.findByName(Name);

    //    for (Batch batch:instructors.get(0).getBatch()){
    //        System.out.println(batch.getName());
    //    }

        List<GetInstructorDto> instructorDtos = new ArrayList<>();
        for(Instructor instructor:instructors){
            GetInstructorDto getInstructorDto = new GetInstructorDto();
            getInstructorDto.setId(instructor.getId());
            getInstructorDto.setName(instructor.getName());
            getInstructorDto.setEmail(instructor.getEmail());
            //List<String> batchNames = new ArrayList<>();
           // List<Long> ids = new ArrayList<>();
            //for (Batch batch: instructor.getBatch()){
              //  batchNames.add(batch.getName());
                //ids.add(batch.getId());
            //}
         //   getInstructorDto.setBatchName(batchNames);
        //    getInstructorDto.setBatchId(ids);
            instructorDtos.add(getInstructorDto);

        }
        return instructorDtos;
    }


}
