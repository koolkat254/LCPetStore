package com.rubberduck.petStore.controller;


import com.rubberduck.petStore.model.Pet;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pet")
public class PetController {

    @GetMapping("create/{name}/{species}")
    public String createPetPath(@PathVariable String name, @PathVariable String species) {
        return "<h1>My Pet</h1>" +
                "<h3>" + name + "</h3>" +
                "<h3>" + species + "</h3>";
    }

    @PostMapping("create")
    public String createPetRequest(@RequestParam String name, @RequestParam String species) {
//        Pet myPet = new Pet(name, species);
//        return myPet;

        return "<h1>My Pet</h1>" +
                "<h3>" + name + "</h3>" +
                "<h3>" + species + "</h3>";
    }

    @GetMapping("createForm")
    public String createPetForm() {
        return "";
    }
}
