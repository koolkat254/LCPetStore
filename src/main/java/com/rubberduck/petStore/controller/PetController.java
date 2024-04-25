package com.rubberduck.petStore.controller;


import com.rubberduck.petStore.model.Pet;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pet")
public class PetController {

    @GetMapping("create/{name}/{species}")
    public String createPetPath(@PathVariable String name, @PathVariable String species){
        return "<h1>My Pet</h1>" +
                "<h3>"+name+"</h3>" +
                "<h3>"+species+"</h3>";
    }
    @PostMapping("create")
    public String createPetRequest(@RequestParam String name, @RequestParam String species){
        Pet myPet = new Pet(name, species);
//        return myPet;


        return "<h1>My Pet</h1>" +
                "<h3>"+ myPet.getName()+"</h3>" +
                "<h3>"+myPet.getSpecies()+"</h3>";
    }

    @GetMapping("createForm")
    public String createPetForm(){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <div>\n" +
                "    <form action=\"create\" method=\"post\">\n" +
                "      <div>\n" +
                "        <label>Name: </label>\n" +
                "        <input type=\"text\" name=\"name\">\n" +
                "      </div>\n" +
                "      <div>\n" +
                "        <label>Species: </label>\n" +
                "        <input type=\"text\" name=\"species\">\n" +
                "      </div>\n" +
                "      <div>\n" +
                "        <input type=\"submit\" value=\"Create Pet\">\n" +
                "      </div>\n" +
                "    </form>\n" +
                "  </div>\n" +
                "</body>\n" +
                "</html>";
    }
}
