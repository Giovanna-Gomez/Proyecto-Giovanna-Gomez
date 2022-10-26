package com.portfolio.gg.Interface;

import com.portfolio.gg.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de personas
   public List<Persona> getPersona();
   
   //Guardar un objeto de tipo Persona
   public void savePersona (Persona persona);
   
   //Eliminar un objeto pero lo buscamos po ID
   public void deletedPersona(Long id);
   
   //Buscar una persona por ID
   public Persona findPersona(Long id);
}
