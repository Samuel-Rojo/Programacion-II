public class ValidacionContraseña {
    public static void ValidarContraseña(String contraseña) throws ExcepcionPersonalizada{
   if (contraseña== null || contraseña.isEmpty()){  //pongo un or para no hacer 2 if
       throw new IllegalArgumentException("¡Error! la contraseña no puede ser nula/vacia, por favor intente nuevamente...");
   }
   if (contraseña.length()<=8){
       throw new ExcepcionPersonalizada("¡Ups! la contraseña debe tener mas de 8 caracteres, por favor vuele a intentarlo!!");
   }
   if (!contraseña.matches(".*\\d.*")){
       throw new ExcepcionPersonalizada("¡Algo salio mal! la contraseña debe tener al menos 1 numero, por favor intentalo nuevamente!");
}
        System.out.println("¡Felicitaciones! La contraseña es valida");
    }
}
