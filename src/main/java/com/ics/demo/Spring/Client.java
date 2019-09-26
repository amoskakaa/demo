//package com.ics.demo.Spring;
//
//import com.ics.demo.Spring.Models.University;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//
//@Component
//public class Client implements CommandLineRunner {
//    private final FeignRestClient feignRestClient;
//
//    public Client(FeignRestClient feignRestClient) {
//        this.feignRestClient = feignRestClient;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<List<University>> response = restTemplate.exchange("http://10.51.10.111:9090/universities",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<University>>(){});
//                List<University> universities = response.getBody();
////                System.out.println("Response:"+universities.toString());
//
////                University university =restTemplate.getForObject("http://10.51.10.111:9090/universities/1", University.class);
//
////                String url = "http://10.51.10.111:9090/universities/search?name="+university.getName();
////                University search =restTemplate.getForObject(url, University.class);
//
//
//                //Fetching
//                universities=feignRestClient.getAllUniversities();
//                System.out.println("Feign Universities:"+universities.toString());
//
//                //Create University
//                 University createdUniversity = feignRestClient.createUniversity(new University("Strathmore","Ole Sangale","2020"));
//                 System.out.println("Created University:"+createdUniversity.toString());
//
//
//                 //Updating
//                University updateUniversity = new University("Amos","Kamau","2002");
//                updateUniversity = feignRestClient.update(createdUniversity.getId(),updateUniversity);
//                System.out.println("Updated University:"+updateUniversity.toString());
//
//    }
//}
