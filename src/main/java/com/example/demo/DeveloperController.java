package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/developers")
public class DeveloperController {
    @Autowired
    private DevRepository devRepository;

    @GetMapping
    public ResponseEntity<List<Developer>> getAll() {
        return ResponseEntity.ok(devRepository.getDevelopers());
    }

    // POST (Create)
    @PostMapping("/batch")
    public ResponseEntity<String> createMultiple(@RequestBody List<Developer> developers) {
        for (Developer d : developers) {
            devRepository.addDeveloper(d);
        }
        return ResponseEntity.ok("Developers agregados");
    }

    // PUT (Update)
    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable int id, @RequestBody Developer developer) {
        devRepository.updateDeveloper(id, developer);
        return ResponseEntity.ok("Developer actualizado");
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        devRepository.deleteDeveloper(id);
        return ResponseEntity.ok("Developer eliminado");
    }
}





