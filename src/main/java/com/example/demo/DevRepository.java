package com.example.demo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DevRepository {

    private final File file = new File("data/developers.json"); // fuera de resources porque me daba error 500 en postman
    private final ObjectMapper mapper = new ObjectMapper();

    // (READ)
    public List<Developer> getDevelopers() {
        try {
            if (!file.exists()) {
                file.getParentFile().mkdirs();  // crear carpeta "data" si no existe
                mapper.writeValue(file, new ArrayList<>()); // inicializar JSON vacío
            }
            return mapper.readValue(file, new TypeReference<List<Developer>>() {});
        } catch (IOException e) {
            throw new RuntimeException("Error leyendo developers.json", e);
        }
    }

    // Guardar las listas
    private void saveAll(List<Developer> developers) {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(file, developers);
        } catch (IOException e) {
            throw new RuntimeException("Error guardando developers.json", e);
        }
    }

    // Agregar (CREATE)
    public void addDeveloper(Developer developer) {
        List<Developer> developers = getDevelopers();
        developers.add(developer);
        saveAll(developers);
    }

    // Actualizar por índice (UPDATE)
    public void updateDeveloper(int index, Developer developer) {
        List<Developer> developers = getDevelopers();
        if (index >= 0 && index < developers.size()) {
            developers.set(index, developer);
            saveAll(developers);
        } else {
            throw new RuntimeException("Developer no encontrado");
        }
    }

    // Eliminar por índice (DELETE)
    public void deleteDeveloper(int index) {
        List<Developer> developers = getDevelopers();
        if (index >= 0 && index < developers.size()) {
            developers.remove(index);
            saveAll(developers);
        } else {
            throw new RuntimeException("Developer no encontrado");
        }
    }
}
